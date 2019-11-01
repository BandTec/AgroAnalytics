package br.com.agroanalytics.simplexagro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agroanalytics.simplexagro.domain.Usuario;
import br.com.agroanalytics.simplexagro.repository.UsuarioRepository;

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

	public void excluirUsuario(Long idUsuario) {
		

		this.usuarioRepository.deleteById(idUsuario);;

	}

	public Usuario editarUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

}
