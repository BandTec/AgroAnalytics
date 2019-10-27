package br.com.agroanalytics.simplexagro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agroanalytics.simplexagro.repository.LocalizaoRepository;

@Service
public class LocalizaoService {

	@Autowired
	 private LocalizaoRepository localizaoRepository;
	
}
