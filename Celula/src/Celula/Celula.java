package Celula;

public class Celula {
	
	private int valor;
	private boolean posicao;
	
	public Celula() {
		
		this.setValor(valor);
		
		this.posicao = false;

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
	
}
