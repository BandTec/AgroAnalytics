package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;

public class Colheita {
	
	private int idColheita;
	
	private long quantCaixa;
	
	private ArrayList<Caixa> caixa;

	public int getIdColheita() {
		
		return idColheita;
		
	}

	private void geradorIdColheita(int idColheita) {
		
		this.idColheita = idColheita;
		
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
