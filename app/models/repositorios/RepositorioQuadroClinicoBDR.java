package models.repositorios;

import java.util.List;

import models.entidades.QuadroClinico;

public class RepositorioQuadroClinicoBDR implements IRepositorioQuadroClinico{

	public List<QuadroClinico> listarQuadrosClinicos() {
		return QuadroClinico.find.all();
	}

}
