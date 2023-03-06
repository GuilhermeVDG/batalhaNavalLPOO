package Jogo;
import Tabuleiro.*;
import java.io.IOException;


public class Jogo {
    public void Jogo () {
    }


    public static void main(String args[]) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.PrintTab(tabuleiro.matriz);
		System.out.println("Insira a posicao x do porta avioes: ");
		int x = tabuleiro.Input(tabuleiro.scanner);
		System.out.println("Insira a posicao y do porta avioes: ");
		int y = tabuleiro.Input(tabuleiro.scanner);
		tabuleiro.setPositions(x, y);
        tabuleiro.setPosicaoPortaAvioes();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        tabuleiro.PrintTab(tabuleiro.matriz);

        System.out.println("Insira a posicao x do quatro canos: ");
		x = tabuleiro.Input(tabuleiro.scanner);
		System.out.println("Insira a posicao y do quatro canos: ");
		y = tabuleiro.Input(tabuleiro.scanner);
		tabuleiro.setPositions(x, y);
        tabuleiro.setPosicaoQuatroCanos();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        tabuleiro.PrintTab(tabuleiro.matriz);

        for(int i = 0; i < 2; i++) {
            System.out.println("Insira a posicao x do tres canos: ");
            x = tabuleiro.Input(tabuleiro.scanner);
            System.out.println("Insira a posicao y do tres canos: ");
            y = tabuleiro.Input(tabuleiro.scanner);
            tabuleiro.setPositions(x, y);
            tabuleiro.setPosicaoTresCanos();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            tabuleiro.PrintTab(tabuleiro.matriz);
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Insira a posicao x do dois canos: ");
            x = tabuleiro.Input(tabuleiro.scanner);
            System.out.println("Insira a posicao y do dois canos: ");
            y = tabuleiro.Input(tabuleiro.scanner);
            tabuleiro.setPositions(x, y);
            tabuleiro.setPosicaoDoisCanos();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            tabuleiro.PrintTab(tabuleiro.matriz);
        }

        for(int i = 0; i < 4; i++) {
            System.out.println("Insira a posicao x do um cano: ");
            x = tabuleiro.Input(tabuleiro.scanner);
            System.out.println("Insira a posicao y do um cano: ");
            y = tabuleiro.Input(tabuleiro.scanner);
            tabuleiro.setPositions(x, y);
            tabuleiro.setPosicaoUmCano();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            tabuleiro.PrintTab(tabuleiro.matriz);
        }

    }

}