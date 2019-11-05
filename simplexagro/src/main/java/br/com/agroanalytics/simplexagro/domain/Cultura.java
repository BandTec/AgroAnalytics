package br.com.agroanalytics.simplexagro.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Cultura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty
	private String nome; 
	
	@JsonProperty
	private String tipo;

	@JsonProperty
	private double preco;
	
	@JsonProperty
	private Long cicloDiasMaturacao;
	
	@JsonProperty
	private String dataCriacao;

	public Cultura() {
	
	}

	public Cultura(String nome, String tipo, double preco, Long cicloDiasMaturacao, String dataCriacao) {

		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.cicloDiasMaturacao = cicloDiasMaturacao;
		this.dataCriacao = dataCriacao;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Long getCicloDiasMaturacao() {
		return cicloDiasMaturacao;
	}

	public void setCicloDiasMaturacao(Long cicloDiasMaturacao) {
		this.cicloDiasMaturacao = cicloDiasMaturacao;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Long getId() {
		return id;
	}
	
}
