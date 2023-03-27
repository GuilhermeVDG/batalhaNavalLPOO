package Menu;

import java.util.Scanner;

public class Menu {
  public Scanner scanner = new Scanner(System.in);
  public int escolha;
  
  public Menu() {
    this.printMenu();
  }
  
  public void printMenu(){
    System.out.println("Qual modo de jogo deseja jogar?");
    System.out.println("");
    System.out.println("1 - Batalha Naval                   2 - Batalha Naval Custom");
    System.out.println("");
    this.escolha = scanner.nextInt();
  }
}