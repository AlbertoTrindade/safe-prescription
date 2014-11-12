package models;

import java.util.List;

import models.controladores.ControladorPaciente;
import models.controladores.ControladorPrescricaoMedicamentos;
import models.entidades.Farmaco;
import models.entidades.Medicamento;
import models.entidades.Paciente;
import models.entidades.Prescricao;
import models.entidades.QuadroClinico;
import models.repositorios.FabricaRepositoriosAbstrata;

public class Fachada {

	private static Fachada instancia;
	private ControladorPaciente controladorPaciente;
	private ControladorPrescricaoMedicamentos controladorPrescricaoMedicamentos;
	
	private Fachada(){
		FabricaRepositoriosAbstrata fabricaRepositorios = FabricaRepositoriosAbstrata.getFabrica();
		
		controladorPaciente = new ControladorPaciente(fabricaRepositorios);
		controladorPrescricaoMedicamentos = new ControladorPrescricaoMedicamentos(fabricaRepositorios);
	}
	
	public static synchronized Fachada getInstancia(){
		if(instancia == null){
			instancia = new Fachada();
		}
		
		return instancia;
	}
	
	public void cadastrarPaciente(Paciente paciente){
		controladorPaciente.cadastrarPaciente(paciente);
	}
	
	public List<QuadroClinico> listarQuadrosClinicos(){
		return controladorPaciente.listarQuadrosClinicos();
	}
	
	public List<Farmaco> listarFarmacos(){
		return controladorPaciente.listarFarmacos();
	}
	
	public Prescricao prescreverMedicamentos(Prescricao prescricao){
		return controladorPrescricaoMedicamentos.prescreverMedicamentos(prescricao);
	}
	
	public List<Paciente> listarPacientes(){
		return controladorPrescricaoMedicamentos.listarPacientes();
	}
	
	public List<Medicamento> listarMedicamentos(){
		return controladorPrescricaoMedicamentos.listarMedicamentos();
	}
}