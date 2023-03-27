package Jogador;
import Tabuleiro.*;
import Navios.*;
import java.util.ArrayList;
import java.util.Scanner;
import Excecao.Excecao;

public class Jogador {
     private Tabuleiro tabuleiro;
     private DoisCanos doisCanos;
     private PortaAvioes portaAvioes;
     private QuatroCanos quatroCanos;
     private UmCano umCano;
     private TresCanos tresCanos;
     private int numero;


     public Jogador(int numero) {
        this.tabuleiro = new Tabuleiro();
        this.umCano = new UmCano(this);
        this.doisCanos = new DoisCanos(this);
        this.tresCanos = new TresCanos(this);
        this.quatroCanos = new QuatroCanos(this);
        this.portaAvioes = new PortaAvioes(this);
        this.numero = numero;

     }

     public void ataqueNavios(Tabuleiro tabuleiroInimigo) throws Excecao{
        tabuleiroInimigo.printTabInimigo();
        
        for(int i = 0; i < 3; i++){
            tabuleiroInimigo.printTabInimigo();
            System.out.printf("Insira a posicao x do %d tiro: ", i);
            int x = tabuleiroInimigo.InputNum(tabuleiroInimigo.scanner);
            System.out.printf("Insira a posicao y do %d tiro: ", i);
            int y = tabuleiroInimigo.InputNum(tabuleiroInimigo.scanner);

            tabuleiroInimigo.setPositions(x, y);
            tabuleiroInimigo.setPosicaoTiros();
        }
     }

     public void escolherPosicaoNavio (Navio tamanho) throws Excecao{

        if(tamanho.getTamanho() == 1) {
            tabuleiro.PrintTab(tabuleiro.matriz);
            System.out.println("Insira a posicao x de um cano: ");
            int x = tabuleiro.InputNum(tabuleiro.scanner);
            System.out.println("Insira a posicao y de um cano: ");
            int y = tabuleiro.InputNum(tabuleiro.scanner);
            tabuleiro.setPositions(x, y);
            tabuleiro.setPosicaoNavios(tamanho.getTamanho(), 1, 1);
            
        }
        else {
            tabuleiro.PrintTab(tabuleiro.matriz);
            System.out.println("Insira a orientacao da posicao(vertical=1 ou horizontal=2): ");
            int orientacao = tabuleiro.InputNum(tabuleiro.scanner);

            if(orientacao == 1){
            System.out.println("Insira a direcao da posicao(baixo=1 ou cima=2):");
            } else if(orientacao == 2){
                System.out.print("Insira a direcao da posicao(esquerda=1 ou direita=2):");
            }

            int direcao = tabuleiro.InputNum(tabuleiro.scanner);

            System.out.printf("Insira a posicao x do navio de %d cano(s): ", tamanho.getTamanho());
            int x = tabuleiro.InputNum(tabuleiro.scanner);
            System.out.printf("Insira a posicao y do navio de %d cano(s): ", tamanho.getTamanho());
            int y = tabuleiro.InputNum(tabuleiro.scanner);

            tabuleiro.setPositions(x, y);
            tabuleiro.setPosicaoNavios(tamanho.getTamanho(), orientacao, direcao);

        }
     }

     public void printNavios() throws Excecao{
        ArrayList <Navio> navios = new ArrayList <Navio> ();
        navios.add(umCano);
        navios.add(doisCanos);
        navios.add(tresCanos);
        navios.add(quatroCanos);
        navios.add(portaAvioes);
        for(int i = 0; i < navios.size(); i++){
            for(int j = 0; j < navios.get(i).getQuantidadeDeNavios(); j++){
                System.out.println("Jogador: " + this.numero);
                System.out.printf("Escolha: Navio de %d canos numéro %d", i + 1, j + 1);
                System.out.println("");
                this.escolherPosicaoNavio(navios.get(i));
            }
        }
     }

     public Tabuleiro getTabuleiro(){
        return this.tabuleiro;
     }
 }
