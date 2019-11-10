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
import br.com.agroanalytics.simplexagro.domain.Plantacao;
import br.com.agroanalytics.simplexagro.domain.Talhao;
import br.com.agroanalytics.simplexagro.repository.CulturaRepository;
import br.com.agroanalytics.simplexagro.repository.InsumoRepository;
import br.com.agroanalytics.simplexagro.repository.PlantacaoRepository;
import br.com.agroanalytics.simplexagro.repository.TalhaoRepository;

@RestController
@RequestMapping("/plantacao")
public class PlantacaoController {

	@Autowired
	private PlantacaoRepository plantacaoRepository;

	@Autowired
	private InsumoRepository insumoRepository;

	@Autowired
	private CulturaRepository culturaRepository;

	@Autowired
	private TalhaoRepository talhaoRepository;

	@PostMapping
	@Transactional
	public ResponseEntity criarPlantacao(@RequestBody Plantacao plantacao) {

		Optional<Cultura> cultivo = culturaRepository.findById(plantacao.getCultura().getId());

		Optional<Talhao> canteiro = talhaoRepository.findById(plantacao.getTalhao().getId());
			
		if (cultivo.isPresent() && canteiro.isPresent()) {
			
			plantacaoRepository.save(plantacao);

			return ResponseEntity.status(HttpStatus.CREATED).body(plantacao);

		} else {

			System.out.println("Para criar a plantação você deve já ter cadastrado a cultura e o talhao.");

			return ResponseEntity.noContent().build();

		} 

	}

	@GetMapping
	public ResponseEntity<List<Plantacao>> buscarTodasPlantacoes() {

		if (plantacaoRepository.count() > 0) {

			List<Plantacao> plantacao = plantacaoRepository.findAll();

			return ResponseEntity.ok(plantacao);

		}

		return ResponseEntity.noContent().build();

	}

	@GetMapping("/{id}")
	public ResponseEntity buscarPlantacao(@PathVariable("id") Long id) {

		Optional<Plantacao> plantacao = plantacaoRepository.findById(id);

		if (plantacao.isPresent()) {

			return ResponseEntity.ok().body(plantacao);

		}

		return ResponseEntity.noContent().build();

	}

	@PutMapping("/{id}")
	public ResponseEntity atualizarPlantacao(@PathVariable("id") Long id, @RequestBody Plantacao plantacao) {

		Plantacao cultivo = plantacaoRepository.findById(id).orElse(null);

		if (cultivo != null) {

			plantacaoRepository.save(plantacao);

			return ResponseEntity.ok(plantacao);

		}

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity excluirPlantacao(@PathVariable("id") Long id) {

		if (plantacaoRepository.existsById(id)) {

			plantacaoRepository.deleteById(id);

			return ResponseEntity.ok().build();

		} else {

			return ResponseEntity.notFound().build();
		}

	}

	@DeleteMapping
	@Transactional
	public ResponseEntity excluirTodasPlantacoes() {

		if (plantacaoRepository.count() > 0) {

			plantacaoRepository.deleteAll();

			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();

	}

}
