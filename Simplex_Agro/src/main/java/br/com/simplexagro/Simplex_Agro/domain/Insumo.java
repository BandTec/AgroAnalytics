package br.com.simplexagro.Simplex_Agro.domain;

public class Insumo {
	
	private int id;

	private String nome;
	
	private String tipo;
	
	private double quantAtual;
	
	private double quantUsada;
	
	private double quantRecomendada;
	
	private int tempoAcao;

	public int getIdInsumo() {
		
		return id;
		
	}

	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
	}

	public String getTipo() {
		
		return tipo;
		
	}

	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}

	public double getQuantAtual() {
		
		return quantAtual;
		
	}

	public void setQuantAtual(double quantAtual) {
		
		this.quantAtual = quantAtual;
		
	}

	public double getQuantUsada() {
		
		return quantUsada;
		
	}

	public void setQuantUsada(double quantUsada) {
		
		this.quantUsada = quantUsada;
		
	}

	
	public double getQuantRecomendada() {
		
		return quantRecomendada;
	
	}

	public void setQuantRecomendada(double quantRecomendada) {
		
		this.quantRecomendada = quantRecomendada;
		
		return;
		
	}
	
	public int getTempoAcao() {
		
		return tempoAcao;
		
	}

	public void setTempoAcao(int tempoAcao) {
		
		this.tempoAcao = tempoAcao;
		
	}
	
	

}
