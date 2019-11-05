package br.com.simplexagro.Simplex_Agro.exceptions;

import java.io.UnsupportedEncodingException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class CriptografiaFalha extends UnsupportedEncodingException{

}
