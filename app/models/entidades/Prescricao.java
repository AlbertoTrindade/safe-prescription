package models.entidades;

import java.util.List;

public class Prescricao {

	private Paciente paciente;
	private List<PrescricaoItem> prescricaoItems;
	private List<InteracaoFarmaco> interacoesFarmaco;
	private List<InteracaoQuadroClinico> interacoesQuadroClinico;
	private List<Farmaco> alergias;
	
	public Prescricao(Paciente paciente, List<PrescricaoItem> prescricaoItems, List<InteracaoFarmaco> interacoesFarmaco, List<InteracaoQuadroClinico> interacoesQuadroClinico, List<Farmaco> alergias){
		this.paciente = paciente;
		this.prescricaoItems = prescricaoItems;
		this.interacoesFarmaco = interacoesFarmaco;
		this.interacoesQuadroClinico = interacoesQuadroClinico;
		this.alergias = alergias;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<PrescricaoItem> getPrescricaoItems() {
		return prescricaoItems;
	}

	public void setPrescricaoItems(List<PrescricaoItem> prescricaoItems) {
		this.prescricaoItems = prescricaoItems;
	}

	public List<InteracaoFarmaco> getInteracoesFarmaco() {
		return interacoesFarmaco;
	}

	public void setInteracoesFarmaco(List<InteracaoFarmaco> interacoesFarmaco) {
		this.interacoesFarmaco = interacoesFarmaco;
	}

	public List<InteracaoQuadroClinico> getInteracoesQuadroClinico() {
		return interacoesQuadroClinico;
	}

	public void setInteracoesQuadroClinico(
			List<InteracaoQuadroClinico> interacoesQuadroClinico) {
		this.interacoesQuadroClinico = interacoesQuadroClinico;
	}

	public List<Farmaco> getAlergias() {
		return alergias;
	}

	public void setAlergias(List<Farmaco> alergias) {
		this.alergias = alergias;
	}
}
