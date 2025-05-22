package exercicio_3_lista_encadeada;

import java.util.LinkedList;

public class Util {

  public void intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {

    if (verificarListas(lista1, lista2) == false) {
      System.out.println("Os números das listas devem estar em ordem crescente.");
      return;
    }

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
    System.out.println(aux);
  }

  public boolean verificarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {

    for (int i = 1; i < lista1.size(); i++) {
      if (lista1.get(i) <= lista1.get(i - 1)) {
        return false;
      }
    }

    for (int i = 1; i < lista2.size(); i++) {
      if (lista2.get(i) <= lista2.get(i - 1)) {
        return false;
      }
    }
    return true;
  }

}
