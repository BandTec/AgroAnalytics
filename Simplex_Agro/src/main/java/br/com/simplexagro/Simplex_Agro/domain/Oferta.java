package br.com.simplexagro.Simplex_Agro.domain;

public class Oferta {
	
	private int id;
	
	private double valorVendaPretendido;
	
	private boolean acordo;
	
	private double valorCompraPretendido;

	public int getIdOferta() {
		
		return id;
		
	}

	public double getValorVendaPretendido() {
		
		return valorVendaPretendido;
		
	}

	public void setValorVendaPretendido(double valorVendaPretendido) {
		
		this.valorVendaPretendido = valorVendaPretendido;
		
		return;
	}
	
	public boolean isAcordo() {
		
		return acordo;
		
	}

	public void setAcordo(boolean acordo) {
		
		this.acordo = acordo;
		
		return; 
	}

	public double getValorCompraPretendido() {
		
		return valorCompraPretendido;
		
	}

	public void setValorCompraPretendido(double valorCompraPretendido) {
		
		this.valorCompraPretendido = valorCompraPretendido;
		
		return;
		
	}
	
	

}
