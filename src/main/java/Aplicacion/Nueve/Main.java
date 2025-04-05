package Aplicacion.Nueve;

import Aplicacion.ListaSimpleCircular.ListaSimpleCircular;

public class Main {
    public static void main(String[] args) {
        ListaSimpleCircular<String> lista = new ListaSimpleCircular<>();

        lista.agregarInicio("A");
        lista.agregarInicio("B");
        lista.agregarInicio("C");
        lista.agregarInicio("D");
        lista.agregarInicio("E");
        lista.agregarInicio("F");
        lista.agregarInicio("G");


        System.out.println("Buscar G: índice " + lista.buscar("G")); // debería imprimir 1
        System.out.println("Buscar X: índice " + lista.buscar("X")); // debería imprimir -1
    }
}
