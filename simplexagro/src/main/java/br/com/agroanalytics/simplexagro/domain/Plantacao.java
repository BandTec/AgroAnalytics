package br.com.agroanalytics.simplexagro.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Plantacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@JsonProperty
	private String dataCriacao;

	@JsonProperty
	@OneToOne
	@JoinColumn(name = "id_cultura")
	private Cultura cultura;
	
	@JsonProperty
	@OneToOne
	@JoinColumn(name = "id_talhao")
	private Talhao talhao;

	public Plantacao() {}

	public Plantacao(String dataCriacao, Cultura cultura, Talhao talhao, List<Insumo> insumo) {
		this.dataCriacao = dataCriacao;
		this.cultura = cultura;
		this.talhao = talhao;
		//this.insumo = insumo;
	}
	
	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Cultura getCultura() {
		return cultura;
	}

	public void setCultura(Cultura cultura) {
		this.cultura = cultura;
	}

	public Talhao getTalhao() {
		return talhao;
	}

	public void setTalhao(Talhao talhao) {
		this.talhao = talhao;
	}

//	public List<Insumo> getInsumo() {
//		return insumo;
//	}
//
//	public void setInsumo(List<Insumo> insumo) {
//		this.insumo = insumo;
//	}

	public Long getId() {
		return id;
	}
	
	
	

	
	
	
	

	
}
