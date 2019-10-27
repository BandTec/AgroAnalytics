package br.com.agroanalytics.simplexagro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agroanalytics.simplexagro.domain.Caixa;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Long> {

}
