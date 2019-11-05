//package br.com.agroanalytics.simplexagro.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.agroanalytics.simplexagro.domain.Leilao;
//import br.com.agroanalytics.simplexagro.repository.LeilaoRepository;
//
//	
//	@RestController
//	@RequestMapping("/leilao")
//	public class LeilaoController {
//
//		@Autowired
//		private LeilaoRepository leilaoRepository;
//
//
//		@PostMapping
//		@Transactional
//		public ResponseEntity leilaoUsuario(@RequestBody @Valid Leilao leilao) {
//
//			leilaoRepository.save(leilao);
//			
//			return ResponseEntity.status(HttpStatus.CREATED).body(leilao);
//
//		}
//
//		@GetMapping
//		@Transactional
//		public ResponseEntity<List<Leilao>> buscarLeilao() {
//
//			if (leilaoRepository.count() > 0) {
//				List<Leilao> lista = leilaoRepository.findAll();
//				return ResponseEntity.ok(lista);
//			}
//			return ResponseEntity.notFound().build();
//		}
//
//		@GetMapping("/{id}")
//		@Transactional
//		public ResponseEntity buscarLeilao(@PathVariable("id") Long id) {
//
//			Optional<Leilao> leilao = leilaoRepository.findById(id);
//
//			if (leilao.isPresent()) {
//
//				return ResponseEntity.ok(leilao);
//
//			} else {
//
//				return ResponseEntity.noContent().build();
//			}
//
//		}
//
//		@PutMapping
//		public ResponseEntity atualizarLeilao(@RequestBody @Valid Leilao leilao) {
//			
//			if(leilao.getIdLeilao() == null) {
//				
//				return ResponseEntity.noContent().build();
//				
//				
//			}
//			leilaoRepository.save(leilao);
//			
//			return ResponseEntity.ok(leilao);
//
//
//		}
//
//		@DeleteMapping("/{id}")
//		@Transactional
//		public ResponseEntity excluirLeilao(@PathVariable("id") Long id) {
//
//			if (leilaoRepository.existsById(id)) {
//
//				leilaoRepository.deleteById(id);
//
//				return ResponseEntity.ok().build();
//			} else {
//
//				return ResponseEntity.notFound().build();
//			}
//
//		}
//
//	}

	
	


