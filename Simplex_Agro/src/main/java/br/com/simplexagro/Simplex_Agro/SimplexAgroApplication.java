package br.com.simplexagro.Simplex_Agro;

import java.io.FileNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.simplexagro.Simplex_Agro.domain.Arquivo;
import br.com.simplexagro.Simplex_Agro.domain.Diretorio;

@SpringBootApplication
public class SimplexAgroApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(SimplexAgroApplication.class, args);
			
		
	}

}
