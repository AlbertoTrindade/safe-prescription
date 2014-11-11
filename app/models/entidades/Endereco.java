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

	public Endereco(String estado, String cidade, int numero, String bairro, String logradouro) {
		this(estado, cidade, numero, bairro, logradouro, null);
	}

	public Endereco(String estado, String cidade, int numero, String bairro, String logradouro, String complemento) {
		this.estado = estado;
		this.cidade = cidade;
		this.numero = numero;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.complemento = complemento;
	}

	public long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
