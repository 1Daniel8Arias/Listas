package Aplicacion.Doce;

import Aplicacion.ListaSimple.ListaSimple;
import Aplicacion.ListaSimple.Nodo;

public class Estadistica {

    public static double calcularMedia(ListaSimple<Double> lista) {
        double suma = 0;
        Nodo<Double> aux = lista.getNodoFrente();
        while (aux != null) {
            suma += aux.getDato();
            aux = aux.getNodoSiguiente();
        }
        return suma / lista.getSize();
    }

    public static double calcularDesviacionEstandar(ListaSimple<Double> lista, double media) {
        double suma = 0;
        Nodo<Double> aux = lista.getNodoFrente();
        while (aux != null) {
            suma += Math.pow(aux.getDato() - media, 2);
            aux = aux.getNodoSiguiente();
        }
        return Math.sqrt(suma / (lista.getSize() - 1));
    }
}
