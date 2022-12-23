package Tabuleiro;

//import Celula;
import java.util.ArrayList;
//import Tabuleiro;

public class Tabuleiro {
	
	private int linha = 10;
	private int coluna = 10;
	
	private Tabuleiro[][] matriz;
	
	public Tabuleiro(int Tabuleiro[][]) {
		
		matriz = new Tabuleiro [this.linha][this.coluna];
		
		//arraylist com navios
		ArrayList<Navios> navios = new ArrayList<>();
		
		//tentar adicionar os tipos de navios dentro da lista
		//navios.add(new PortaAvioes());

		
		for (int i = 0; i < this.linha; i++) {
			for (int j = 0; j < this.coluna; j++) {
				
				matriz = new Tabuleiro[this.linha][this.coluna];
				
				//System.out.print("");
			}			
		}
				
     }
	
	
	public int getLinha() {
		
		return this.linha;
		
	}
	
	public int getColuna() {
		
		return this.coluna;
		
	}
	
	public Tabuleiro[][] getMatriz() {
		
		return this.matriz;
		
	}
	
	
	
	//public void print() {
        
        //System.out.println("");
        
    //}

}
