package exercicio_2_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Util {
  private Queue<Integer> fila = new LinkedList<Integer>();
  private int n;
  private int k;
  private Scanner in = new Scanner(System.in);
  private int primeiroDaFila;

  public void jogoCadeiraMusicalVirtual() {
    System.out.println("Bem-vindo ao Jogo da Cadeira Musical Virtual!\n");

    System.out.println("Defina a quantidade de participantes: ");
    n = in.nextInt();

    for (int i = 1; i <= n; i++) {
      fila.add(i);
    }

    System.out.println("Defina a quantidade de batidas da música: ");
    k = in.nextInt();

    while (fila.size() != 1) {
      for (int i = 0; i < k - 1; i++) {
        primeiroDaFila = fila.poll();
        fila.add(primeiroDaFila);
      }

      System.out.println("Participante " + fila.poll() + " perdeu a cadeira.");
    }

    System.out.println("\nVencedor: " + fila.element());

  }
}
