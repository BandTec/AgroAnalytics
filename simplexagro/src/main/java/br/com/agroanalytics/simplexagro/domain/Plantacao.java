package br.com.agroanalytics.simplexagro.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Plantacao {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private Cultura cultura;
	
	@OneToMany
	private Talhao talhao;
	
	@JsonProperty
	private Date data;
	

}
