package Tabuleiro;



//import java.util.ArrayList;
import java.util.Scanner;


public class Tabuleiro {
	
	private int linha = 10;
	private int coluna = 10;
	Scanner scanner = new Scanner(System.in);
	
	private int[][] matriz;

	public static void main(String args[]) {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.PrintTab(tabuleiro.matriz);
	}
	
	public Tabuleiro() {
		
		
		
		matriz = new int[this.linha][this.coluna];
		
		
		for (int i = 0; i < this.linha; i++) {
			for (int j = 0; j < this.coluna; j++) {
				
				matriz[i][j] = 0;
				
			}
		}
				     
		}
		
	
	public static void PrintTab(int[][] matriz) {
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


	public int getLinha() {
		
		return this.linha;
		
	}
	
	public int getColuna() {
		
		return this.coluna;
		
	}
	
	public int [][] getMatriz() {
		
		return this.matriz;
		
	}
	
	public static int Input(Scanner scanner) {

		return scanner.nextInt();
	}
	
	
	//public void print() {
        
        //System.out.println("");
        
    //}

}
