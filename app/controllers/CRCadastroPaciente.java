package controllers;

import play.mvc.*;
import models.Fachada;
import java.util.List;
import models.entidades.QuadroClinico;
import models.entidades.Farmaco;
import views.ListViewModel;


public class CRCadastroPaciente extends Controller {

	private static Fachada fachada= Fachada.getInstancia();

	public static Result index() {
		 

		List<QuadroClinico> quadroList = fachada.listarQuadrosClinicos();
		List<Farmaco> farmacoList = fachada.listarFarmacos();

		ListViewModel listView = new ListViewModel(farmacoList,quadroList);		

		return ok(views.html.cadastrar_paciente.render(listView));
	}

	public static Result cadastrarPaciente() {

		return TODO;
	}

}
