package br.com.agroanalytics.simplexagro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Oferta {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Long idOferta;
	
	@JsonProperty
	private double valorVendaPretendido;
	
	@JsonProperty
	private boolean acordo;
	
	@JsonProperty
	private double valorCompraPretendido;

	public Long getIdOferta() {
		
		return idOferta;
		
	}

	public double getValorVendaPretendido() {
		
		return valorVendaPretendido;
		
	}

	public void setValorVendaPretendido(double valorVendaPretendido) {
		
		this.valorVendaPretendido = valorVendaPretendido;
		
		return;
	}
	
	public boolean isAcordo() {
		
		return acordo;
		
	}

	public void setAcordo(boolean acordo) {
		
		this.acordo = acordo;
		
		return; 
	}

	public double getValorCompraPretendido() {
		
		return valorCompraPretendido;
		
	}

	public void setValorCompraPretendido(double valorCompraPretendido) {
		
		this.valorCompraPretendido = valorCompraPretendido;
		
		return;
		
	}
	
	

}
