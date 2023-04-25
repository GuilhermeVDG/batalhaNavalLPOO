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
     private int quantidade;
     private Scanner scanner = new Scanner(System.in);


     public Jogador(int numero) {
        this.tabuleiro = new Tabuleiro();
        this.umCano = new UmCano(this);
        this.doisCanos = new DoisCanos(this);
        this.tresCanos = new TresCanos(this);
        this.quatroCanos = new QuatroCanos(this);
        this.portaAvioes = new PortaAvioes(this);
        this.numero = numero;
     }

     public void escolherCustom(){
        System.out.println("Jogador: " + this.numero);
        System.out.println("Insira a quantidade de navios um cano desejados, insira 0 caso nao deseje navios desse tipo: ");
        this.quantidade = scanner.nextInt();
        this.umCano.setQuantidadeDeNavios(this.quantidade);
        System.out.println("Insira a quantidade de navios dois canos desejados, insira 0 caso nao deseje navios desse tipo: ");
        this.quantidade = scanner.nextInt();
        this.doisCanos.setQuantidadeDeNavios(this.quantidade);
        System.out.println("Insira a quantidade de navios tres canos desejados, insira 0 caso nao deseje navios desse tipo: ");
        this.quantidade = scanner.nextInt();
        this.tresCanos.setQuantidadeDeNavios(this.quantidade);
        System.out.println("Insira a quantidade de navios quatro canos desejados, insira 0 caso nao deseje navios desse tipo: ");
        this.quantidade = scanner.nextInt();
        this.quatroCanos.setQuantidadeDeNavios(this.quantidade);
        System.out.println("Insira a quantidade de porta avioes desejados, insira 0 caso nao deseje navios desse tipo: ");
        this.quantidade = scanner.nextInt();
        this.portaAvioes.setQuantidadeDeNavios(this.quantidade);
     }

     public void ataqueNavios(Tabuleiro tabuleiroInimigo, int x, int y){
        tabuleiroInimigo.setPositions(x, y);
        tabuleiroInimigo.setPosicaoTiros();
     }

    

    
     public Tabuleiro getTabuleiro(){
        return this.tabuleiro;
     }
     
     public int getNumero() {
    	 return this.numero;
     }
 }