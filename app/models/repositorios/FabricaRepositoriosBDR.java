package models.repositorios;

public class FabricaRepositoriosBDR extends FabricaRepositoriosAbstrata {

	public IRepositorioPaciente criarRepositorioPaciente() {
		return new RepositorioPacienteBDR();
	}

	public IRepositorioFarmaco criarRepositorioFarmaco() {
		return new RepositorioFarmacoBDR();
	}

	public IRepositorioQuadroClinico criarRepositorioQuadroClinico() {
		return new RepositorioQuadroClinicoBDR();
	}

	public IRepositorioMedicamento criarRepositorioMedicamento() {
		return new RepositorioMedicamentoBDR();
	}

	public IRepositorioInteracaoQuadroClinico criarRepositorioInteracaoQuadroClinico() {
		return new RepositorioInteracaoQuadroClinicoBDR();
	}

	public IRepositorioInteracaoFarmaco criarRepositorioInteracaoFarmaco() {
		return new RepositorioInteracaoFarmacoBDR();
	}
}