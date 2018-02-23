package br.com.newproject.model;

public class Tipo {
	
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
