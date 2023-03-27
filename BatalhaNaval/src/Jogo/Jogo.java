package Jogo;
import Tabuleiro.*;
import java.io.IOException;
import Jogador.Jogador;
import Excecao.Excecao;


public class Jogo {
    public static void main(String args[]) throws Excecao{
        Jogador primeiroJogador = new Jogador(1);
        primeiroJogador.printNavios();
        Jogador segundoJogador = new Jogador(2);
        segundoJogador.printNavios();
        primeiroJogador.ataqueNavios(segundoJogador.getTabuleiro());
        segundoJogador.ataqueNavios(primeiroJogador.getTabuleiro());
    }
}