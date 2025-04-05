package Aplicacion.Trece;

public class Lista {
    NodoLista inicio;

    public Lista() {
        inicio = null;
    }
    // Método para agregar al final
    public void agregarFinal(int x) {
        if (inicio == null) {
            inicio = new NodoLista(x, null);
        } else {
            NodoLista aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = new NodoLista(x, null);
        }
    }


    public int maximaDistancia(int clave) {
        return maximaDistanciaRec(inicio, clave, 0, -1, 0);
    }

    private int maximaDistanciaRec(NodoLista nodo, int clave, int pos, int ultimaPosClave, int maximaDistancia) {
        if (nodo == null) {
            return maximaDistancia;
        }

        if (nodo.dato == clave) {
            if (ultimaPosClave != -1) {
                int distancia = pos - ultimaPosClave;
                if (distancia > maximaDistancia) {
                    maximaDistancia = distancia;
                }
            }
            ultimaPosClave = pos;
        }

        return maximaDistanciaRec(nodo.sig, clave, pos + 1, ultimaPosClave, maximaDistancia);
    }
}


