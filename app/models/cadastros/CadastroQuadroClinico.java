package models.cadastros;

import java.util.List;

import models.entidades.QuadroClinico;
import models.repositorios.IRepositorioQuadroClinico;

public class CadastroQuadroClinico {
	
	private IRepositorioQuadroClinico repositorioQuadroClinico;
	
	public CadastroQuadroClinico(IRepositorioQuadroClinico repositorioQuadroClinico){
		this.repositorioQuadroClinico = repositorioQuadroClinico;
	}

	public List<QuadroClinico> listarQuadrosClinicos(){
		return repositorioQuadroClinico.listarQuadrosClinicos();
	}
}
