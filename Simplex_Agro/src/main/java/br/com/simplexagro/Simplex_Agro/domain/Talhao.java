package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Talhao {
	
	@Id
	@GeneratedValue
	private long id;

	@JsonProperty
	private boolean disponibilidade; 
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private double area;
	
	@OneToMany
	private ArrayList<Planta> planta; 

	public long getId() {
		
		return id;
		
	}

	private void geradorIdTalhao(int idTalhao) {
		
		this.id = idTalhao;
		
		return;
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
