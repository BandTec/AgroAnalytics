package br.com.agroanalytics.simplexagro.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Plantacao {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Long idPlantacao;
	
	@JsonProperty
	private Date dataInicio;

	@JsonProperty
	private Date dataFim;
	
	@JsonProperty
	private int cicloEmDias;
	
	@JsonProperty
	private ArrayList<Cultura> cultura;

	@JsonProperty
	private ArrayList<Talhao> talhao;
	
	public Plantacao(Date dataInicio, Date dataFim, int cicloEmDias, ArrayList<Cultura> cultura,
			ArrayList<Talhao> talhao) {
		
		this.dataInicio = dataInicio;
		
		this.dataFim = dataFim;
		
		this.cicloEmDias = cicloEmDias;
		
		this.cultura = cultura;
	
		this.talhao = talhao;
		
		return;
	}

	public Date getDataInicio() {
		
		return dataInicio;
		
	}

	public void setDataInicio(Date dataInicio) {
	
		this.dataInicio = dataInicio;

		return;
	}

	public Date getDataFim() {
	
		return dataFim;
	
	}

	public void setDataFim(Date dataFim) {
	
		this.dataFim = dataFim;
	
		return;
	}

	public int getCicloEmDias() {
	
		return cicloEmDias;
	
	}

	public void setCicloEmDias(int cicloEmDias) {
	
		this.cicloEmDias = cicloEmDias;
	
		return;
	}

	public ArrayList<Cultura> getCultura() {
	
		return cultura;
	
	}

	public void setCultura(ArrayList<Cultura> cultura) {
	
		this.cultura = cultura;
	
		return;
	}

	public ArrayList<Talhao> getTalhao() {
	
		return talhao;
	
	}

	public void setTalhao(ArrayList<Talhao> talhao) {
	
		this.talhao = talhao;
	
		return;
	}

	public long getId() {
	
		return idPlantacao;
	
	}
	
	
	


	
	
	
	

}
