package Aplicacion.Uno;

import Aplicacion.ListaSimple.ListaSimple;

public class MainUno {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addFirst(4);
        lista.addFirst(5);
        lista.addFirst(6);


        lista.mostrarLista();
        System.out.println("numeros en las posiciones impares de la lista ");
        lista.mostarListaImpares();


    }
}
