package br.com.simplexagro.Simplex_Agro.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Temporario {
	
	private static List<Double> tokenList;
	
	
	public static double gerarTemporario() {
		return new Random().nextDouble();
	}
	
	public static void addTemporario(double temp) {
		if(tokenList == null) {	
			tokenList = new ArrayList<Double>();
		}
		tokenList.add(temp); 
	}

	public static List<Double> getTokenList() {
		return tokenList;
	}

}
