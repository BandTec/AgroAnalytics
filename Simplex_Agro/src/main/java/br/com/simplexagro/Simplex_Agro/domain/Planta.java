package br.com.simplexagro.Simplex_Agro.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Embeddable
public class Planta {
	
	@Id
	@GeneratedValue
	private long id;
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String tipo;
	
	@JsonProperty
	private int cicloEmDiasMaturacao;

	@JsonProperty
	private double preco;
	
	public long getId() {
		
		return id;
		
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

	public int getMaturacao() {
		
		return  cicloEmDiasMaturacao;
		
	}
	
	public void setMaturacao(int cicloEmDiasMaturacao) {
		
		this. cicloEmDiasMaturacao =  cicloEmDiasMaturacao;
		
		return;
	}

	public double getPreco() {
		
		return preco;
	
	}

	public void setPreco(double preco) {
		
		this.preco = preco;
		
	}
	
	

}
