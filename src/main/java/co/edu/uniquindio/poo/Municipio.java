package co.edu.uniquindio.poo;


public class Municipio {
    private String nombre;
    private double sobrecosto;

    public Municipio(String nombre, double sobrecosto) {
        this.nombre = nombre;
        this.sobrecosto = sobrecosto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSobrecosto() {
        return sobrecosto;
    }
}