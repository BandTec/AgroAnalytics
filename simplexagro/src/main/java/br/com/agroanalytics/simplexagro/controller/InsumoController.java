package br.com.agroanalytics.simplexagro.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agroanalytics.simplexagro.domain.Cultura;
import br.com.agroanalytics.simplexagro.domain.Insumo;
import br.com.agroanalytics.simplexagro.domain.Talhao;
import br.com.agroanalytics.simplexagro.repository.InsumoRepository;

@RestController
@RequestMapping("/insumos")
public class InsumoController {
	
	@Autowired
	private InsumoRepository insumoRepository;

	@PostMapping
	@Transactional
	public ResponseEntity criarInsumo(@RequestBody Insumo insumo) {

		insumoRepository.save(insumo);

		return ResponseEntity.status(HttpStatus.CREATED).body(insumo);

	}

	@GetMapping
	public ResponseEntity<List<Insumo>> buscarTodosInsumos() {

		if (insumoRepository.count() > 0) {

			List<Insumo> insumo = insumoRepository.findAll();

			return ResponseEntity.ok().body(insumo);

		}
		
		return ResponseEntity.noContent().build();

	}
	
	@GetMapping("/{id}")
	public ResponseEntity buscarInsumo(@PathVariable("id") Long id) {

		Optional<Insumo> insumo = insumoRepository.findById(id);

		if (insumo.isPresent()) {

			return ResponseEntity.ok().body(insumo);
		}
		
		return ResponseEntity.noContent().build();

		
	}


	@PutMapping("/{id}")
	public ResponseEntity atualizarCultura(@PathVariable("id") Long id, @RequestBody @Valid Insumo insumo) {
		
		if(insumoRepository.findById(id) == null) {
			
			return ResponseEntity.noContent().build();
		
		}
		
		insumoRepository.save(insumo);
		
		return ResponseEntity.ok(insumo);

	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity excluirInsumo(@PathVariable("id") Long id) {

		if (insumoRepository.existsById(id)) {

			insumoRepository.deleteById(id);

			return ResponseEntity.ok().build();
			
		} else {

			return ResponseEntity.notFound().build();
		}

	}
	
	@DeleteMapping
	@Transactional
	public ResponseEntity excluirTodosInsumos() {
		
		if (insumoRepository.count() > 0) {
			
			insumoRepository.deleteAll();

			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.noContent().build();
		
		
	}
	
	
}
