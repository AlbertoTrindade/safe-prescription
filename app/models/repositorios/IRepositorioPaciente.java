package models.repositorios;

import java.util.List;

import models.entidades.Paciente;

public interface IRepositorioPaciente {
	
	public boolean existePaciente(String cpf);
	
	public void adicionarPaciente(Paciente paciente);
	
	public List<Paciente> listarPacientes();
}
