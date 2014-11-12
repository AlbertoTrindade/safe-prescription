package controllers;

import play.Logger;
import play.mvc.*;
import models.Fachada;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.avaje.ebeaninternal.server.persist.BindValues.Value;

import models.entidades.Endereco;
import models.entidades.Paciente;
import models.entidades.QuadroClinico;
import models.entidades.Farmaco;
import views.CadastrarPacienteModelView;


public class CRCadastroPaciente extends Controller {

	private static Fachada fachada= Fachada.getInstancia();

	public static Result index() {
		 

		List<QuadroClinico> quadroList = fachada.listarQuadrosClinicos();
		List<Farmaco> farmacoList = fachada.listarFarmacos();

		CadastrarPacienteModelView listView = new CadastrarPacienteModelView(farmacoList,quadroList);		

		return ok(views.html.cadastrar_paciente.render(listView));
	}

	public static Result cadastrarPaciente() {
		
		final Map<String, String[]> values = request().body().asFormUrlEncoded();
		
		Endereco endereco = new Endereco(values.get("estado")[0],
				values.get("cidade")[0],
				Integer.valueOf(values.get("numero")[0]),
				values.get("bairro")[0],
				values.get("logradouro")[0]);
		
		List<QuadroClinico> bancoListaQuadro = Fachada.getInstancia().listarQuadrosClinicos();
				
		List<QuadroClinico> listaQuadro = new ArrayList<QuadroClinico>();
		
		String[] quadrosSelecionados = values.get("quadro_clinico");
		
		for(QuadroClinico quadro: bancoListaQuadro){
			
			for(String quadroSelecionado :quadrosSelecionados){
				
				if(quadroSelecionado.equals(String.valueOf(quadro.getIdQuadroClinico()))){
					
					listaQuadro.add(quadro);
				}
				
			}
			
		}
		
		List<Farmaco> bancoListaFarmaco = Fachada.getInstancia().listarFarmacos();
		
		List<Farmaco> listaFarmaco = new ArrayList<Farmaco>();
		
		String[] farmacosSelecionados = values.get("alergia");
		
		for(Farmaco farmaco: bancoListaFarmaco){
			
			for(String farmacoSelecionado :farmacosSelecionados){
				
				if(farmacoSelecionado.equals(String.valueOf(farmaco.getIdFarmaco()))){
					
					listaFarmaco.add(farmaco);
				}
				
			}
			
		}
		
		Paciente paciente = new Paciente(values.get("nome")[0],
				endereco, values.get("cpf")[0],
				values.get("data_nasc")[0],
				values.get("tel_fixo")[0],
				values.get("tel_celular")[0],
				listaQuadro ,
				listaFarmaco);
		
		boolean go =  Fachada.getInstancia().cadastrarPaciente(paciente);
		
		Logger.info(String.valueOf(go));
		
		return TODO;
	}

}
