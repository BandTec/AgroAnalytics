package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

@Embeddable
public class Login {

	@JsonProperty
	@NotNull  @NotFound 
	private String email;
	
	@JsonProperty
	@NotNull  @NotFound 
	private String senha;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
