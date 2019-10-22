package br.com.simplexagro.Simplex_Agro.domain;

public class Talhao {
	
	private int id;

	private boolean disponibilidade; 
	
	private String nome;
	
	private double area;

	public int getId_talhao() {
		
		return id;
		
	}

	private void geradorIdTalhao(int idTalhao) {
		
		this.id = idTalhao;
		
		return;
	}

	public boolean isDisponibilidade() {
		
		return disponibilidade;
		
	}

	public void setDisponibilidade(boolean disponibilidade) {
		
		this.disponibilidade = disponibilidade;
		
		return;
		
	}

	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
		return;
	}

	public double getArea() {
		
		return area;
		
	}
	

	public void setArea(double area) {
	
		this.area = area;
		
		return; 
	} 
	
	
	
	
	
}
