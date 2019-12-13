package br.com.agroanalytics.simplexagro.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long id_leilao;

	@JsonProperty
	private String nome_comprador;

	@JsonProperty
	private double valor_inicial;

	@JsonProperty
	private double valor_final;
	
	@OneToMany
	@JoinColumn(name = "id_lance")
	private List<Lance> lance;

//---------------------------------------------	

	public Leilao() {
		
	}
	
	public Long getIdLeilao() {
		return id_leilao;
	}

	public void setIdLeilao(Long idLeilao) {
		this.id_leilao = idLeilao;
	}

	public String getNomeComprador() {
		return nome_comprador;
	}

	public void setNomeComprador(String nomeComprador) {
		this.nome_comprador = nomeComprador;
	}

	public double getValorInicial() {
		return valor_inicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valor_inicial = valorInicial;
	}

	public double getValorFinal() {
		return valor_final;
	}

	public void setValorFinal(double valorFinal) {
		this.valor_final = valorFinal;
	}




}
