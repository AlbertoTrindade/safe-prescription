package models.cadastros;

import java.util.ArrayList;
import java.util.List;

import models.entidades.Farmaco;
import models.entidades.Medicamento;
import models.repositorios.IRepositorioFarmaco;

public class CadastroFarmaco {
	
	private IRepositorioFarmaco repositorioFarmaco;
	
	public CadastroFarmaco(IRepositorioFarmaco repositorioFarmaco){
		this.repositorioFarmaco = repositorioFarmaco;
	}
	
	public List<Farmaco> listarFarmacos(){
		return repositorioFarmaco.listarFarmacos();
	}
	
	public List<Farmaco> verificarAlergias(List<Medicamento> medicamentos, List<Farmaco> farmacos){
		List<Farmaco> farmacosAlergia = new ArrayList<Farmaco>();
		
		for(Medicamento medicamento : medicamentos){
			for(Farmaco medicamentoFarmaco : medicamento.getFarmacos()){
				for(Farmaco farmaco : farmacos){
					if(farmaco.getIdFarmaco() == medicamentoFarmaco.getIdFarmaco() && !farmacosAlergia.contains(farmaco)){
						farmacosAlergia.add(farmaco);
					}
				}
			}
		}
		
		return farmacosAlergia;
	}
}
