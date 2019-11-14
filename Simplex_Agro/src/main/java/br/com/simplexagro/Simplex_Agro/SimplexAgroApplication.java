package br.com.simplexagro.Simplex_Agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = "br.com.simplexagro.Simplex_Agro.repositories")
@SpringBootApplication
public class SimplexAgroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplexAgroApplication.class, args);
	}

}
