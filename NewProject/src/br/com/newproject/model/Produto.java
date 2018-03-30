package br.com.newproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id	@GeneratedValue
	private Long codigo;
	private String nome;
	private String unidade;
	private String categ;
	private String tipo;
	private Integer estoqueCritico;
	
	public Produto(Long cod, String nome, String und, String categ, String tp, Integer estCrit) {
		
		this.codigo = cod;
		this.nome = nome;
		this.unidade = und;
		this.categ = categ;
		this.tipo = tp;
		this.estoqueCritico = estCrit;
		
	}
	
	public Produto() {}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getEstoqueCritico() {
		return estoqueCritico;
	}

	public void setEstoqueCritico(Integer estoqueCritico) {
		this.estoqueCritico = estoqueCritico;
	}

}
