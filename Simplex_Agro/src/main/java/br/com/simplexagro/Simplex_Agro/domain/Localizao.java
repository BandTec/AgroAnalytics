package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;

public class Localizao {
	
	private int id; 
	
	private int cep;
	
	private String rua;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	private String pais;
	
	private ArrayList<Usuario> usuario;

	public int getId() {
		
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
