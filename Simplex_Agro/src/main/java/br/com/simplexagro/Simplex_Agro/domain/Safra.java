package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Safra {
	
	@Id
	@GeneratedValue
	private long id;
	
	@JsonProperty
	private int quantPlantEnvolvidos;
	
	@JsonProperty
	private int quantTalhoesEnvolvidos;
	
	@JsonProperty
	private ArrayList<Plantacao> plantacao;
	
	@OneToMany
	private ArrayList<Talhao> talhao;

	public long getId() {
		
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
