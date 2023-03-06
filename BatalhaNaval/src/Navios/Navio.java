package Navios;

public class Navio {
  private int tamanho;
  private int quantidadeDeNavios;

  public Navio (int tamanho, int quantidadeDeNavios) {
    this.tamanho = tamanho;
    this.quantidadeDeNavios = quantidadeDeNavios;
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