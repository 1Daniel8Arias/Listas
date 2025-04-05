package Aplicacion.Diez;

import Aplicacion.ListaSimple.ListaSimple;

import static Aplicacion.ListaSimple.ListaSimple.concatenar;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> lista1 = new ListaSimple<>();
        lista1.addEnd(1);
        lista1.addEnd(2);
        lista1.addEnd(3);

        ListaSimple<Integer> lista2 = new ListaSimple<>();
        lista2.addEnd(4);
        lista2.addEnd(5);

        ListaSimple<Integer> resultado = concatenar(lista1, lista2);

        System.out.println("Lista concatenada:");
        resultado.mostrarLista();  
    }
}

