package controllers;

import play.mvc.*;

public class CRPrescricaoMedicamento extends Controller {

	public static Result index() {

		return ok(views.html.prescrever_medicamento.render());
	}

	public static Result prescreverMedicamento() {

		return TODO;

	}

}
