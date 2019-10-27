package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Insumo {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Long idInsumo;

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
	
	public Insumo(String nome, String tipo, double quantAtual, double quantUsada, double quantRecomendada,
			int tempoAcao) {

		this.nome = nome;
		
		this.tipo = tipo;
		
		this.quantAtual = quantAtual;
		
		this.quantUsada = quantUsada;
		
		this.quantRecomendada = quantRecomendada;
		
		this.tempoAcao = tempoAcao;
	}

	public Long getIdInsumo() {
		
		return idInsumo;
		
	}

	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
		return;
	}

	public String getTipo() {
		
		return tipo;
		
	}

	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
		return;
	}

	public double getQuantAtual() {
		
		return quantAtual;
		
	}

	public void setQuantAtual(double quantAtual) {
		
		this.quantAtual = quantAtual;
		
		return;
	}

	public double getQuantUsada() {
		
		return quantUsada;
		
	}

	public void setQuantUsada(double quantUsada) {
		
		this.quantUsada = quantUsada;
		
		return;
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
		
		return;
	}
	
	

}
