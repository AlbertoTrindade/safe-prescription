package controllers;

import play.mvc.*;


public class CRCadastroPaciente extends Controller {

	public static Result index() {

		return ok(views.html.cadastrar_paciente.render());
	}

	public static Result cadastrarPaciente() {

		return TODO;
	}

}
