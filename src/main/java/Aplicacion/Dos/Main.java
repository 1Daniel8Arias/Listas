package Aplicacion.Dos;

import Aplicacion.ListaSimple.ListaSimple;

public class Main {

    public static void main(String[] args) {
        // Crear la lista enlazada de tipo Persona
        ListaSimple<Persona> listaPersonas = new ListaSimple<>();

        // Agregar algunos objetos Persona
        listaPersonas.addEnd(new Persona("Ana", "123456")); //par 6 digitos
        listaPersonas.addEnd(new Persona("Luis", "78901"));
        listaPersonas.addEnd(new Persona("Marta", "45671234"));//par 8 digitos
        listaPersonas.addEnd(new Persona("Carlos", "10101"));
        listaPersonas.addEnd(new Persona("Elena", "334455"));//par 6 digitos


        listaPersonas.filtrarPorLongitudParCedula();


    }

}
