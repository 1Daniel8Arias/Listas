package Aplicacion.ListaSimple;

import Aplicacion.Dos.Persona;

public class ListaSimple<T> {

    private int size;
    private Nodo<T> nodoFrente;
    private Nodo<T> nodoFinal;

    public ListaSimple() {
        this.size = 0;
        this.nodoFrente = null;
        this.nodoFinal = null;

    }

    public Nodo<T> getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoFinal(Nodo<T> nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    public Nodo<T> getNodoFrente() {
        return nodoFrente;
    }

    public void setNodoFrente(Nodo<T> nodoFrente) {
        this.nodoFrente = nodoFrente;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T date) {
        Nodo<T> nuevo = new Nodo<T>(date);
        if (isEmpty()) {
            nodoFrente = nuevo;
            nodoFinal = nuevo;
        } else {
            nuevo.setNodoSiguiente(nodoFrente);
            nodoFrente = nuevo;

        }
        size++;
    }

    public void addEnd(T date) {
        Nodo<T> nuevo = new Nodo<T>(date);
        if (isEmpty()) {
            nodoFrente = nuevo;
            nodoFinal = nuevo;
        } else {
            nodoFinal.setNodoSiguiente(nuevo);
            nodoFinal = nuevo;
        }
        size++;
    }

    public void mostrarLista() {
        Nodo<T> aux = nodoFrente;
        if (isEmpty()) {
            System.out.println("Lista Vacia");
        } else {
            while (aux != null) {
                System.out.println(aux.getDato());
                aux = aux.getNodoSiguiente();
            }
        }
    }

    public void mostarListaImpares() {
        if (isEmpty()) {
            System.out.println("Lista Vacia");
        } else {
            Nodo<T> aux = nodoFrente;
            int cont = 0;

            while (aux != null) {
                if (cont % 2 != 0) {
                    System.out.println(aux.getDato());

                }
                aux = aux.getNodoSiguiente();
                cont++;
            }
        }
    }


    public void filtrarPorLongitudParCedula() {

        Nodo<T> actual = nodoFrente;
        while (actual != null) {
            T dato = actual.getDato();

            if (dato instanceof Persona p) {
                if (p.getCedula().length() % 2 == 0) {
                    System.out.println("" + p);
                }
            }
            actual = actual.getNodoSiguiente();
        }
    }

    public void eliminarNumerosPares() {
        // Eliminar nodos desde el inicio que sean Integer pares
        while (nodoFrente != null && nodoFrente.getDato() instanceof Integer && ((Integer) nodoFrente.getDato()) % 2 == 0) {
            nodoFrente = nodoFrente.getNodoSiguiente();
            size--;
        }

        if (nodoFrente == null) {
            nodoFinal = null;
            return;
        }

        Nodo<T> actual = nodoFrente;
        while (actual.getNodoSiguiente() != null) {
            T dato = actual.getNodoSiguiente().getDato();
            if (dato instanceof Integer && ((Integer) dato) % 2 == 0) {
                actual.setNodoSiguiente(actual.getNodoSiguiente().getNodoSiguiente());
                size--;
            } else {
                actual = actual.getNodoSiguiente();
            }
        }

        nodoFinal = actual;
    }

    public ListaSimple<T> obtenerNumerosImpares() {
        ListaSimple<T> resultado = new ListaSimple<>();

        Nodo<T> actual = nodoFrente;
        while (actual != null) {
            T dato = actual.getDato();
            if (dato instanceof Integer) {
                if (((Integer) dato) % 2 != 0) {
                    resultado.addFirst(dato);
                }
            }
            actual = actual.getNodoSiguiente();
        }

        return resultado;
    }

    public int contarRepetidos(T valor) {
        int contador = 0;
        Nodo<T> actual = nodoFrente;

        while (actual != null) {
            if (actual.getDato().equals(valor)) {
                contador++;
            }
            actual = actual.getNodoSiguiente();
        }

        return contador;
    }

    public static <T> ListaSimple<T> concatenar(ListaSimple<T> lista1, ListaSimple<T> lista2) {
        ListaSimple<T> nuevaLista = new ListaSimple<>();

        Nodo<T> actual = lista1.getNodoFrente();
        while (actual != null) {
            nuevaLista.addEnd(actual.getDato());
            actual = actual.getNodoSiguiente();
        }

        actual = lista2.getNodoFrente();
        while (actual != null) {
            nuevaLista.addEnd(actual.getDato());
            actual = actual.getNodoSiguiente();
        }

        return nuevaLista;
    }



}
