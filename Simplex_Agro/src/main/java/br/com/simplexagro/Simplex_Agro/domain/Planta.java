package br.com.simplexagro.Simplex_Agro.domain;

public class Planta {
	
	private int idPlanta;
	
	private String nome;
	
	private String tipo;
	
	private int maturacao;

	public int getIdPlanta() {
		
		return idPlanta;
		
	}

	public void geradorIdPlanta(int idPlanta) {
		
		this.idPlanta = idPlanta;
		
		return; 
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
		
		return maturacao;
		
	}
	
	public void setMaturacao(int maturacao) {
		
		this.maturacao = maturacao;
		
		return;
	}
	
	

}
