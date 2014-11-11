package models.entidades;

public class PrescricaoItem {
	
	private Medicamento medicamento;
	private String posologia;
	private String via;
	
	public PrescricaoItem(Medicamento medicamento, String posologia, String via) {
		this.medicamento = medicamento;
		this.posologia = posologia;
		this.via = via;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public String getPosologia() {
		return posologia;
	}

	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}
}
