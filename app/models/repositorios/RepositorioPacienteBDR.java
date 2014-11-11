package models.repositorios;

import java.util.List;

import models.entidades.Paciente;

public class RepositorioPacienteBDR implements IRepositorioPaciente{

	public boolean existePaciente(String cpf) {
		Paciente paciente = Paciente.find.where().eq("cpf", cpf).findUnique();
		
		return (paciente != null);
	}

	public void adicionarPaciente(Paciente paciente) {
		paciente.save();
	}

	public List<Paciente> listarPacientes() {
		return Paciente.find.all();
	}
}
