package br.com.agroanalytics.simplexagro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agroanalytics.simplexagro.domain.Caixa;
import br.com.agroanalytics.simplexagro.repository.CaixaRepository;

@Service
public class CaixaService {

	@Autowired
	private CaixaRepository caixaRepository;

	public List<Caixa> buscarTodasCaixas() {

		List<Caixa> caixas = caixaRepository.findAll();
		
		return caixas;
	}
	
	
}
