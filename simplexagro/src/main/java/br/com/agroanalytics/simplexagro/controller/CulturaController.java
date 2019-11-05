package br.com.agroanalytics.simplexagro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agroanalytics.simplexagro.domain.Cultura;
import br.com.agroanalytics.simplexagro.repository.CulturaRepository;

@RestController
@RequestMapping("/Cultura")
public class CulturaController {

	@Autowired
	private CulturaRepository culturaRepository;

	@PostMapping
	@Transactional
	public ResponseEntity criarCultura(Cultura cultura) {

		culturaRepository.save(cultura);

		return ResponseEntity.status(HttpStatus.CREATED).body(cultura);

	}

	@GetMapping
	public ResponseEntity<List<Cultura>> buscarTodasCulturas() {

		if (culturaRepository.count() > 0) {

			List<Cultura> cultura = culturaRepository.findAll();

			return ResponseEntity.ok(cultura);

		}
		
		return ResponseEntity.noContent().build();

	}

	@GetMapping("/{id}")
	public ResponseEntity buscarCultura(@PathVariable("id") Long id) {

		Optional<Cultura> cultura = culturaRepository.findById(id);

		if (cultura.isPresent()) {

			return ResponseEntity.ok().body(cultura);

		}
		
			return ResponseEntity.noContent().build();

	}

}