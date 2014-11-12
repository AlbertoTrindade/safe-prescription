package models.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Paciente extends Model{

	@Id
	private long idPaciente;
	
	@Required
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@Required
	private String cpf;
	
	@Required
	private String dataNasc;
	
	@Required
	private String telefoneFixo;
	
	@Required
	private String telefoneCelular;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "paciente_quadro_clinico")
	private List<QuadroClinico> quadrosClinicos;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "paciente_alergia")
	private List<Farmaco> alergias;

	public Paciente(String nome, Endereco endereco, String cpf, String dataNasc, String telefoneFixo, String telefoneCelular, List<QuadroClinico> quadrosClinicos, List<Farmaco> alergias) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.quadrosClinicos = quadrosClinicos;
		this.alergias = alergias;
	}
	
	public static Model.Finder<Long, Paciente> find = new Finder<Long, Paciente>(Long.class, Paciente.class);

	public long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public List<QuadroClinico> getQuadrosClinicos() {
		return quadrosClinicos;
	}

	public void setQuadrosClinicos(List<QuadroClinico> quadrosClinicos) {
		this.quadrosClinicos = quadrosClinicos;
	}

	public List<Farmaco> getAlergias() {
		return alergias;
	}

	public void setAlergias(List<Farmaco> alergias) {
		this.alergias = alergias;
	}
	
	public String toString(){
		return this.nome;
	} 
}
