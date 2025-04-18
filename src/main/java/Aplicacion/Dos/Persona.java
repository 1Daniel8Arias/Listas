package Aplicacion.Dos;

public class Persona {
    private final String nombre;
    private final String cedula;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return nombre + " - Cédula: " + cedula;
    }
}
