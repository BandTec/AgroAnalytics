package br.com.simplexagro.Simplex_Agro.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.stream.Collector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.simplexagro.Simplex_Agro.domain.Usuario;
import br.com.simplexagro.Simplex_Agro.repositories.UsuarioRepository;

//import ch.qos.logback.core.subst.Token;

@RestController
public class LoginController {
	
	
	private final UsuarioRepository usuarios;

	public LoginController(UsuarioRepository usuario){
		this.usuarios = usuario;
	}
	
	@CrossOrigin
	@PostMapping("/login")
	public ResponseEntity<Double> login(@RequestBody Certificado certificado) {
		
		Usuario usuarioLogado = new Usuario();
		usuarioLogado.setNome(certificado.getLogin());
		usuarioLogado.setSenha(certificado.getSenha());
		
		boolean teste = usuarios.existsUsuarioByNomeAndSenha(certificado.getLogin(), certificado.getSenha());
		
		if (teste) { 
			
			System.out.println(usuarios.count());
//			usuarios.save(usuarioLogado);
			System.out.println(usuarios.count());
			
			double validador  = Temporario.gerarTemporario(); 
			
			Temporario.addTemporario(validador);
			
			return ResponseEntity.ok(validador); 
			
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(401d);
		}
	}
	
	@CrossOrigin
	@PostMapping("/logout")
	public ResponseEntity<String> logout(@RequestHeader("token") double temp)  { 
	
		Temporario.getTokenList().remove((Double) temp);
		
		return ResponseEntity.ok("Success"); 
	}
	
		@GetMapping("/login")
		public String pegarlogin(@RequestBody Certificado certificado) {
			ModelAndView pegarlogin = new ModelAndView();
			pegarlogin.setViewName("telaLogin");
			return "pegarlogin";
		}
		
}
