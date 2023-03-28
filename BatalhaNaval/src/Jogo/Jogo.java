package Jogo;
import Tabuleiro.*;
import java.io.IOException;
import Jogador.Jogador;
import Excecao.Excecao;
import Menu.Menu;


public class Jogo {
    public static void main(String args[]) throws Excecao{
        Menu menu = new Menu();
        Jogador primeiroJogador = new Jogador(1);
        Jogador segundoJogador = new Jogador(2);
        if(menu.escolha == 2) {
            primeiroJogador.escolherCustom();
            segundoJogador.escolherCustom();
        }
        primeiroJogador.printNavios();
        segundoJogador.printNavios();
        primeiroJogador.ataqueNavios(segundoJogador.getTabuleiro());
        segundoJogador.ataqueNavios(primeiroJogador.getTabuleiro());
    }
}