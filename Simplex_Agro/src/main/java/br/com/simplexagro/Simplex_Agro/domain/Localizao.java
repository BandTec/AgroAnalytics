package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Localizao {
	
	@Id
	@GeneratedValue
	private long id; 
	
	@JsonProperty
	private int cep;
	
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
	
	private ArrayList<Usuario> usuario;

	public long getId() {
		
		return id;
		
	}

	public int getCep() {
		
		return cep;
		
	}

	public void setCep(int cep) {
		
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
		
	}
	
	

	
}
