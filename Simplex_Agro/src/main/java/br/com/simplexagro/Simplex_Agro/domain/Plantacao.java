package br.com.simplexagro.Simplex_Agro.domain;

import java.util.ArrayList;
import java.util.Date;

public class Plantacao {
	
	private int id;
	
	private Date dataInicio;

	private Date dataFim;
	
	private int cicloEmDias;
	
	private ArrayList<Planta> planta;

	private ArrayList<Talhao> talhao;

	public int getId() {
		
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
