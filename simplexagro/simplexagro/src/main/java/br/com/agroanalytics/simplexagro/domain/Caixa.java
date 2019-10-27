package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Caixa {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Long idCaixa;
	
	@JsonProperty
	private double preco;
	
	@JsonProperty
	private double quantProdutos;
	
	@JsonProperty
	private Cultura cultura;
	
	public Caixa(double preco, double quantProdutos, Cultura cultura) {
		
		this.preco = preco;
		
		this.quantProdutos = quantProdutos;
		
		this.cultura = cultura;
		
	}

	public Long getIdCaixa() {
		
		return idCaixa;
		
	}
	
	public double getPreco() {
	
		return preco;
	
	}

	
	public void setPreco(double preco) {
	
		this.preco = preco;
	
		return;
	
	}

	
	public double getQuantProdutos() {
	
		return quantProdutos;
	
	}

	public void setQuantProdutos(double quantProdutos) {
		
		this.quantProdutos = quantProdutos;
				
		return;
	}

	public Cultura getPlanta() {
		
		return cultura;
	
	}

	public void setPlanta(Cultura cultura) {
	
		this.cultura = cultura;
	
		return;
	}

	
	

}
