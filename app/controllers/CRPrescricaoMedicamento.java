package controllers;

import play.mvc.*;
import models.Fachada;
import java.util.List;
import models.entidades.Paciente;
import models.entidades.Medicamento;
import views.PrescreverMedicamentoModeView;

public class CRPrescricaoMedicamento extends Controller {

	private static Fachada fachada= Fachada.getInstancia();


	public static Result index() {

		List<Paciente> listPaciente = fachada.listarPacientes();
		List<Medicamento> listMedicamento = fachada.listarMedicamentos();
		PrescreverMedicamentoModeView modeView = new PrescreverMedicamentoModeView(listPaciente,listMedicamento);

		return ok(views.html.prescrever_medicamento.render(modeView));
	}

	public static Result prescreverMedicamento() {

		return TODO;

	}

}
