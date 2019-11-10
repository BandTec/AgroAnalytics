package br.com.agroanalytics.simplexagro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agroanalytics.simplexagro.domain.Cultura;
import br.com.agroanalytics.simplexagro.domain.Plantacao;
import br.com.agroanalytics.simplexagro.domain.Talhao;

public interface PlantacaoRepository extends JpaRepository<Plantacao, Long> {

	public List<Plantacao> findByCultura(Cultura cultura);
	
	public List<Plantacao> findByTalhao(Talhao talhao);

	
	
//	@Query("select a from Plantacao a where a.cultura = :id ")
//	public List<Plantacao> buscarPlantacaoPelaCultura(@Param("id") Long id);

}
