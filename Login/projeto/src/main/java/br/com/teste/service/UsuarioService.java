package br.com.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.service.UsuarioService;
import br.com.teste.domain.Usuario;
import br.com.teste.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> buscarTodosUsuarios() {

		List<Usuario> usuarios = usuarioRepository.findAll();

		return usuarios;

	}

	public Usuario adicionarUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);

	}

	public Usuario excluirUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);

	}

	public Usuario editarUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

}
