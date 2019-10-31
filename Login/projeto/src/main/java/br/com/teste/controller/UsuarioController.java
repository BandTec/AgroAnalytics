package br.com.teste.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.service.UsuarioService;
import br.com.teste.domain.Usuario;



@RestController
@RequestMapping("api/")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuario")
	public ResponseEntity<List<Usuario>> buscarTodosUsuarios() {
		List<Usuario> todosUsuarios = usuarioService.buscarTodosUsuarios();

		if (todosUsuarios.isEmpty()) {

			return ResponseEntity.noContent().build();

		} else {

			return ResponseEntity.ok().body(todosUsuarios);

		}
	}

	@PostMapping("/usuario")
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
		usuarioService.adicionarUsuario(usuario);
		return ResponseEntity.ok().body(usuario);

	}
	
	
	@DeleteMapping("/usuario")
	public ResponseEntity<Usuario> deletarUsuario(@RequestBody Usuario usuario){
		
		usuarioService.excluirUsuario(usuario);
		
		return ResponseEntity.ok().body(usuario);
		
		
	}

	@PutMapping("/usuario")
	public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
		usuarioService.editarUsuario(usuario);
		
		return ResponseEntity.ok().body(usuario);
	}
}   

	
	


