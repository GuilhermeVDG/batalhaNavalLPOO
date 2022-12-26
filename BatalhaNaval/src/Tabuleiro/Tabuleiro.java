package Tabuleiro;



//import java.util.ArrayList;
import java.util.Scanner;


public class Tabuleiro {
	
	private int linha = 10;
	private int coluna = 10;
	private int postitionX;
	private int postiionY;
	private int direction;
	private Scanner scanner = new Scanner(System.in);
	
	private int[][] matriz;
	
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

	public void setPositions(int x, int y, int direction) {

		this.postitionX = x;
		this.postiionY = y;
		this.direction = direction;

	}
	
	
	//public void print() {
        
        //System.out.println("");
        
    //}

}
