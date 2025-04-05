package Aplicacion.Cinco;

import Aplicacion.ListaSimple.ListaSimple;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.addFirst(2);
        lista.addFirst(2);
        lista.addFirst(7);
        lista.addFirst(2);
        lista.addFirst(5);
        lista.addFirst(8);

        lista.mostrarLista();
        System.out.println("numero de veces que esta en numero 2 en la lista " + lista.contarRepetidos(2));


    }
}
