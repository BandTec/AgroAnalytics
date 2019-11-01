package br.com.agroanalytics.simplexagro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agroanalytics.simplexagro.domain.Usuario;
import br.com.agroanalytics.simplexagro.service.UsuarioService;



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
	
	
	@DeleteMapping("/usuario/{id}")
	public ResponseEntity<Usuario> deletarUsuario(@PathVariable (value ="id") Long idUsuario){
		
		usuarioService.excluirUsuario(idUsuario);
		
		return ResponseEntity.ok().build();
		
		
	}

	@PutMapping("/usuario/{idUsuario}")
	public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
		usuarioService.editarUsuario(usuario);
		
		return ResponseEntity.ok().body(usuario);
	}
}   

	
	


