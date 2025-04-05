package Aplicacion.Seis;

import Aplicacion.ListaDoble.ListaDoble;

public class Main {
    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.addFirst(5);
        listaDoble.addFirst(10);
        listaDoble.addFirst(15);
        listaDoble.addFirst("hola");

        listaDoble.mostrarLista();
        System.out.println("imprimir lista hacia atras ");
        listaDoble.imprimirHaciaAtras();
    }
}
