package Celula;

//import java.util.ArrayList;

public class Celula {
	
	private int valor;
	private boolean posicao;
	private int Navios[][];
	private int Ataques[][];
	
	public Celula() {
		
		
		this.setValor(valor);
		
		if(valor == 0) {
			
			this.posicao = true;
			
		}
		else {
			
			this.posicao = false;
			
		}		

	}

	
	public int getValor (int valor) {
		
		return this.valor;
		
	}
	
	public void setValor (int valor) {
		
		if (valor > 0 && valor < 10) {
			
			this.valor = valor;
	
		}
		
	}
	
	
	public void setPosicao (boolean posicao) {
		
		this.posicao = posicao;
		
	}
	
	public boolean getPosicao (boolean posicao) {
		
		return this.posicao; 
		
	}
	

	public int[][] getNavios (int Navios[][]) {
	
		return this.Navios;
	
}
	
	public int[][] getAtaques (int Ataques[][]) {
		
		return this.Ataques;
		
	}

}