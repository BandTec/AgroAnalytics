package br.com.simplexagro.Simplex_Agro.domain;

public class Planta {
	
	private int id;
	
	private String nome;
	
	private String tipo;
	
	private int cicloEmDiasMaturacao;

	private double preco;
	
	public int getIdPlanta() {
		
		return id;
		
	}

	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
		return;
		
	}

	public String getTipo() {
		
		return tipo;
		
	}

	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
		return;
		
	}

	public int getMaturacao() {
		
		return  cicloEmDiasMaturacao;
		
	}
	
	public void setMaturacao(int cicloEmDiasMaturacao) {
		
		this. cicloEmDiasMaturacao =  cicloEmDiasMaturacao;
		
		return;
	}

	public double getPreco() {
		
		return preco;
	
	}

	public void setPreco(double preco) {
		
		this.preco = preco;
		
	}
	
	

}
