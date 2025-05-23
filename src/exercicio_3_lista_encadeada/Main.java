package exercicio_3_lista_encadeada;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    LinkedList<Integer> lista1 = new LinkedList<Integer>();
    LinkedList<Integer> lista2 = new LinkedList<Integer>();

    System.out.println("Bem-vindo ao organizador de listas crescentes! \n");

    System.out.println("Adicione o número da lista 1 em ordem crescente, digite 0 para finalizar o cadastro: ");
    while (true) {
      int numero = in.nextInt();

      if (numero == 0) {
        System.out.println("Cadastro da lista 1 finalizado.\n");
        break;
      }

      lista1.add(numero);
    }

    System.out.println("Adicione o número da lista 2 em ordem crescente, digite 0 para finalizar o cadastro: ");
    while (true) {
      int numero = in.nextInt();

      if (numero == 0) {
        System.out.println("Cadastro da lista 2 finalizado.\n");
        break;
      }

      lista2.add(numero);
    }

    in.close();

    System.out.println(new Util().intercalarListas(lista1, lista2));
  }
}
