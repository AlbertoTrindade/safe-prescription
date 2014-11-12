package models.controladores;

import java.util.ArrayList;
import java.util.List;

import models.cadastros.CadastroFarmaco;
import models.cadastros.CadastroInteracaoFarmaco;
import models.cadastros.CadastroInteracaoQuadroClinico;
import models.cadastros.CadastroMedicamento;
import models.cadastros.CadastroPaciente;
import models.entidades.Farmaco;
import models.entidades.InteracaoFarmaco;
import models.entidades.InteracaoQuadroClinico;
import models.entidades.Medicamento;
import models.entidades.Paciente;
import models.entidades.Prescricao;
import models.entidades.PrescricaoItem;
import models.repositorios.FabricaRepositoriosAbstrata;
import models.repositorios.IRepositorioFarmaco;
import models.repositorios.IRepositorioInteracaoFarmaco;
import models.repositorios.IRepositorioInteracaoQuadroClinico;
import models.repositorios.IRepositorioMedicamento;
import models.repositorios.IRepositorioPaciente;

public class ControladorPrescricaoMedicamentos {
	
	private CadastroPaciente cadastroPaciente;
	private CadastroMedicamento cadastroMedicamento;
	private CadastroInteracaoFarmaco cadastroInteracaoFarmaco;
	private CadastroInteracaoQuadroClinico cadastroInteracaoQuadroClinico;
	private CadastroFarmaco cadastroFarmaco;
	
	public ControladorPrescricaoMedicamentos(FabricaRepositoriosAbstrata fabricaRepositorios){
		IRepositorioPaciente repositorioPaciente = fabricaRepositorios.criarRepositorioPaciente();
		IRepositorioMedicamento repositorioMedicamento = fabricaRepositorios.criarRepositorioMedicamento();
		IRepositorioInteracaoFarmaco repositorioInteracaoFarmaco = fabricaRepositorios.criarRepositorioInteracaoFarmaco();
		IRepositorioInteracaoQuadroClinico repositorioInteracaoQuadroClinico = fabricaRepositorios.criarRepositorioInteracaoQuadroClinico();
		IRepositorioFarmaco repositorioFarmaco = fabricaRepositorios.criarRepositorioFarmaco();
		
		cadastroPaciente = new CadastroPaciente(repositorioPaciente);
		cadastroMedicamento = new CadastroMedicamento(repositorioMedicamento);
		cadastroInteracaoFarmaco = new CadastroInteracaoFarmaco(repositorioInteracaoFarmaco);
		cadastroInteracaoQuadroClinico = new CadastroInteracaoQuadroClinico(repositorioInteracaoQuadroClinico);
		cadastroFarmaco = new CadastroFarmaco(repositorioFarmaco);
	}
	
	public Prescricao prescreverMedicamentos(Prescricao prescricao){
		List<Medicamento> medicamentos = getMedicamentos(prescricao.getPrescricaoItems());
		
		List<InteracaoFarmaco> interacoesFarmaco = cadastroInteracaoFarmaco.verificarInteracoesFarmaco(medicamentos);
		List<InteracaoQuadroClinico> interacoesQuadroClinico = cadastroInteracaoQuadroClinico.verificarInteracoesQuadroClinico(medicamentos, prescricao.getPaciente().getQuadrosClinicos());
		List<Farmaco> alergias = cadastroFarmaco.verificarAlergias(medicamentos, prescricao.getPaciente().getAlergias());
	
		prescricao.setInteracoesFarmaco(interacoesFarmaco);
		prescricao.setInteracoesQuadroClinico(interacoesQuadroClinico);
		prescricao.setAlergias(alergias);
		
		return prescricao;
	}
	
	public List<Paciente> listarPacientes(){
		return cadastroPaciente.listarPacientes();
	}
	
	public List<Medicamento> listarMedicamentos(){
		return cadastroMedicamento.listarMedicamentos();
	}
	
	private List<Medicamento> getMedicamentos(List<PrescricaoItem> prescricaoItems){
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
		
		for(PrescricaoItem prescricaoItem : prescricaoItems){
			medicamentos.add(prescricaoItem.getMedicamento());
		}
		
		return medicamentos;
	}
}
