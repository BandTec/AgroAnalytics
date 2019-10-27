package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Login {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Long idLogin;
	
	@JsonProperty
	private String email;
	
	@JsonProperty
	private String senha;
	
	
	
	public Long getIdLogin() {
		
		return idLogin;
		
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
