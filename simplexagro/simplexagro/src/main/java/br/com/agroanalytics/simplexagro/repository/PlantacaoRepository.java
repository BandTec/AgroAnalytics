package br.com.agroanalytics.simplexagro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sun.xml.bind.v2.model.core.ID;

import br.com.agroanalytics.simplexagro.domain.Plantacao;

@Repository
public interface PlantacaoRepository extends JpaRepository<Plantacao, Long> {

}
