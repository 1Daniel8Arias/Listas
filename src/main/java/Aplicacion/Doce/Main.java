package Aplicacion.Doce;

import Aplicacion.ListaSimple.ListaSimple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Double> lista = new ListaSimple<>();

        // Leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Aplicacion/Doce/numeros.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                double numero = Double.parseDouble(linea.trim());
                lista.addFirst(numero);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        // Calcular media y desviación estándar
        double media = Estadistica.calcularMedia(lista);
        double desviacion = Estadistica.calcularDesviacionEstandar(lista, media);

        System.out.printf("Media: %.4f\n", media);
        System.out.printf("Desviación estándar: %.4f\n", desviacion);
    }
}

