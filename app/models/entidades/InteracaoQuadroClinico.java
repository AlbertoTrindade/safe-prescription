package models.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class InteracaoQuadroClinico extends Model{

	@ManyToOne
	private Farmaco farmaco;
	
	@ManyToOne
	private QuadroClinico quadroClinico;
	
	@Required
	private String grau;
	
	@Required
	private String descricao;
	
	public InteracaoQuadroClinico(Farmaco farmaco, QuadroClinico quadroClinico, String grau, String descricao){
		this.farmaco = farmaco;
		this.quadroClinico = quadroClinico;
		this.grau = grau;
		this.descricao = descricao;
	}
	
	public static Finder<Long, InteracaoQuadroClinico> find = new Finder<Long, InteracaoQuadroClinico>(Long.class, InteracaoQuadroClinico.class);

	public Farmaco getFarmaco() {
		return farmaco;
	}

	public void setFarmaco(Farmaco farmaco) {
		this.farmaco = farmaco;
	}

	public QuadroClinico getQuadroClinico() {
		return quadroClinico;
	}

	public void setQuadroClinico(QuadroClinico quadroClinico) {
		this.quadroClinico = quadroClinico;
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean equals(Object object){
		InteracaoQuadroClinico interacaoQuadroClinico = (InteracaoQuadroClinico)object;
		
		if (this.farmaco.getIdFarmaco() == interacaoQuadroClinico.farmaco.getIdFarmaco() && 
			this.quadroClinico.getIdQuadroClinico() == interacaoQuadroClinico.quadroClinico.getIdQuadroClinico()){
			return true;
		}
		else{
			return false;
		}
	}
}
