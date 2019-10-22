package br.com.simplexagro.Simplex_Agro.exceptions;

import java.security.NoSuchAlgorithmException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class AlgoritmoFalho extends NoSuchAlgorithmException{

}
