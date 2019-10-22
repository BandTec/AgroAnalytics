package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;

public class Caixa {
	
	private int idCaixa;
	
	private double preco;
	
	private double quantProdutos;
	
	private Planta planta;

	public int getIdCaixa() {
		
		return idCaixa;
		
	}

	private void geradorIdCaixa(int idCaixa) {
		
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

	
	public double getQuantProdutos() {
	
		return quantProdutos;
	
	}

	public void setQuantProdutos(double quantProdutos) {
		
		this.quantProdutos = quantProdutos;
				
		return;
	}

	public Planta getPlanta() {
		
		return planta;
	
	}

	public void setPlanta(Planta planta) {
	
		this.planta = planta;
	
		return;
	}

	
	

}
