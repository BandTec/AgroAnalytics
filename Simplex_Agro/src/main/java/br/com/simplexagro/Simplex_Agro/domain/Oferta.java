package br.com.simplexagro.Simplex_Agro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Oferta {
	
	@Id
	@GeneratedValue
	private long id;
	
	@JsonProperty
	private double valorVendaPretendido;
	
	@JsonProperty
	private boolean acordo;
	
	@JsonProperty
	private double valorCompraPretendido;

	public long getId() {
		
		return id;
		
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
