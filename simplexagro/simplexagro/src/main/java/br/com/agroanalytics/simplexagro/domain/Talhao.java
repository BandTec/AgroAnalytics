package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Talhao {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private int idTalhao;

	@JsonProperty
	private boolean disponibilidade; 
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private double area;

	public int getId_talhao() {
		
		return idTalhao;
		
	}

	public boolean isDisponibilidade() {
		
		return disponibilidade;
		
	}

	public void setDisponibilidade(boolean disponibilidade) {
		
		this.disponibilidade = disponibilidade;
		
		return;
		
	}

	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
		return;
	}

	public double getArea() {
		
		return area;
		
	}
	

	public void setArea(double area) {
	
		this.area = area;
		
		return; 
	} 
	
	
	
	
	
}
