package models.repositorios;

import java.util.List;

import models.entidades.Medicamento;

public class RepositorioMedicamentoBDR implements IRepositorioMedicamento{

	public List<Medicamento> listarMedicamentos() {
		return Medicamento.find.all();
	}
}
