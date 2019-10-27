package br.com.agroanalytics.simplexagro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agroanalytics.simplexagro.domain.Cultura;
import br.com.agroanalytics.simplexagro.repository.CulturaRepository;

@Service
public class CulturaService {
	
	@Autowired
	private CulturaRepository culturaRepository;
	

	/*public CulturaService(CulturaRepository culturaRepository) {
		
		this.culturaRepository = culturaRepository;
	}*/

	public List<Cultura> buscarTodasCulturas(){
		
		List<Cultura> culturas = culturaRepository.findAll();
		
		return culturas;
		
	}

	public Cultura adicionarCultura(Cultura cultura) {
	
		return culturaRepository.save(cultura);
	
	}

}
