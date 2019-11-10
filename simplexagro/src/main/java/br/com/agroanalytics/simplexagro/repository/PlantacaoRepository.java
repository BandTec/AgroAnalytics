package br.com.agroanalytics.simplexagro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.agroanalytics.simplexagro.domain.Cultura;
import br.com.agroanalytics.simplexagro.domain.Plantacao;

public interface PlantacaoRepository extends JpaRepository<Plantacao, Long> {

	public List<Plantacao> findByCultura(Cultura cultura);

	
	
//	@Query("select a from Plantacao a where a.cultura = :id ")
//	public List<Plantacao> buscarPlantacaoPelaCultura(@Param("id") Long id);

}
