package models.controladores;

import java.util.List;

import models.cadastros.CadastroFarmaco;
import models.cadastros.CadastroPaciente;
import models.cadastros.CadastroQuadroClinico;
import models.entidades.Farmaco;
import models.entidades.Paciente;
import models.entidades.QuadroClinico;
import models.repositorios.FabricaRepositoriosAbstrata;
import models.repositorios.IRepositorioFarmaco;
import models.repositorios.IRepositorioPaciente;
import models.repositorios.IRepositorioQuadroClinico;

public class ControladorPaciente {

	private CadastroPaciente cadastroPaciente;
	private CadastroFarmaco cadastroFarmaco;
	private CadastroQuadroClinico cadastroQuadroClinico;
	
	public ControladorPaciente(FabricaRepositoriosAbstrata fabricaRepositorios){
		IRepositorioPaciente repositorioPaciente = fabricaRepositorios.criarRepositorioPaciente();
		IRepositorioFarmaco repositorioFarmaco = fabricaRepositorios.criarRepositorioFarmaco();
		IRepositorioQuadroClinico repositorioQuadroClinico = fabricaRepositorios.criarRepositorioQuadroClinico();
		
		cadastroPaciente = new CadastroPaciente(repositorioPaciente);
		cadastroFarmaco = new CadastroFarmaco(repositorioFarmaco);
		cadastroQuadroClinico = new CadastroQuadroClinico(repositorioQuadroClinico);
	}
	
	public void cadastrarPaciente(Paciente paciente){
		cadastroPaciente.adicionarPaciente(paciente);
	}
	
	public List<QuadroClinico> listarQuadrosClinicos(){
		return cadastroQuadroClinico.listarQuadrosClinicos();
	}
	
	public List<Farmaco> listarFarmacos(){
		return cadastroFarmaco.listarFarmacos();
	}
}