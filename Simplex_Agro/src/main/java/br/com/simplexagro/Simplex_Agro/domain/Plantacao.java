package br.com.simplexagro.Simplex_Agro.domain;

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
	private long id;
	
	@JsonProperty
	private Date dataInicio;

	@JsonProperty
	private Date dataFim;
	
	@JsonProperty
	private int cicloEmDias;
	
	private ArrayList<Planta> planta;

	private ArrayList<Talhao> talhao;

	public long getId() {
		
		return id;
		
	}

	public Date getDataInicio() {
		
		return dataInicio;
		
	}

	public void setDataInicio(Date dataInicio) {
		
		this.dataInicio = dataInicio;
		
	}

	public Date getDataFim() {
		
		return dataFim;
		
	}

	public void setDataFim(Date dataFim) {
		
		this.dataFim = dataFim;
		
	}

	public int getCicloEmDias() {
		
		return cicloEmDias;
		
	}

	public void setCicloEmDias(int cicloEmDias) {
		
		this.cicloEmDias = cicloEmDias;
		
	}

	public ArrayList<Planta> getPlanta() {
		
		return planta;
		
	}

	public void setPlanta(ArrayList<Planta> planta) {
		
		this.planta = planta;
		
	}

	public ArrayList<Talhao> getTalhao() {
		
		return talhao;
		
	}

	public void setTalhao(ArrayList<Talhao> talhao) {
		
		this.talhao = talhao;
		
	}


	
	
	
	
	
	

}
