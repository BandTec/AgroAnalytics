package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Cultura {

	@Id
	@GeneratedValue
	@JsonProperty
	private Long idCultura;

	@JsonProperty
	private String nome;

	@JsonProperty
	private String tipo;

	@JsonProperty
	private int cicloEmDiasMaturacao;

	@JsonProperty
	private double preco;

	public Cultura(String nome, String tipo, int cicloEmDiasMaturacao, double preco) {

		this.nome = nome;

		this.tipo = tipo;

		this.cicloEmDiasMaturacao = cicloEmDiasMaturacao;

		this.preco = preco;

		return;
	}

	public Long getId() {

		return idCultura;

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

	public int getCicloEmDiasMaturacao() {
		
		return cicloEmDiasMaturacao;
	
	}

	public void setCicloEmDiasMaturacao(int cicloEmDiasMaturacao) {
	
		this.cicloEmDiasMaturacao = cicloEmDiasMaturacao;
	
		return;
	}

	public double getPreco() {
	
		return preco;
	
	}

	public void setPreco(double preco) {
		
		this.preco = preco;
		
		return;
	
	}

}
