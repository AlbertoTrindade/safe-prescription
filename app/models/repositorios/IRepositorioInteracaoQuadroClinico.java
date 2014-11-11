package models.repositorios;

import models.entidades.InteracaoQuadroClinico;

public interface IRepositorioInteracaoQuadroClinico {
	
	public InteracaoQuadroClinico getInteracaoQuadroClinico(long idFarmaco, long idQuadroClinico);
}
