package br.com.agroanalytics.simplexagro.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Colheita {
	
	@Id
	@GeneratedValue
	private Long idColheita;
	
	@JsonProperty
	private long quantCaixa;
	
	@JsonProperty
	private ArrayList<Caixa> caixa;
	
	public Colheita(long quantCaixa, ArrayList<Caixa> caixa) {

		this.quantCaixa = quantCaixa;
		
		this.caixa = caixa;
		
	}

	public Long getIdColheita() {
		
		return idColheita;
		
	}

	public long getQuantCaixa() {
		
		return quantCaixa;
		
	}

	public void setQuantCaixa(long quantCaixa) {
		
		this.quantCaixa = quantCaixa;
		
	}

	public ArrayList<Caixa> getCaixa() {
		
		return caixa;
	
	}

	public void setCaixa(ArrayList<Caixa> caixa) {
		
		this.caixa = caixa;
	
	}
	
	
	

}
