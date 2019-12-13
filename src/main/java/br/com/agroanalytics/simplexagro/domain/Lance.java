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
	private Long id_lance;

	@JsonProperty
	private double valor;

	@JsonProperty
	private int quantidade_caixasompradas;
	
	public Lance() {
		
	}
	
	public Lance(Long idLance, double valor, int quantidadeCaixasompradas) {
		
		this.id_lance = idLance;
		this.valor = valor ;
		this.quantidade_caixasompradas = quantidadeCaixasompradas;
	
	}
	
	public Long getIdLance() {
		return id_lance;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeCaixasCompradas() {
		return quantidade_caixasompradas;
	}

	public void setQuantidadeCaixasCompradas(int quantidadeCaixasCompradas) {
		this.quantidade_caixasompradas = quantidadeCaixasCompradas;
	}
}
	