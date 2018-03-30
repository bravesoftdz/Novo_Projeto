package br.com.newproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estabelecimento {
	
	@Id @GeneratedValue
	private int codigo;
	private String nome;
	private String razao;
	private String cnpj;
	private String telefone;
	private String email;
	private String insc_estadual;
	private String insc_municipal;
	private String endereco;
	private String numero;
	private String cep;
	private String cidade;
	private String bairro;
	private String estado;
	
	public Estabelecimento(int codigo, String nome, String razao, String cnpj, String tel, String email, String ie, String im, String endereco,
			String numero, String cep, String cidade, String bairro, String estado) {
		this.codigo = codigo;
		this.nome = nome;
		this.razao = razao;
		this.cnpj = cnpj;
		this.telefone = tel;
		this.email = email;
		this.insc_estadual = ie;
		this.insc_municipal = im;
		this.endereco = endereco;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
	}

	public Estabelecimento() {}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInsc_estadual() {
		return insc_estadual;
	}

	public void setInsc_estadual(String insc_estadual) {
		this.insc_estadual = insc_estadual;
	}

	public String getInsc_municipal() {
		return insc_municipal;
	}

	public void setInsc_municipal(String insc_municipal) {
		this.insc_municipal = insc_municipal;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
