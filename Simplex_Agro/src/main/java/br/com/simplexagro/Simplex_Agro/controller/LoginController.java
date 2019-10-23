package br.com.simplexagro.Simplex_Agro.controller;

import java.io.FileNotFoundException;

//import java.util.stream.Collector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import br.com.simplexagro.Simplex_Agro.domain.Arquivo;
import br.com.simplexagro.Simplex_Agro.domain.Diretorio;

//import ch.qos.logback.core.subst.Token;

@RestController
public class LoginController {
	@PostMapping("/login")
	public ResponseEntity<Double> login(@RequestBody Certificado certificado) throws FileNotFoundException {

	     

		if (certificado.getLogin().equals(certificado.getSenha())) { 
			
			double validador  = Temporario.gerarTemporario(); 
			
			Temporario.addTemporario(validador);
			
			Diretorio.criarDiretorio();
	        
		       Arquivo.criarArquivo();
		    
			return ResponseEntity.ok(validador); 
			
		
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(401d);
		}
	}
	
	@PostMapping("/logout")
	public ResponseEntity<String> logout(@RequestHeader("token") double temp)  { 
	
		Temporario.getTokenList().remove((Double) temp);
		
		return ResponseEntity.ok("Success"); 
	}

}
