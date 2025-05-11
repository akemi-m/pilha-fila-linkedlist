package exercicio_3_lista_encadeada;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> lista1 = new LinkedList<Integer>();
    LinkedList<Integer> lista2 = new LinkedList<Integer>();

    lista1.add(1);
    lista1.add(3);
    lista1.add(8);
    lista1.add(45);
    lista1.add(90);

    lista2.add(2);
    lista2.add(4);
    lista2.add(7);
    lista2.add(50);
    lista2.add(80);

    System.out.println(new Util().intercalarListas(lista1, lista2));
  }
}
