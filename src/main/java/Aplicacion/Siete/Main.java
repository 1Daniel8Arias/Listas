package Aplicacion.Siete;

import Aplicacion.ListaDoble.ListaDoble;

public class Main {
    public static void main(String[] args) {
        ListaDoble<String> lista = new ListaDoble<>();
        lista.addFirst("Perro");
        lista.addFirst("Gato");
        lista.addFirst("Conejo");

        System.out.println("Elementos con foreach:");
        for (String animal : lista) {
            System.out.println(animal);
        }
    }
}

