package controllers;

import play.Logger;
import play.mvc.*;
import models.Fachada;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.entidades.Paciente;
import models.entidades.Medicamento;
import models.entidades.Prescricao;
import models.entidades.PrescricaoItem;
import models.entidades.QuadroClinico;
import views.PrescreverMedicamentoModelView;

public class CRPrescricaoMedicamento extends Controller {

	private static Fachada fachada= Fachada.getInstancia();


	public static Result index() {

		List<Paciente> listPaciente = fachada.listarPacientes();
		List<Medicamento> listMedicamento = fachada.listarMedicamentos();
		PrescreverMedicamentoModelView modeView = new PrescreverMedicamentoModelView(listPaciente,listMedicamento);

		return ok(views.html.prescrever_medicamento.render(modeView));
	}

	public static Result prescreverMedicamento() {
		final Map<String, String[]> values = request().body().asFormUrlEncoded();
		
		Paciente pacienteSelecionado = null;
		
		for(Paciente paciente : Fachada.getInstancia().listarPacientes()){
			
			if(paciente.getIdPaciente()==Integer.valueOf(values.get("paciente")[0])){
				pacienteSelecionado=paciente;
			}			
		}
		
		String[] medicamentos = values.get("medicamento");
		
		String[] posologia = values.get("posologia");
		
		String[] via = values.get("via");
		
		List<Medicamento> bancoListaMedicamentos = Fachada.getInstancia().listarMedicamentos();
		
		List<Medicamento> listaMedicamento = new ArrayList<Medicamento>();
		
		String[] medicamentosSelecionados = values.get("medicamento");
		
		for(Medicamento medicamento: bancoListaMedicamentos){
			
			for(String medicamentoSelecionado :medicamentosSelecionados){
				
				if(medicamentoSelecionado.equals(String.valueOf(medicamento.getIdMedicamento()))){
					
					listaMedicamento.add(medicamento);
				}
				
			}
			
		}
		
		
		
		List<PrescricaoItem> lista = new ArrayList<PrescricaoItem>();
		
		Logger.info(String.valueOf(listaMedicamento.size()));
		
		for(int i=0;i<listaMedicamento.size();i++){
			
			
			Logger.info(posologia[i]);
			Logger.info(via[i]);
			lista.add(new PrescricaoItem(listaMedicamento.get(i), posologia[i], via[i]));
			
		}
		
		Prescricao prescricao = new Prescricao(pacienteSelecionado,lista);
		
		Prescricao prescricaoFinal= Fachada.getInstancia().prescreverMedicamentos(prescricao);	
		
		
		return ok(views.html.visualizar_prescricao.render(prescricaoFinal));

	}

}
