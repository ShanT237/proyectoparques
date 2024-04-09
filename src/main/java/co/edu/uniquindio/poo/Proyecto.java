package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Proyecto {
    private String nombre;
    private Collection<Parque> parques;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        parques = new ArrayList<>();
    }

    public void agregarParque(Parque parque) {
        parques.add(parque);
    }

    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Parque parque : parques) {
            costoTotal += parque.calcularCostoTotal(obtenerSobrecosto(parque));
        }
        return costoTotal;
    }

    private double obtenerSobrecosto(Parque parque) {
        String ciudad = parque.getZonas().get(0).getCiudad();
        switch (ciudad.toLowerCase()) {
            case "armenia":
                return 0;
            case "calarca":
                return 10000;
            case "montenegro":
                return 20000;
            case "quimbaya":
                return 30000;
            case "tebaida":
                return 15000;
            case "circasia":
                return 18000;
            case "filandia":
                return 22000;
            case "genova":
                return 70000;
            case "salento":
                return 50000;
            case "pijao":
                return 40000;
            case "cordoba":
                return 30000;
            case "buenavista":
                return 35000;
            default:
                return 0; 
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Parque> getParques() {
        return parques;
    }
}
