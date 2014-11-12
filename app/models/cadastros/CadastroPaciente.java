package models.cadastros;

import java.util.List;

import models.entidades.Paciente;
import models.repositorios.IRepositorioPaciente;

public class CadastroPaciente {
	
	private IRepositorioPaciente repositorioPaciente;
	
	public CadastroPaciente(IRepositorioPaciente repositorioPaciente){
		this.repositorioPaciente = repositorioPaciente;
	}
	
	public boolean verificarPaciente(Paciente paciente){
		return !repositorioPaciente.existePaciente(paciente.getCpf());
	}
	
	public void adicionarPaciente(Paciente paciente){
		repositorioPaciente.adicionarPaciente(paciente);
	}
	
	public List<Paciente> listarPacientes(){
		return repositorioPaciente.listarPacientes();
	}
}
