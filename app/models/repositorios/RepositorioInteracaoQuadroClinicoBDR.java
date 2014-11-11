package models.repositorios;

import models.entidades.InteracaoQuadroClinico;

public class RepositorioInteracaoQuadroClinicoBDR implements IRepositorioInteracaoQuadroClinico{

	public InteracaoQuadroClinico getInteracaoQuadroClinico(long idFarmaco, long idQuadroClinico) {
		InteracaoQuadroClinico interacaoQuadroClinico = InteracaoQuadroClinico.find.where().eq("farmaco_id_farmaco", idFarmaco).
																							eq("quadro_clinico_id_quadro_clinico", idQuadroClinico).findUnique();
		
		return interacaoQuadroClinico;
	}
}
