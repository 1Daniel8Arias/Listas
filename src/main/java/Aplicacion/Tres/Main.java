package Aplicacion.Tres;

import Aplicacion.ListaSimple.ListaSimple;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();

        lista.addEnd(2);
        lista.addEnd(4);
        lista.addEnd(7);
        lista.addEnd(10);
        lista.addEnd(5);
        lista.addEnd(8);

        lista.mostrarLista();
        System.out.println("lista con numeros impares de la lista ");
        lista.eliminarNumerosPares();
        lista.mostrarLista();
    }
}
