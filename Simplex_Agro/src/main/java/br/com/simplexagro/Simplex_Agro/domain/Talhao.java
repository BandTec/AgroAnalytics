package br.com.simplexagro.Simplex_Agro.domain;

public class Talhao {
	
	private int idTalhao;

	private boolean disponibilidade; 
	
	private String nome;

	public int getId_talhao() {
		
		return idTalhao;
		
	}

	private void geradorIdTalhao(int idTalhao) {
		
		this.idTalhao = idTalhao;
		
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
	
	
	
	
}
