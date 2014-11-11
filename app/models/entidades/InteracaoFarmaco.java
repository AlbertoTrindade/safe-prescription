package models.entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class InteracaoFarmaco extends Model{
	
	@ManyToOne
	private Farmaco farmaco1;
	
	@ManyToOne
	private Farmaco farmaco2;
	
	@Required
	private String grau;
	
	@Required
	private String descricao;
	
	public InteracaoFarmaco(Farmaco farmaco1, Farmaco farmaco2, String grau, String descricao){
		this.farmaco1 = farmaco1;
		this.farmaco2 = farmaco2;
		this.grau = grau;
		this.descricao = descricao;
	}
	
	public static Finder<Long, InteracaoFarmaco> find = new Finder<Long, InteracaoFarmaco>(Long.class, InteracaoFarmaco.class);

	public Farmaco getFarmaco1() {
		return farmaco1;
	}

	public void setFarmaco1(Farmaco farmaco1) {
		this.farmaco1 = farmaco1;
	}

	public Farmaco getFarmaco2() {
		return farmaco2;
	}

	public void setFarmaco2(Farmaco farmaco2) {
		this.farmaco2 = farmaco2;
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
}
