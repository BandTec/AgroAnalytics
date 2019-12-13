package br.com.agroanalytics.simplexagro.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import br.com.agroanalytics.simplexagro.domain.Lance;

public class TodosOsLances {

	private final RestTemplate restTemplate;
	private final String url;

	public TodosOsLances() {

		restTemplate = new RestTemplate();
		url = "http://simplexagroleilao.azurewebsites.net";

	}

	public List<Lance> todosLances(Double valor) {

		String urlBusca = url + "/lance";
		ResponseEntity<Lance[]> resposta = restTemplate.getForEntity(urlBusca, Lance[].class);
		Lance[] lance = resposta.getBody();

		return Arrays.asList(lance);

	}
}
