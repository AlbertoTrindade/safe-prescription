package models.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class QuadroClinico extends Model{
	
	@Id
	private long idQuadroClinico;
	
	@Required
	private String nome;
	
	public QuadroClinico(String nome){
		this.nome = nome;
	}
	
	public static Finder<Long, QuadroClinico> find = new Finder<Long, QuadroClinico>(Long.class, QuadroClinico.class);
	
	public long getIdQuadroClinico() {
		return idQuadroClinico;
	}

	public void setIdQuadroClinico(long idQuadroClinico) {
		this.idQuadroClinico = idQuadroClinico;
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
