package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long idLeilao;

	@JsonProperty
	private String nomeComprador;

	@JsonProperty
	private double valorInicial;

	@JsonProperty
	private double valorFinal;

	@JsonProperty
	private int quantidadeCaixasVendida;

	@JsonProperty
	@OneToOne
	@JoinColumn(name = "id_Colheita")
	private Colheita colheita;
	


//---------------------------------------------	

	public Long getIdLeilao() {
		return idLeilao;
	}

	public void setIdLeilao(Long idLeilao) {
		this.idLeilao = idLeilao;
	}

	public String getNomeComprador() {
		return nomeComprador;
	}

	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public int getQuantidadeCaixasVendida() {
		return quantidadeCaixasVendida;
	}

	public void setQuantidadeCaixasVendida(int quantidadeCaixasVendida) {
		this.quantidadeCaixasVendida = quantidadeCaixasVendida;
	}

	public Colheita getColheita() {
		return colheita;
	}

	public void setColheita(Colheita colheita) {
		this.colheita = colheita;
	}

}
