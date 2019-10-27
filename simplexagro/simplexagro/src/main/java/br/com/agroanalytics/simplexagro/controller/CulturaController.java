package br.com.agroanalytics.simplexagro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agroanalytics.simplexagro.domain.Cultura;
import br.com.agroanalytics.simplexagro.service.CulturaService;

@RestController
public class CulturaController {

	@Autowired
	private CulturaService culturaService;

	@GetMapping("Pagina Inicial/Visualizar/Cultura")
	public ResponseEntity<List<Cultura>> buscarTodasCulturas() {

		List<Cultura> todasCulturas = culturaService.buscarTodasCulturas();

		if (todasCulturas.isEmpty()) {

			return ResponseEntity.noContent().build();

		} else {

			return ResponseEntity.ok().body(todasCulturas);

		}
	}

	@PostMapping("Pagina Inicial/Cadastrar/Cultura")
	public ResponseEntity<Cultura> cadastrarCultura(@RequestBody Cultura cultura) {

		culturaService.adicionarCultura(cultura);

		return ResponseEntity.ok().body(cultura);

	}

}
