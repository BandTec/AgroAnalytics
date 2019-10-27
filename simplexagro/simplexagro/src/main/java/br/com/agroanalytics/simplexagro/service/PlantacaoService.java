package br.com.agroanalytics.simplexagro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agroanalytics.simplexagro.repository.PlantacaoRepository;

@Service
public class PlantacaoService {

	@Autowired
	PlantacaoRepository plantacaoRepository;
}
