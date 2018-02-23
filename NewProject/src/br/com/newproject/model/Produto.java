package br.com.newproject.model;

public class Produto {
	
	private Long codigo;
	private String nome;
	private String unidade;
	private Categoria categ;
	private Tipo tipo;
	private Integer estoqueCritico;
	
	public Produto(Long cod, String nome, String und, Categoria categ, Tipo tp, Integer estCrit) {
		
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

	public Categoria getCateg() {
		return categ;
	}

	public void setCateg(Categoria categ) {
		this.categ = categ;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getEstoqueCritico() {
		return estoqueCritico;
	}

	public void setEstoqueCritico(Integer estoqueCritico) {
		this.estoqueCritico = estoqueCritico;
	}

}
