package Navios;
import Jogador.Jogador;



public class Navio {
  private int tamanho;
  private int quantidadeDeNavios;
  private Jogador jogador;

  public Navio (int tamanho, int quantidadeDeNavios, Jogador jogador) {
    this.tamanho = tamanho;
    this.quantidadeDeNavios = quantidadeDeNavios;
    this.jogador = jogador;
  }

  public int getTamanho (){
    return this.tamanho;
  }

  public int getQuantidadeDeNavios() {
    return this.quantidadeDeNavios;
  }

  public void setTamanho (int tamanho){
    this.tamanho = tamanho;
  }

  public void setQuantidadeDeNavios(int quantidadeDeNavios) {
    this.quantidadeDeNavios = quantidadeDeNavios;
  }
}