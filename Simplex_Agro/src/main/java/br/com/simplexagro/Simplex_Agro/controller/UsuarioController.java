package br.com.simplexagro.Simplex_Agro.controller;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import java.lang.String;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.simplexagro.Simplex_Agro.domain.Usuario;
import br.com.simplexagro.Simplex_Agro.exceptions.AlgoritmoFalho;
import br.com.simplexagro.Simplex_Agro.exceptions.CriptografiaFalha;
import br.com.simplexagro.Simplex_Agro.repositories.UsuarioRepository;

@RestController
@RequestMapping(name = "/")
public class UsuarioController extends Usuario{

	// instanciei o repositorio e depois foio criado o construtor dele
	
    private UsuarioRepository usuarioRepository;

	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	//depois eu apaguei a lista porque vamos salvar no banco agora não local
	// o hash vai ser o token que vamos guardar no localStorage, a criptografia do username 
	
	@GetMapping
	public byte[] verificarUsuario(@RequestParam String nome, @RequestParam String senha) throws Exception {
		// se ele não estiver na base de dados retorna null
		byte messageDigest[] = null;
		if(usuarioRepository.existsUsuarioByNomeAndSenha(nome, senha)) {
			MessageDigest algorithm;
			try {
				algorithm = MessageDigest.getInstance("MD5");

	            messageDigest = algorithm.digest(nome.getBytes("UTF-8"));

			} catch (NoSuchAlgorithmException e) {
				throw new AlgoritmoFalho();
			} catch (UnsupportedEncodingException e) {
				throw new CriptografiaFalha();
			} 
		}
		return messageDigest;
	}

	@PostMapping
	public void salvarUsuario(@RequestParam String nome, @RequestParam String senha) {
		Usuario u = new Usuario(nome, senha);
		usuarioRepository.save(u);
	}
}