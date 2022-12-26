package Jogo;
import Tabuleiro.Tabuleiro;

public class Jogo {
    public void Jogo () {
    }

    public static void main(String args[]) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.PrintTab(tabuleiro.matriz);
		System.out.println("Insira a posição x: ");
		int x = tabuleiro.Input(tabuleiro.scanner);
		System.out.println("Insira a posição y: ");
		int y = tabuleiro.Input(tabuleiro.scanner);
		System.out.print(x + " " + y);
    }
}