package br.com.agroanalytics.simplexagro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agroanalytics.simplexagro.domain.Lance;


public interface LanceRepository extends JpaRepository<Lance, Long> {

	public Lance findByLance(Lance lance);
	
}
