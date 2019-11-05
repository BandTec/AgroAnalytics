package br.com.simplexagro.Simplex_Agro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simplexagro.Simplex_Agro.domain.Usuario;
// vai fazer a ponte do banco até o objeto no código
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	boolean existsUsuarioByNomeAndSenha (String nome, String senha);
}
