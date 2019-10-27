package br.com.agroanalytics.simplexagro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agroanalytics.simplexagro.domain.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Long> {

}
