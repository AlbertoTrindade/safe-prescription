package models.cadastros;

import java.util.ArrayList;
import java.util.List;

import models.entidades.Farmaco;
import models.entidades.InteracaoQuadroClinico;
import models.entidades.Medicamento;
import models.entidades.QuadroClinico;
import models.repositorios.IRepositorioInteracaoQuadroClinico;

public class CadastroInteracaoQuadroClinico {
	
	private IRepositorioInteracaoQuadroClinico repositorioInteracaoQuadroClinico;
	
	public CadastroInteracaoQuadroClinico(IRepositorioInteracaoQuadroClinico repositorioInteracaoQuadroClinico){
		this.repositorioInteracaoQuadroClinico = repositorioInteracaoQuadroClinico;
	}
	
	public List<InteracaoQuadroClinico> verificarInteracoesQuadroClinico(List<Medicamento> medicamentos, List<QuadroClinico> quadrosClinicos){
		List<InteracaoQuadroClinico> interacoesQuadroClinico = new ArrayList<InteracaoQuadroClinico>();
		
		for(Medicamento medicamento : medicamentos){
			for(Farmaco farmaco : medicamento.getFarmacos()){
				for(QuadroClinico quadroClinico : quadrosClinicos){
					InteracaoQuadroClinico interacaoQuadroClinico = repositorioInteracaoQuadroClinico.getInteracaoQuadroClinico(farmaco.getIdFarmaco(), quadroClinico.getIdQuadroClinico());
					
					if(interacaoQuadroClinico != null && !interacoesQuadroClinico.contains(interacaoQuadroClinico)){
						interacoesQuadroClinico.add(interacaoQuadroClinico);
					}
				}
			}
		}
		
		return interacoesQuadroClinico;
	}
}
