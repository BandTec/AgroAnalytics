package br.com.teste.domain;

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
	
	

	public Login(Long idLogin, String email, String senha) {
		super();
		this.idLogin = idLogin;
		this.email = email;
		this.senha = senha;
	}

	
	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", email=" + email + ", senha=" + senha + "]";
	}


	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}

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
