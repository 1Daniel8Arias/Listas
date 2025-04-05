package Aplicacion.ListaSimple;

public class Nodo<T> {

    private T dato;
    private Nodo<T> nodoSiguiente;

    public Nodo(T dato) {
        super();
        this.dato = dato;
        this.nodoSiguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo<T> nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }


}
