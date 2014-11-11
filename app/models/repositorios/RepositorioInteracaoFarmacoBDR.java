package models.repositorios;

import models.entidades.InteracaoFarmaco;

public class RepositorioInteracaoFarmacoBDR implements IRepositorioInteracaoFarmaco{

	public InteracaoFarmaco getInteracaoFarmaco(long idFarmaco1, long idFarmaco2) {
		InteracaoFarmaco interacaoFarmaco1 = InteracaoFarmaco.find.where().eq("farmaco1_id_farmaco", idFarmaco1).
				 														   eq("farmaco2_id_farmaco", idFarmaco2).findUnique();
		InteracaoFarmaco interacaoFarmaco2 = InteracaoFarmaco.find.where().eq("farmaco2_id_farmaco", idFarmaco1).
				   														   eq("farmaco1_id_farmaco", idFarmaco2).findUnique();
		
		if(interacaoFarmaco1 != null){
			return interacaoFarmaco1;
		}
		else{
			return interacaoFarmaco2;
		}
	}
}
