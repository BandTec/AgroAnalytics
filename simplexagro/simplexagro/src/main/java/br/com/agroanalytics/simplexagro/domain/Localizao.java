package br.com.agroanalytics.simplexagro.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Localizao {
	
	@Id
	@GeneratedValue
	private Long id; 
	
	@JsonProperty
	private String cep;
	
	@JsonProperty
	private String rua;
	
	@JsonProperty
	private String bairro;
	
	@JsonProperty
	private String cidade;
	
	@JsonProperty
	private String estado;
	
	@JsonProperty
	private String pais;
	
	@JsonProperty
	private ArrayList<Usuario> usuario;

	public Localizao(String cep, String rua, String bairro, String cidade, String estado, String pais,
			ArrayList<Usuario> usuario) {

		this.cep = cep;
		
		this.rua = rua;
		
		this.bairro = bairro;
		
		this.cidade = cidade;
		
		this.estado = estado;
		
		this.pais = pais;
		
		this.usuario = usuario;
		
	}

	public Long getId() {
		
		return id;
		
	}

	public String getCep() {
		
		return cep;
		
	}

	public void setCep(String cep) {
		
		this.cep = cep;
		
		return;
	}

	public String getRua() {
		
		return rua;
		
	}

	public void setRua(String rua) {
		
		this.rua = rua;
		
		return;
	}

	public String getBairro() {
		
		return bairro;
		
	}

	public void setBairro(String bairro) {
		
		this.bairro = bairro;
		
		return;
	}

	public String getCidade() {
		
		return cidade;
		
	}

	public void setCidade(String cidade) {
		
		this.cidade = cidade;
		
		return;
	}

	public String getEstado() {
		
		return estado;
		
	}

	public void setEstado(String estado) {
		
		this.estado = estado;
		
		return;
	}

	public String getPais() {
		
		return pais;
		
	}

	public void setPais(String pais) {
		
		this.pais = pais;
		
		return;
	}

	public ArrayList<Usuario> getUsuario() {
		
		return usuario;
		
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		
		this.usuario = usuario;
		
		return;
	}
	
	

	
}
