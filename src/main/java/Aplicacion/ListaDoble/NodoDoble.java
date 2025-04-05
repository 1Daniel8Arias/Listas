package Aplicacion.ListaDoble;

public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> nodoAdelante;
    private NodoDoble<T> nodoAtras;

    public NodoDoble(T valor) {
        this.dato = valor;
        nodoAdelante = nodoAtras = null;
    }

    public NodoDoble<T> getNodoAdelante() {
        return nodoAdelante;
    }

    public void setNodoAdelante(NodoDoble<T> nodoAdelante) {
        this.nodoAdelante = nodoAdelante;
    }

    public NodoDoble<T> getNodoAtras() {
        return nodoAtras;
    }

    public void setNodoAtras(NodoDoble<T> nodoAtras) {
        this.nodoAtras = nodoAtras;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}
