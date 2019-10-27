package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String senha;

	public Usuario(String nome, String senha) {
		
		this.nome = nome;
		
		this.senha = senha;
		
	}
	
	public Long getId() {
		
		return id;
		
	}

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

	

	
}


