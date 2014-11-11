package models.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Endereco extends Model{
	
	@Id
	private long idEndereco;
	
	@Required
	private String estado;
	
	@Required
	private String cidade;
	
	@Required
	private int numero;
	
	@Required
	private String bairro;
	
	@Required
	private String logradouro;
	
	private String complemento;

	public Endereco(long idEndereco, String estado, String cidade, int numero, String bairro, String logradouro) {
		this(idEndereco, estado, cidade, numero, bairro, logradouro, null);
	}

	public Endereco(long idEndereco, String estado, String cidade, int numero, String bairro, String logradouro, String complemento) {
		this.idEndereco = idEndereco;
		this.estado = estado;
		this.cidade = cidade;
		this.numero = numero;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.complemento = complemento;
	}
}
