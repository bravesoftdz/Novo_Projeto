package br.com.newproject.model;

public class GruposPermissoes {
	
	private String permissao;
	
	public GruposPermissoes(String permissao) {
		this.permissao = permissao;
	}
	
	public GruposPermissoes() {}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
}
