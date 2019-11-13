package br.com.agroanalytics.simplexagro.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Safra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty
	@OneToMany
	@JoinColumn(name = "id_plantacao")
	private List<Plantacao> plantacao; 
	
	@JsonProperty
	private String data;
	
	@JsonProperty
	private double lucroPlantacoes;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getLucroPlantacoes() {
		return lucroPlantacoes;
	}

	public void setLucroPlantacoes(double lucroPlantacoes) {
		this.lucroPlantacoes = lucroPlantacoes;
	}

	public Long getId() {
		return id;
	}
	
}
