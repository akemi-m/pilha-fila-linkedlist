package exercicio_2_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Util {

  public void jogoCadeiraMusicalVirtual() {
    Queue<Integer> fila = new LinkedList<Integer>();
    int n;
    int k;
    Scanner in = new Scanner(System.in);
    int primeiroDaFila;
    System.out.println("Bem-vindo ao Jogo da Cadeira Musical Virtual!\n");

    System.out.println("Defina a quantidade de participantes: ");
    while (true) {
      n = in.nextInt();
      if (n < 1) {
        System.out.println("A quantidade precisa ser maior do que 0.");
      } else {
        break;
      }
    }

    for (int i = 1; i <= n; i++) {
      fila.add(i);
    }

    System.out.println("Defina a quantidade de batidas da música: ");
    while (true) {
      k = in.nextInt();
      if (k < 1) {
        System.out.println("A quantidade precisa ser maior do que 0.");
      } else {
        break;
      }
    }

    while (fila.size() != 1) {
      for (int i = 0; i < k - 1; i++) {
        primeiroDaFila = fila.poll();
        fila.add(primeiroDaFila);
      }

      System.out.println("Participante " + fila.poll() + " perdeu a cadeira.");
    }

    System.out.println("\nVencedor: " + fila.element());

    in.close();
  }
}
