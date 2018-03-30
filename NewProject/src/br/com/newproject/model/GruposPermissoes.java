package br.com.newproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class GruposPermissoes {
	
	private Long id;
	private String permissao1;
	private String permissao2;
	private String permissao3;
	private String permissao4;
	
	public GruposPermissoes(String permissao1, String permissao3, String permissao2, String permissao4) {
		
		this.permissao1 = permissao1;
		this.permissao2 = permissao2;
		this.permissao3 = permissao3;
		this.permissao4 = permissao4;
	}
	
	public GruposPermissoes() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermissao1() {
		return permissao1;
	}

	public void setPermissao1(String permissao1) {
		this.permissao1 = permissao1;
	}

	public String getPermissao2() {
		return permissao2;
	}

	public void setPermissao2(String permissao2) {
		this.permissao2 = permissao2;
	}

	public String getPermissao3() {
		return permissao3;
	}

	public void setPermissao3(String permissao3) {
		this.permissao3 = permissao3;
	}

	public String getPermissao4() {
		return permissao4;
	}

	public void setPermissao4(String permissao4) {
		this.permissao4 = permissao4;
	}
}
