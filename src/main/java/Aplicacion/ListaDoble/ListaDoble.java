package Aplicacion.ListaDoble;

import Aplicacion.Dos.Persona;

import java.util.Iterator;

public class ListaDoble<T> implements Iterable<T> {


    private NodoDoble<T> nodoPrimero;
    private NodoDoble<T> nodoUltimo;
    private int size;

    public ListaDoble() {
        nodoPrimero = null;
        nodoUltimo = null;
        size = 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T date) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(date);
        if (isEmpty()) {
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setNodoAdelante(nodoPrimero);
            nodoPrimero.setNodoAtras(nuevoNodo);
            nodoPrimero = nuevoNodo;

        }
        size++;
    }

    public void mostrarLista() {
        if (isEmpty()) {
            System.out.println("Lista Vacia");
        } else {
            NodoDoble<T> nodoAux = nodoPrimero;
            while (nodoAux != null) {
                System.out.println(nodoAux.getDato());
                nodoAux = nodoAux.getNodoAdelante();
            }
        }
    }

    public void imprimirHaciaAtras() {
        NodoDoble<T> nodoAux = nodoUltimo;
        if (isEmpty()) {
            System.out.println("Lista Vacia");
        } else {
            while (nodoAux != null) {
                System.out.println(nodoAux.getDato());
                nodoAux = nodoAux.getNodoAtras();
            }
        }
    }

    public ListaDoble<Persona> obtenerPersonasConCedulaPar() {
        ListaDoble<Persona> resultado = new ListaDoble<>();
        NodoDoble<T> nodoAux = nodoPrimero;

        while (nodoAux != null) {
            T dato = nodoAux.getDato();
            if (dato instanceof Persona persona) {
                int longitudCedula = persona.getCedula().length();
                if (longitudCedula % 2 == 0) {
                    resultado.addFirst(persona);
                }
            }
            nodoAux = nodoAux.getNodoAdelante();
        }

        return resultado;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorListaDoble(nodoPrimero);
    }

    protected class IteradorListaDoble implements Iterator<T> {
        private NodoDoble<T> nodo;
        private int posicion;

        public IteradorListaDoble(NodoDoble<T> nodo) {
            this.nodo = nodo;
            this.posicion = 0;
        }

        @Override
        public boolean hasNext() {
            return nodo != null;
        }

        @Override
        public T next() {
            T valor = nodo.getDato();
            nodo = nodo.getNodoAdelante();
            posicion++;
            return valor;
        }

        public boolean hasPrevious() {
            return nodo != null;
        }

        public T previous() {
            T aux = nodo.getDato();
            nodo = nodo.getNodoAtras();
            posicion--;
            return aux;
        }

    }

}
