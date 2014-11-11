package models.repositorios;

import models.entidades.InteracaoFarmaco;

public interface IRepositorioInteracaoFarmaco {
	
	public InteracaoFarmaco getInteracaoFarmaco(long idFarmaco1, long idFarmaco2);
}
