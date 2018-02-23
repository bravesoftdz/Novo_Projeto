package br.com.newproject.model;

public class Categoria {
	
	private Long codigo;
	private String nome;
	private Tipo tipo;
	
	public Categoria(Long cod, String nome, Tipo tipo) {
		
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
