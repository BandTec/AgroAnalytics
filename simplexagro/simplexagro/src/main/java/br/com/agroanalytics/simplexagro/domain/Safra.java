package br.com.agroanalytics.simplexagro.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Safra {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private int idSafra;
	
	@JsonProperty
	private int quantPlantEnvolvidos;
	
	@JsonProperty
	private int quantTalhoesEnvolvidos;
	
	@JsonProperty
	private ArrayList<Plantacao> plantacao;
	
	@JsonProperty
	private ArrayList<Talhao> talhao;

	public int getId() {
		
		return idSafra;
		
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
