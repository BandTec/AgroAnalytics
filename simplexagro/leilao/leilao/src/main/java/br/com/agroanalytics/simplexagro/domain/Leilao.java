package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Leilao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
	private Long idLeilao;

	@JsonProperty
	private String nomeLeilao;

	@JsonProperty
	private String nomeComprador;

	@JsonProperty
	private double valorInicial;

	@JsonProperty
	private double valorFinal;

	@JsonProperty
	private int quantidadeCaixasVendida;
 
	@ManyToOne
	@JoinColumn(name="id_Lance")
	private Lance lance;
	
	

	public Leilao(Long idLeilao, String nomeLeilao, String nomeComprador, double valorInicial, double valorFinal,
			int quantidadeCaixasVendida, Lance lance) {
	
		this.idLeilao = idLeilao;
		this.nomeLeilao = nomeLeilao;
		this.nomeComprador = nomeComprador;
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
		this.quantidadeCaixasVendida = quantidadeCaixasVendida;
		this.lance = lance;
	}

	public Long getIdLeilao() {
		return idLeilao;
	}

	public void setIdLeilao(Long idLeilao) {
		this.idLeilao = idLeilao;
	}

	public String getNomeLeilao() {
		return nomeLeilao;
	}

	public void setNomeLeilao(String nomeLeilao) {
		this.nomeLeilao = nomeLeilao;
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

	public Lance getLance() {
		return lance;
	}

	public void setLance(Lance lance) {
		this.lance = lance;
	}
	
	
}
