package br.com.agroanalytics.simplexagro.domain;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String cpf;
	
	@JsonProperty
	private String dataNascimento;
	
	public Usuario() {
	
	}
	
	public Usuario(String nome, String cpf, String dataNascimento) {

		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
