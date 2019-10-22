package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;

public class Safra {
	
	private int id;
	
	private int quantPlantEnvolvidos;
	
	private int quantTalhoesEnvolvidos;
	
	private ArrayList<Plantacao> plantacao;
	
	private ArrayList<Talhao> talhao;

	public int getId() {
		
		return id;
		
	}

	public int getQuantPlantEnvolvidos() {
		
		return quantPlantEnvolvidos;
		
	}

	public void setQuantPlantEnvolvidos(int quantPlantEnvolvidos) {
		
		this.quantPlantEnvolvidos = quantPlantEnvolvidos;
		
	}

	public int getQuantTalhoesEnvolvidos() {
		
		return quantTalhoesEnvolvidos;
		
	}

	public void setQuantTalhoesEnvolvidos(int quantTalhoesEnvolvidos) {
		
		this.quantTalhoesEnvolvidos = quantTalhoesEnvolvidos;
		
	}
	
	public ArrayList<Plantacao> getPlantacao() {
		
		return plantacao;
		
	}

	public void setPlantacao(ArrayList<Plantacao> plantacao) {
		
		this.plantacao = plantacao;
		
	}

	public ArrayList<Talhao> getTalhao() {
		
		return talhao;
		
	}

	public void setTalhao(ArrayList<Talhao> talhao) {
		
		this.talhao = talhao;
		
		return;
	}
	
	
	
}
