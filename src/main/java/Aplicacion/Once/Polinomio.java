package Aplicacion.Once;

import Aplicacion.ListaSimple.Nodo;

public class Polinomio {
    private Nodo<Termino> nodoPrimero;

    public Polinomio() {
        nodoPrimero = null;
    }

    public void agregarTermino(double coeficiente, int exponente) {
        Termino nuevo = new Termino(coeficiente, exponente);
        Nodo<Termino> nodoNuevo = new Nodo<>(nuevo);

        if (nodoPrimero == null) {
            nodoPrimero = nodoNuevo;
        } else {
            Nodo<Termino> aux = nodoPrimero;
            while (aux.getNodoSiguiente() != null) {
                aux = aux.getNodoSiguiente();
            }
            aux.setNodoSiguiente(nodoNuevo);
        }
    }

    public double evaluar(double x) {
        double resultado = 0.0;
        Nodo<Termino> aux = nodoPrimero;

        while (aux != null) {
            Termino t = aux.getDato();
            resultado += t.getCoeficiente() * Math.pow(x, t.getExponente());
            aux = aux.getNodoSiguiente();
        }

        return resultado;
    }

    public void mostrarTabla() {
        System.out.println("x\tP(x)");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            System.out.printf("%.1f\t%.4f\n", x, evaluar(x));
        }
    }
}

