package Jogo;
import Tabuleiro.*;
import java.io.IOException;
import Jogador.Jogador;
import Excecao.Excecao;
import Menu.Menu;


public class Jogo {
    public static void main(String args[]) throws Excecao{
        Menu menu = new Menu();

        if(menu.escolha == 1) {
            Jogador primeiroJogador = new Jogador(1);
            primeiroJogador.printNavios();
            Jogador segundoJogador = new Jogador(2);
            segundoJogador.printNavios();
            primeiroJogador.ataqueNavios(segundoJogador.getTabuleiro());
            segundoJogador.ataqueNavios(primeiroJogador.getTabuleiro());
        }
    }
}