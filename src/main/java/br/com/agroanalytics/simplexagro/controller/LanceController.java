package br.com.agroanalytics.simplexagro.controller;

import java.util.List;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agroanalytics.simplexagro.domain.Lance;
import br.com.agroanalytics.simplexagro.repository.LanceRepository;

@RestController
//@RequestMapping("/lance")
public class LanceController {

    @Autowired
	private LanceRepository lanceRepository;
	
	private static  Stack<Double> pilha = new Stack<Double>();
	
	@PostMapping("/lance")
	public ResponseEntity lanceUsuario(@RequestBody Lance lance) {
		
		if(pilha.isEmpty() == true) {
			
			pilha.push(lance.getValor());
			lanceRepository.save(lance);
			return ResponseEntity.status(HttpStatus.CREATED).body(lance);
			
		}
		
		else if (pilha.peek() >= lance.getValor()) {
			pilha.push(lance.getValor());
			lanceRepository.save(lance);
			return ResponseEntity.status(HttpStatus.CREATED).body(lance);

		}

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Não autorizado!");

	}

	@GetMapping("/lance")
	public ResponseEntity<List<Lance>> buscarLance() {

		if (lanceRepository.count() > 0) {
			List<Lance> lista = lanceRepository.findAll();
			return ResponseEntity.ok(lista);
		}
		return ResponseEntity.notFound().build();
	}

//	@GetMapping("/{id}")
//	@Transactional
//	public ResponseEntity buscarLances(@PathVariable("id") Long id) {
//
//		Optional<Lance> lance = lanceRepository.findById(id);
//
//		if (lance.isPresent()) {
//
//			return ResponseEntity.ok(lance);
//
//		} else {
//
//			return ResponseEntity.noContent().build();
//		}
//
//	}
//
//	@PutMapping
//	public ResponseEntity atualizarlance(@RequestBody @Valid Lance lance) {
//
//		if (lanceRepository.findById(lance.getIdLance()) == null) {
//
//			return ResponseEntity.noContent().build();
//
//		}
//		lanceRepository.save(lance);
//
//		return ResponseEntity.ok(lance);
//
//	}
//
//	@DeleteMapping("/{id}")
//	@Transactional
//	public ResponseEntity excluirLance(@PathVariable("id") Long id) {
//
//		if (lanceRepository.existsById(id)) {
//
//			lanceRepository.deleteById(id);
//
//			return ResponseEntity.ok().build();
//		} else {
//
//			return ResponseEntity.notFound().build();
//		}
//
//	}

}
