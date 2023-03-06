package Jogador;
import Tabuleiro.*;
import Navios.*;
import java.util.ArrayList;

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
        this.umCano = new UmCano();
        this.doisCanos = new DoisCanos();
        this.tresCanos = new TresCanos();
        this.quatroCanos = new QuatroCanos();
        this.portaAvioes = new PortaAvioes();
        this.numero = numero;

     }

     public void direcaoDoNavio(Navio tamanho) {

        if(tamanho.getTamanho() == 1) {
            tabuleiro.PrintTab(tabuleiro.matriz);
            System.out.println("Insira a posicao x de um cano: ");
            int x = tabuleiro.InputNum(tabuleiro.scanner);
            System.out.println("Insira a posicao y de um cano: ");
            int y = tabuleiro.InputNum(tabuleiro.scanner);
            tabuleiro.setPositions(x, y);
            tabuleiro.setPosicaoNavios(tamanho.getTamanho());
            
        }
        else {
            System.out.print("Insira a orientacao da posicao(v ou h): ");
            String orientacao = tabuleiro.InputStr(tabuleiro.scanner);

            if(orientacao.equals("h")) {
            tabuleiro.PrintTab(tabuleiro.matriz);
            System.out.println("Insira a posicao x: ");
            int x = tabuleiro.InputNum(tabuleiro.scanner);
            System.out.println("Insira a posicao y: ");
            int y = tabuleiro.InputNum(tabuleiro.scanner);
            System.out.print("Insira a direcao da posicao(d ou e");
            String direcao = tabuleiro.InputStr(tabuleiro.scanner);

                if(direcao.equals("d")) {
                    tabuleiro.setPositions(x, y);
                    tabuleiro.setPosicaoNavios(tamanho.getTamanho());
                }
                else if(direcao.equals("e")) {
                    tabuleiro.setPositions(x, y);
                    tabuleiro.setPosicaoNavios2(tamanho.getTamanho());
                }
            }
            else if(orientacao.equals("v")) {
            tabuleiro.PrintTab(tabuleiro.matriz);
            System.out.println("Insira a posicao x: ");
            int x = tabuleiro.InputNum(tabuleiro.scanner);
            System.out.println("Insira a posicao y: ");
            int y = tabuleiro.InputNum(tabuleiro.scanner);
            System.out.print("Insira a direcao da posicao(c ou d");
            String direcao = tabuleiro.InputStr(tabuleiro.scanner);

                if(direcao.equals("c")) {
                    tabuleiro.setPositions(x, y);
                    tabuleiro.setPosicaoNavios3(tamanho.getTamanho());
                }
                else if(direcao.equals("b")) {
                    tabuleiro.setPositions(x, y);
                    tabuleiro.setPosicaoNavios4(tamanho.getTamanho());
                }
            }

        }
     }

     public void printNavios() {
        List <Navio> Navios = ArrayList 
     } 
 }