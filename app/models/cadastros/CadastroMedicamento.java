package models.cadastros;

import java.util.List;

import models.entidades.Medicamento;
import models.repositorios.IRepositorioMedicamento;

public class CadastroMedicamento {
	
	private IRepositorioMedicamento repositorioMedicamento;
	
	public CadastroMedicamento(IRepositorioMedicamento repositorioMedicamento){
		this.repositorioMedicamento = repositorioMedicamento;
	}

	public List<Medicamento> listarMedicamentos(){
		return repositorioMedicamento.listarMedicamentos();
	}
}
