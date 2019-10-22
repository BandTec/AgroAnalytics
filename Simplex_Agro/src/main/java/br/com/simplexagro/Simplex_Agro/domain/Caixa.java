package br.com.simplexagro.Simplex_Agro.domain;

public class Caixa {
	
	private int idCaixa;
	
	private double preco;

	public int getIdCaixa() {
		
		return idCaixa;
		
	}

	public void geradorIdCaixa(int idCaixa) {
		
		this.idCaixa = idCaixa;
		
		return;
	}

	public double getPreco() {
		
		return preco;
	}

	public void setPreco(double preco) {
		
		this.preco = preco;
		
		return;
	}
	
	

}
