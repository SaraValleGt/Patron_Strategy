public class Main {
    public static void main(String[] args) {
        // Crear un objeto NavegadorGPS con la estrategia de ruta más rápida
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a la estrategia de ruta más corta
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a la estrategia de ruta más económica
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");
    }
}
