package models.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Medicamento extends Model{
	
	@Id
	private long idMedicamento;
	
	@Required
	private String nome;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "medicamento_farmaco")
	private List<Farmaco> farmacos;
	
	public Medicamento(String nome, List<Farmaco> farmacos){
		this.nome = nome;
		this.farmacos = farmacos;
	}
	
	public static Model.Finder<Long, Medicamento> find = new Finder<Long, Medicamento>(Long.class, Medicamento.class);
	
	public long getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Farmaco> getFarmacos() {
		return farmacos;
	}

	public void setFarmacos(List<Farmaco> farmacos) {
		this.farmacos = farmacos;
	}

	public String toString(){
		return this.nome;
	}
}
