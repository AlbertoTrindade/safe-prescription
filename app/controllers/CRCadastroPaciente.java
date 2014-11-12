package controllers;

import play.mvc.*;
import models.Fachada;
import java.util.List;
import java.util.Map;
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
		
		
		
		return TODO;
	}

}
