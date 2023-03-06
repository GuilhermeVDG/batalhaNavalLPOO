package Tabuleiro;


//import java.util.ArrayList;
import java.util.Scanner;


public class Tabuleiro {
	
	public int linha = 10;
	public int coluna = 10;
	public int positionX;
	public int positionY;
	public int direction;
	public Scanner scanner = new Scanner(System.in);
	
	public int[][] matriz;
	public int[][] Navios;
	
	public Tabuleiro() {
		matriz = new int[this.linha][this.coluna];
		
		
		for (int i = 0; i < this.linha; i++) {
			for (int j = 0; j < this.coluna; j++) {
				
				matriz[i][j] = 0;
				
			}
		}
				     
	}
		
	
	public void PrintTab(int[][] matriz) {
		System.out.println("       0     1     2     3     4     5     6     7     8     9 ");
        System.out.println("    +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            
            for (int j = 0; j < 10; j++) {
                System.out.print("  |  " + matriz[i][j]);
            }
            System.out.println("  |");
            System.out.println("    +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        }

            
 }

	public void setPosicaoPortaAvioes() {
			for(int i = 0; i < 3; i++){
					for(int j = 0; j < 3; j++){
						matriz[this.positionX][this.positionY + i] = 1;        
						matriz[this.positionX + j][this.positionY + 1] = 1;							 																						
					}
			} 
	}

	public void setPosicaoQuatroCanos() {
		for(int i = 0; i < 4; i++){
			matriz[this.positionX][this.positionY + i] = 1;
		}
	}

	public void setPosicaoTresCanos() {
		for(int i = 0; i < 3; i++){
			matriz[this.positionX][this.positionY + i] = 1;
		}
	}

	public void setPosicaoDoisCanos() {
		for(int i = 0; i < 2; i++){
			matriz[this.positionX][this.positionY + i] = 1;
		}
	}

	public void setPosicaoUmCano() {
		matriz[this.positionX][this.positionY] = 1;
	}


	public int getLinha() {
		
		return this.linha;
		
	}
	
	public int getColuna() {
		
		return this.coluna;
		
	}
	
	public int [][] getMatriz() {
		
		return this.matriz;
		
	}
	
	public int Input(Scanner scanner) {

		return scanner.nextInt();
	}

	public void setPositions(int x, int y) {

		this.positionX = x;
		this.positionY = y;

	}

}
