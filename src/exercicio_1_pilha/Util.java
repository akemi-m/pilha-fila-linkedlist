package exercicio_1_pilha;

import java.util.Scanner;
import java.util.Stack;

public class Util {
  private int carga;
  private Stack<Integer> servidores = new Stack<>();
  private Stack<Integer> aux = new Stack<>();
  private Scanner in = new Scanner(System.in);

  public void verificarNumeroDeDias() {
    System.out.println("Bem-vindo ao data center! \n");

    System.out.println("Adicione a carga de trabalho de cada servidor, digite 0 para finalizar o cadastro: ");

    while (true) {
      carga = in.nextInt();

      if (carga == 0) {
        System.out.println("Cadastro finalizado.");
        break;
      }

      servidores.push(carga);
    }

    System.out.println(servidores);

    int dias = 0;
    boolean existeCargaMaior = true;

    while (existeCargaMaior == true) {
      existeCargaMaior = false;

      int tamanho = servidores.size();

      for (int i = 0; i < tamanho; i++) {
        if (i == tamanho - 1) {
          aux.push(servidores.pop());
          break;
        }

        int ultimo = servidores.pop();
        int penultimo = servidores.peek();

        if (ultimo <= penultimo) {
          aux.push(ultimo);
          continue;
        }
        existeCargaMaior = true;
      }

      while (!aux.empty()) {
        servidores.push(aux.pop());
      }

      if (existeCargaMaior == false) {
        break;
      }

      dias++;
    }

    if (dias == 0) {
      System.out.println("Nenhum dia até que nenhum servidor mais seja desligado.");
    } else if (dias == 1) {
      System.out.println(1 + " dia até que nenhum servidor mais seja desligado.");
    } else {
      System.out.println(dias + " dias até que nenhum servidor mais seja desligado.");
    }
  }
}
