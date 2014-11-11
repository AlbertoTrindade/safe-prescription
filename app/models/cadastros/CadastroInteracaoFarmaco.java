package models.cadastros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import models.entidades.Farmaco;
import models.entidades.InteracaoFarmaco;
import models.entidades.Medicamento;
import models.repositorios.IRepositorioInteracaoFarmaco;

public class CadastroInteracaoFarmaco {
	
	private IRepositorioInteracaoFarmaco repositorioInteracaoFarmaco;
	
	public CadastroInteracaoFarmaco(IRepositorioInteracaoFarmaco repositorioInteracaoFarmaco){
		this.repositorioInteracaoFarmaco = repositorioInteracaoFarmaco;
	}

	public List<InteracaoFarmaco> verificarInteracoesFarmaco(List<Medicamento> medicamentos){
		List<InteracaoFarmaco> interacoesFarmaco = new ArrayList<InteracaoFarmaco>();
		Set<Farmaco> medicamentoFarmacosConjunto = new HashSet<Farmaco>();
		
		for(Medicamento medicamento : medicamentos){
			medicamentoFarmacosConjunto.addAll(medicamento.getFarmacos());
		}
		
		List<Farmaco> medicamentoFarmacos = new ArrayList<Farmaco>(medicamentoFarmacosConjunto);
		
		for(Farmaco farmaco1 : medicamentoFarmacos){
			for(Farmaco farmaco2 : medicamentoFarmacos){
				InteracaoFarmaco interacaoFarmaco = repositorioInteracaoFarmaco.getInteracaoFarmaco(farmaco1.getIdFarmaco(), farmaco2.getIdFarmaco());
				
				if(interacaoFarmaco != null && !interacoesFarmaco.contains(interacaoFarmaco)){
					interacoesFarmaco.add(interacaoFarmaco);
				}
			}
		}
		
		return interacoesFarmaco;
	}
}
