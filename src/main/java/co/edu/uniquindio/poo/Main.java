package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Parque parque1 = new Parque("Parque Manantial", "Ubicado en la ciudad de Armenia");
        parque1.agregarZona(new Zona("Armenia", "rectangulo", "grama sintetica", 30));

        Parque parque2 = new Parque("Parque Infantil de Salento", "Ubicado en Salento");
        parque2.agregarZona(new Zona("Salento", "cuadrado", "arena", 40));


        Proyecto proyecto = new Proyecto("Proyecto de Parques Infantiles SAS");
        proyecto.agregarParque(parque1);
        proyecto.agregarParque(parque2);

        System.out.println("Nombre del proyecto: " + proyecto.getNombre());
        System.out.println("Costo total del proyecto: $" + proyecto.calcularCostoTotal());
        System.out.println("Lista de parques:");
        for (Parque parque : proyecto.getParques()) {
            System.out.println("- Nombre del parque: " + parque.getNombre());
            System.out.println("  Descripción del parque: " + parque.getDescripcion());
            System.out.println("  Costo total del parque: $" + parque.calcularCostoTotal(obtenerSobrecosto(parque)));
            System.out.println("\n");
            }
            System.out.println("\n");
        }

        @SuppressWarnings("unused")
        private static double obtenerSobrecosto(Parque parque) {
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

  

    
}
