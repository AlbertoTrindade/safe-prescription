package models.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Farmaco extends Model{
	
	@Id
	private long idFarmaco;
	
	@Required
	private String nome;
	
	public Farmaco(String nome){
		this.nome = nome;
	}
	
	public static Finder<Long, Farmaco> find = new Finder<Long, Farmaco>(Long.class, Farmaco.class);
	
	public long getIdFarmaco() {
		return idFarmaco;
	}

	public void setIdFarmaco(long idFarmaco) {
		this.idFarmaco = idFarmaco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString(){
		return this.nome;
	}
}
