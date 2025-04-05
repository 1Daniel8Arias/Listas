package Aplicacion.Once;

public class Termino {
    private double coeficiente;
    private int exponente;

    public Termino(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public int getExponente() {
        return exponente;
    }
}
