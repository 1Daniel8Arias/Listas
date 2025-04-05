package Aplicacion.ListaSimpleCircular;

import Aplicacion.ListaSimple.Nodo;

import java.util.Iterator;

public class ListaSimpleCircular<T> {

    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;
    private int size;

    public ListaSimpleCircular() {
        nodoPrimero = null;
        nodoUltimo = null;
        size = 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void agregarInicio(T dato) {

        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (isEmpty()) {
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo;
            nuevoNodo.setNodoSiguiente(nuevoNodo); // apunta a sí mismo
        } else {
            nodoUltimo.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoSiguiente(nodoPrimero);
            nodoUltimo = nuevoNodo;
        }

        size++;
    }

    public void imprimirLista() {

        Nodo<T> aux = nodoPrimero;

        while (aux != null) {
            System.out.print(aux.getDato() + "\t");
            aux = aux.getNodoSiguiente();
        }

        System.out.println();
    }

    private boolean indiceValido(int indice) {
        if( indice>=0 && indice<size ) {
            return true;
        }
        throw new RuntimeException("Índice no válido");
    }

    public int obtenerPosicionNodo(T dato) {

        int i = 0;

        for( Nodo<T> aux = nodoPrimero ; aux!=null ; aux = aux.getNodoSiguiente() ) {
            if( aux.getDato().equals(dato) ) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public int buscar(T dato) {

        if (isEmpty()) return -1;

        Nodo<T> aux = nodoPrimero;
        int index = 0;

        do {
            if (aux.getDato().equals(dato)) {
                return index;
            }
            aux = aux.getNodoSiguiente();
            index++;
        } while (aux != nodoPrimero);

        return -1;
    }


    }


