package br.com.simplexagro.Simplex_Agro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Insumo {
	
	@Id
	@GeneratedValue
	private long id;
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String tipo;
	
	@JsonProperty
	private double quantAtual;
	
	@JsonProperty
	private double quantUsada;
	
	@JsonProperty
	private double quantRecomendada;
	
	@JsonProperty
	private int tempoAcao;

	public long getIdInsumo() {
		
		return id;
		
	}

	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
	}

	public String getTipo() {
		
		return tipo;
		
	}

	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}

	public double getQuantAtual() {
		
		return quantAtual;
		
	}

	public void setQuantAtual(double quantAtual) {
		
		this.quantAtual = quantAtual;
		
	}

	public double getQuantUsada() {
		
		return quantUsada;
		
	}

	public void setQuantUsada(double quantUsada) {
		
		this.quantUsada = quantUsada;
		
	}

	
	public double getQuantRecomendada() {
		
		return quantRecomendada;
	
	}

	public void setQuantRecomendada(double quantRecomendada) {
		
		this.quantRecomendada = quantRecomendada;
		
		return;
		
	}
	
	public int getTempoAcao() {
		
		return tempoAcao;
		
	}

	public void setTempoAcao(int tempoAcao) {
		
		this.tempoAcao = tempoAcao;
		
	}
	
	

}
