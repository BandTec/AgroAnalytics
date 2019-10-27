package br.com.agroanalytics.simplexagro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"br.com.agroanalytics.simplexagro.controller"}) 
//@ComponentScan(basePackages = {"br.com.agroanalytics.simplexagro.service"}) 
//@EnableJpaRepositories(basePackages = {"br.com.agroanalytics.simplexagro.repository"}) 
//@EntityScan(basePackages = {"br.com.agroanalytics.simplexagro.entity"}) 
public class SimplexagroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplexagroApplication.class, args);
	}

}
