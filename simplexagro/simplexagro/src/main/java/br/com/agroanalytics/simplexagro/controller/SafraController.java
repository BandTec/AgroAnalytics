package br.com.agroanalytics.simplexagro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SafraController {
	
	@RequestMapping("/Safra")
	@ResponseBody
	public String gerarSafras() {
		
		return "Safra";
		
	}
	

}
