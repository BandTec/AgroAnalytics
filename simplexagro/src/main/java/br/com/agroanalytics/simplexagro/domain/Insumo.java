package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Insumo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String tipo;
	
	@JsonProperty
	private double quantAtual;
	
	@JsonProperty
	private double quantUsada;
	
	@JsonProperty
	private long tempoAcao;
	
	@JsonProperty
	private double quantRecomendada;

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

	public long getTempoAcao() {
		return tempoAcao;
	}

	public void setTempoAcao(long tempoAcao) {
		this.tempoAcao = tempoAcao;
	}

	public double getQuantRecomendada() {
		return quantRecomendada;
	}

	public void setQuantRecomendada(double quantRecomendada) {
		this.quantRecomendada = quantRecomendada;
	}

	public Long getId() {
		return id;
	}
	
}
