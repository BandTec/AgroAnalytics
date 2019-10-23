package br.com.simplexagro.Simplex_Agro.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Caixa {
	
	@Id
	@GeneratedValue
	private long id;
	
	@JsonProperty
	private double preco;
	
	@JsonProperty
	private double quantProdutos;
	
	@JsonProperty
	@Embedded
	private Planta planta;

	public long getIdCaixa() {
		
		return id;
		
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

	public Planta getPlanta() {
		
		return planta;
	
	}

	public void setPlanta(Planta planta) {
	
		this.planta = planta;
	
		return;
	}

	
	

}
