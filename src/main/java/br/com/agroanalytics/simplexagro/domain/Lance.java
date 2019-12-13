package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Lance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long id;

	@JsonProperty
	private double valor;

	@JsonProperty
	private int quantidadeCaixasCompradas;
	
	public Lance(Long idLance, double valor, int quantidadeCaixasompradas) {
		
		this.id = idLance;
		this.valor = valor ;
		this.quantidadeCaixasCompradas = quantidadeCaixasompradas;
	
	}
	
	public Long getIdLance() {
		return id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeCaixasCompradas() {
		return quantidadeCaixasCompradas;
	}

	public void setQuantidadeCaixasCompradas(int quantidadeCaixasCompradas) {
		this.quantidadeCaixasCompradas = quantidadeCaixasCompradas;
	}
}
	