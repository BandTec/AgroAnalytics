package br.com.simplexagro.Simplex_Agro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Login {
	
	@Id
	@GeneratedValue
	private long id;

	@JsonProperty
	private String email;
	
	@JsonProperty
	private String senha;
	
	public long getId() {
		
		return id;
		
	}

	public String getEmail() {
		
		return email;
		
	}

	public void setEmail(String email) {
		
		this.email = email;
	
		return;
	}

	public String getSenha() {
		
		return senha;
		
	}

	public void setSenha(String senha) {
		
		this.senha = senha;
		
		return;
	}
	
	
	
	
	

}
