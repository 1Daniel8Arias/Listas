package Aplicacion.Ocho;

import Aplicacion.Dos.Persona;
import Aplicacion.ListaDoble.ListaDoble;

public class Main {
    public static void main(String[] args) {
        ListaDoble<Persona> personas = new ListaDoble<>();

        personas.addFirst(new Persona("Ana", "123456"));     // 6 dígitos - par
        personas.addFirst(new Persona("Luis", "987654321")); // 9 dígitos - impar
        personas.addFirst(new Persona("Juan", "11223344"));  // 8 dígitos - par
        personas.addFirst(new Persona("Ana", "123456")); //par 6 digitos
        personas.addFirst(new Persona("Luis", "78901"));
        personas.addFirst(new Persona("Marta", "45671234"));//par 8 digitos
        personas.addFirst(new Persona("Carlos", "10101"));
        personas.addFirst(new Persona("Elena", "334455"));//par 6 digitos


        System.out.println("Personas con cédula de longitud par:");
        ListaDoble<Persona> cedulasPares = personas.obtenerPersonasConCedulaPar();
        cedulasPares.mostrarLista();
    }
}
