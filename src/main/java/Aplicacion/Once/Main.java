package Aplicacion.Once;

public class Main {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio();

        // Representa el polinomio: 3x^4 - 4x^2 + 11
        polinomio.agregarTermino(3, 4);
        polinomio.agregarTermino(-4, 2);
        polinomio.agregarTermino(11, 0);

        // Mostrar tabla de valores de x = 0.0 a 5.0 (cada 0.5)
        System.out.println("Tabla de valores del polinomio:");
        System.out.println("x\tP(x)");

        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double resultado = polinomio.evaluar(x);
            System.out.printf("%.1f\t%.4f\n", x, resultado);
        }
    }
}

