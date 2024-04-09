
package co.edu.uniquindio.poo;

public class Zona {
    private String ciudad;
    private String forma;
    private String material;
    private double medida;
    private double area;

    public Zona(String ciudad, String forma, String material, double medida) {
        this.ciudad = ciudad;
        this.forma = forma;
        this.material = material;
        this.medida = medida;
        calcularArea();
    }

    private void calcularArea() {
        if (forma.equalsIgnoreCase("circulo")) {
            area = Math.PI * Math.pow(medida, 2);
        } else if (forma.equalsIgnoreCase("cuadrado") || forma.equalsIgnoreCase("rectangulo")) {
            area = medida * medida;
        } else if (forma.equalsIgnoreCase("triangulo")) {
            area = (medida * medida) / 2;
        }
    }

    public double calcularCostoTotal(double sobrecosto) {
        return area * obtenerCostoMaterial() + sobrecosto;
    }

    private double obtenerCostoMaterial() {
        return 10;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getForma() {
        return forma;
    }

    public String getMaterial() {
        return material;
    }

    public double getMedida() {
        return medida;
    }

    public double getArea() {
        return area;
    }
}