package Aplicacion.Cuatro;

import Aplicacion.ListaSimple.ListaSimple;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.addFirst(2);
        lista.addFirst(4);
        lista.addFirst(7);
        lista.addFirst(10);
        lista.addFirst(5);
        lista.addFirst(8);

        System.out.println("Lista original:");
        lista.mostrarLista();

        ListaSimple<Integer> listaImpares = lista.obtenerNumerosImpares();

        System.out.println("Lista con valores impares:");
        listaImpares.mostrarLista();
    }
}
