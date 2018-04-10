package br.com.newproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id @GeneratedValue
	private Long codigo;
	private String nome;
	private String tipo;
	
	public Categoria(Long cod, String nome, String tipo) {
		
		this.codigo = cod;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public Categoria() {}

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
