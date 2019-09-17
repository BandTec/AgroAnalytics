package br.com.simplexagro.Simplex_Agro.controller;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.com.simplexagro.Simplex_Agro.domain.Usuario;

@RestController
public class UsuariosController{

     ArrayList<Usuario> usuario;

	public UsuariosController() {
		
		this.usuario = (ArrayList<Usuario>) obterTodosUsuarios();
	}

	@GetMapping("/usuarios/nome/{nomeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorNome(@PathVariable("nomeDoUsuario") String nome) {
		
		List<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
		for (Usuario u : usuario) {
			if (u.getNome().contentEquals(nome)) {
				usuariosEncontrados.add(u);

			}
		}
		if (usuariosEncontrados.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} else {
			return ResponseEntity.ok(usuariosEncontrados);
		}
	}

	private List<Usuario> obterTodosUsuarios() {
		List<Usuario> usuario = new ArrayList<Usuario>();
		usuario.add(new Usuario("Gameleira", 20));
		usuario.add(new Usuario("Daniel", 18));
		usuario.add(new Usuario("Cintia", 23));
		usuario.add(new Usuario("Clery", 40));
		usuario.add(new Usuario("Dono", 23));
		return usuario;
	}
}