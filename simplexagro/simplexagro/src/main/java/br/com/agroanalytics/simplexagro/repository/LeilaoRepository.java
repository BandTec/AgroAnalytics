package br.com.agroanalytics.simplexagro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agroanalytics.simplexagro.domain.Leilao;

public interface LeilaoRepository extends JpaRepository<Leilao, Long> {
	
	public Leilao findByLeilao (Leilao leilao);
}


