package br.com.newproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tipo {
	
	@Id @GeneratedValue
	private Long codigo;
	private String nome;
	
	public Tipo(Long cod, String nome) {
		
		this.codigo = cod;
		this.nome = nome;
	}
	
	public Tipo() {}

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
}
