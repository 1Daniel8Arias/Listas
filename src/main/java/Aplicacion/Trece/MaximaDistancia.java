package Aplicacion.Trece;

public class MaximaDistancia {

    NodoLista inicio;

    public MaximaDistancia() {
        inicio = null;
    }

    // Método público que inicia la recursión
    public int maximaDistancia(int clave) {
        return maximaDistanciaRec(inicio, clave, 0, -1, 0);
    }

    // Método recursivo que calcula la máxima distancia
    private int maximaDistanciaRec(NodoLista nodo, int clave, int n, int ultimaPosicion, int maxDistancia) {
        if (nodo == null) {
            return maxDistancia; // Fin de la lista, retorna la máxima distancia encontrada
        }

        if (nodo.dato == clave) {
            if (ultimaPosicion != -1) {
                int distancia = n - ultimaPosicion; // Calcula la distancia entre ocurrencias
                maxDistancia = Math.max(maxDistancia, distancia); // Actualiza la máxima distancia
            }
            ultimaPosicion = n; // Actualiza la última posición de la clave
        }

        // Llamado recursivo al siguiente nodo
        return maximaDistanciaRec(nodo.sig, clave, n + 1, ultimaPosicion, maxDistancia);
    }

    // Método para agregar elementos a la lista (para pruebas)
    public void agregar(int dato) {
        inicio = new NodoLista(dato, inicio);
    }
}

