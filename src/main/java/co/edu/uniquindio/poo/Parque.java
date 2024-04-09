package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;


public class Parque {
    private String nombre;
    private String descripcion;
    private List<Zona> zonas;

    public Parque(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        zonas = new ArrayList<>();
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public double calcularCostoTotal(double sobrecosto) {
        double costoTotal = 0;
        for (Zona zona : zonas) {
            costoTotal += zona.calcularCostoTotal(sobrecosto);
        }
        return costoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Zona> getZonas() {
        return zonas;
    }
}