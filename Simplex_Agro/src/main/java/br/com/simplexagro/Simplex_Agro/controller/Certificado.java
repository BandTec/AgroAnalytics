package br.com.simplexagro.Simplex_Agro.controller;

public class Certificado {

	private String login;
	private String senha;
		
	public Certificado(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Certificado() {
		
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
}