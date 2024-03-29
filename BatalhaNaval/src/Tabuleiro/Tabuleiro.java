package Tabuleiro;
import Excecao.Excecao;
import Interface.TabuleiroInterface;
import java.util.Scanner;


public class Tabuleiro implements TabuleiroInterface {
	
	public int linha = 10;
	public int coluna = 10;
	public int positionX;
	public int positionY;
	public Scanner scanner = new Scanner(System.in);
	
	public int[][] matriz;
	
	public Tabuleiro() {

		
		matriz = new int[this.linha][this.coluna];
		
		
		for (int i = 0; i < this.linha; i++) {
			for (int j = 0; j < this.coluna; j++) {
				
				matriz[i][j] = 0;
				
			}
		}
				     
		}
		
	
	

	public void setPosicaoNavios(int tamanho, int orientacao, int direcao) {
		if(orientacao == 2){
			if(direcao == 2) {
				if(tamanho == 1){
					matriz[this.positionX][this.positionY] = 1;
				}
				else if(tamanho == 2){
					for(int i = 0; i < 2; i++){
						matriz[this.positionX][this.positionY + i] = 1;
					}
				}
				else if(tamanho == 3) {
					for(int i = 0; i < 3; i++){
						matriz[this.positionX][this.positionY + i] = 1;
					}
				}
				else if(tamanho == 4){
					for(int i = 0; i < 4; i++){
						matriz[this.positionX][this.positionY + i] = 1;
					}
				}
				else if(tamanho == 5){
					for(int i = 0; i < 3; i++){
							for(int j = 0; j < 3; j++){
								matriz[this.positionX][this.positionY + i] = 1;        
								matriz[this.positionX + j][this.positionY + 1] = 1;							 																						
							}
					}
				}
			} else if (direcao == 1){
				if(tamanho == 1){
					matriz[this.positionX][this.positionY] = 1;
				}
				else if(tamanho == 2){
					for(int i = 0; i < 2; i++){
						matriz[this.positionX][this.positionY - i] = 1;
					}
				}
				else if(tamanho == 3) {
					for(int i = 0; i < 3; i++){
						matriz[this.positionX][this.positionY - i] = 1;
					}
				}
				else if(tamanho == 4){
					for(int i = 0; i < 4; i++){
						matriz[this.positionX][this.positionY - i] = 1;
					}
				}
				else if(tamanho == 5){
					for(int i = 0; i < 3; i++){
							for(int j = 0; j < 3; j++){
								matriz[this.positionX][this.positionY + i] = 1;        
								matriz[this.positionX + j][this.positionY + 1] = 1;							 																						
							}
					}
				}
			}
		} else if(orientacao == 1 ){
			if(direcao == 1) {
				if(tamanho == 1){
					matriz[this.positionX][this.positionY] = 1;
				}
				else if(tamanho == 2){
					for(int j = 0; j < 2; j++){
						matriz[this.positionX + j][this.positionY] = 1;
					}
				}
				else if(tamanho == 3) {
					for(int j = 0; j < 3; j++){
						matriz[this.positionX + j][this.positionY] = 1;
					}
				}
				else if(tamanho == 4){
					for(int j = 0; j < 4; j++){
						matriz[this.positionX + j][this.positionY] = 1;
					}
				}
				else if(tamanho == 5){
					for(int i = 0; i < 3; i++){
							for(int j = 0; j < 3; j++){
								matriz[this.positionX][this.positionY + i] = 1;        
								matriz[this.positionX + j][this.positionY + 1] = 1;							 																						
							}
					}
				}
			} else if(direcao == 2){
				if(tamanho == 1){
					matriz[this.positionX][this.positionY] = 1;
				}
				else if(tamanho == 2){
					for(int j = 0; j < 2; j++){
						matriz[this.positionX - j][this.positionY] = 1;
					}
				}
				else if(tamanho == 3) {
					for(int j = 0; j < 3; j++){
						matriz[this.positionX - j][this.positionY] = 1;
					}
				}
				else if(tamanho == 4){
					for(int j = 0; j < 4; j++){
						matriz[this.positionX - j][this.positionY] = 1;
					}
				}
				else if(tamanho == 5){
					for(int i = 0; i < 3; i++){
							for(int j = 0; j < 3; j++){
								matriz[this.positionX][this.positionY + i] = 1;        
								matriz[this.positionX + j][this.positionY + 1] = 1;							 																						
							}
					}
				}
			}
		}
		
	}

	public void printTabInimigo(){
		System.out.println("       0     1     2     3     4     5     6     7     8     9 ");
        System.out.println("    +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            
            for (int j = 0; j < 10; j++) {
                System.out.print("  |  " + ((matriz[i][j] == 1) ? 0 : matriz[i][j]));
            }
            System.out.println("  |");
            System.out.println("    +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        }
	}

	public void setPosicaoTiros(){
		if(matriz[this.positionX][this.positionY] == 1) {
			matriz[this.positionX][this.positionY] = 2;
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
	
	public int InputNum(Scanner scanner) {

		return scanner.nextInt();
	}

	public String InputStr(Scanner scanner) {

		return scanner.nextLine();
	}	

	public void setPositions(int x, int y)  {

		if (x >= 0 && x <= 9 && y >= 0 && y <= 9)  {
			this.positionX = x;
			this.positionY = y;}
	}
}
	
