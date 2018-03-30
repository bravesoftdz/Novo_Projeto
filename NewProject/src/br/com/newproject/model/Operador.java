package br.com.newproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Operador {

	@Id @GeneratedValue
	private Long id;
	private String nome;
	private String senha;
	private String confirm_senha;
	//private GruposPermissoes grupo_perm;
	
	public Operador(String nome, String senha, String confirm_senha) {
		
		this.nome = nome;
		this.senha = senha;
		this.confirm_senha = confirm_senha;
		//this.grupo_perm = grupo_perm;
	}
	
	public Operador() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirm_senha() {
		return confirm_senha;
	}

	public void setConfirm_senha(String confirm_senha) {
		this.confirm_senha = confirm_senha;
	}

	/*
	public GruposPermissoes getGrupo_perm() {
		return grupo_perm;
	}

	public void setGrupo_perm(GruposPermissoes grupo_perm) {
		this.grupo_perm = grupo_perm;
	}*/
}
