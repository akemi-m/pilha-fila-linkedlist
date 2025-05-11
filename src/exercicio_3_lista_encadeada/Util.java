package exercicio_3_lista_encadeada;

import java.util.LinkedList;

public class Util {

  public LinkedList<Integer> intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {

    LinkedList<Integer> aux = new LinkedList<Integer>();
    int primeiroLista1;
    int primeiroLista2;

    while (lista1.size() != 0 && lista2.size() != 0) {
      primeiroLista1 = lista1.getFirst();
      primeiroLista2 = lista2.getFirst();

      if (primeiroLista1 < primeiroLista2) {
        aux.add(primeiroLista1);
        lista1.removeFirst();
      } else {
        aux.add(primeiroLista2);
        lista2.removeFirst();
      }
    }

    while (!lista2.isEmpty()) {
      aux.add(lista2.removeFirst());
    }

    while (!lista1.isEmpty()) {
      aux.add(lista1.removeFirst());
    }
    return aux;
  }

}
