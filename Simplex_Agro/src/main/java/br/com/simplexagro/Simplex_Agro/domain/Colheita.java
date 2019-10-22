package br.com.simplexagro.Simplex_Agro.domain;

public class Colheita {
	
	private int idColheita;
	
	private long quantCaixa;

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
	
	
	

}
