package Aplicacion.Trece;

public class NodoLista {
    int dato;
    NodoLista sig;

    public NodoLista(int x, NodoLista n) {
        this.dato = x;
        this.sig = n;
    }
}
