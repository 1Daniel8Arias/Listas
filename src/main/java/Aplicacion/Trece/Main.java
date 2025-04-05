package Aplicacion.Trece;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Agregamos los valores de la lista según la imagen
        lista.agregarFinal(9);
        lista.agregarFinal(4);
        lista.agregarFinal(6);
        lista.agregarFinal(8);
        lista.agregarFinal(4);
        lista.agregarFinal(5);
        lista.agregarFinal(4);
        lista.agregarFinal(4);

        int clave = 4;
        int distanciaMaxima = lista.maximaDistancia(clave);
        System.out.println("Máxima distancia para la clave " + clave + " es: " + distanciaMaxima);
    }
}

