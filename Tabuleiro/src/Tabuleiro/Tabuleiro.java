package Tabuleiro;
//import Celula;

public class Tabuleiro {
	
	private int linhas = 10;
	private int colunas = 10;
	
	private Tabuleiro[][] matriz;
	
	public Tabuleiro() {
		
		matriz = new Tabuleiro [this.linhas][this.colunas];
		
		for (int i = 0; i < this.linhas; i++) {
			for (int j = 0; j < this.colunas; j++) {
				
				matriz [i][j] = new Tabuleiro();
				//System.out.print("");
			}
		}
	}
	
	//public Tabuleiro[][] setMatriz{
		
	//	return this.matriz;
	//}
}
