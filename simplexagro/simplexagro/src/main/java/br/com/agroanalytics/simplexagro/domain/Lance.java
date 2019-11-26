package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Lance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long idLance;

	@JsonProperty
	private double valorInicial;

	@JsonProperty
	private double valorFinal;

	@JsonProperty
	private int quantidadeCaixasompradas;
	
	@OneToMany
	@JoinColumn(name="id_Leilao")
	private Leilao leilao;
	
	

	public Lance(Long idLance, double valorInicial, double valorFinal, int quantidadeCaixasompradas, Leilao leilao) {
		
		this.idLance = idLance;
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
		this.quantidadeCaixasompradas = quantidadeCaixasompradas;
		this.leilao = leilao;
	}

	public Long getIdLance() {
		return idLance;
	}

	public void setIdLance(Long idLance) {
		this.idLance = idLance;
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

	public int getQuantidadeCaixasompradas() {
		return quantidadeCaixasompradas;
	}

	public void setQuantidadeCaixasompradas(int quantidadeCaixasompradas) {
		this.quantidadeCaixasompradas = quantidadeCaixasompradas;
	}

	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	
	

}