package br.com.agroanalytics.simplexagro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agroanalytics.simplexagro.repository.OfertaRepository;

@Service
public class OfertaService {

	@Autowired
	private OfertaRepository ofertaRepository;

}
