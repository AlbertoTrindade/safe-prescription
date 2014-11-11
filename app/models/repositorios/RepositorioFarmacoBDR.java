package models.repositorios;

import java.util.List;

import models.entidades.Farmaco;

public class RepositorioFarmacoBDR implements IRepositorioFarmaco{

	public List<Farmaco> listarFarmacos() {
		return Farmaco.find.all();
	}
}
