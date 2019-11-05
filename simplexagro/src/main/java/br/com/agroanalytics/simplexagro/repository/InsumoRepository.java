package br.com.agroanalytics.simplexagro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agroanalytics.simplexagro.domain.Insumo;

public interface InsumoRepository extends JpaRepository<Insumo, Long> {

}
