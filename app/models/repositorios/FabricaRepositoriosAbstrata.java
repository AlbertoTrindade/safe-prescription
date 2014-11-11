package models.repositorios;

import play.Play;

public abstract class FabricaRepositoriosAbstrata {

	public static FabricaRepositoriosAbstrata getFabrica(){
		String tipoRepositorio = Play.application().configuration().getString("repository.type");
		
		if (tipoRepositorio.equals("BDR")){
			return new FabricaRepositoriosBDR();
		}
		else{
			return null;
		}
	}
	
	public abstract IRepositorioPaciente criarRepositorioPaciente();
	
	public abstract IRepositorioFarmaco criarRepositorioFarmaco();
	
	public abstract IRepositorioQuadroClinico criarRepositorioQuadroClinico();
	
	public abstract IRepositorioMedicamento criarRepositorioMedicamento();
	
	public abstract IRepositorioInteracaoQuadroClinico criarRepositorioInteracaoQuadroClinico();
	
	public abstract IRepositorioInteracaoFarmaco criarRepositorioInteracaoFarmaco();
}
