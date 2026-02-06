package ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<vehiculos> vehiculo = new ArrayList<>();

        vehiculo.add(new avion(8, 15, "AFVJAY35"));
        vehiculo.add(new helicoptero(50, 2, "TURNDUW22"));
        vehiculo.add(new cocheServicio(30, "3454ASV"));

        String vehiculoMasConsumo = "";
        double consumoTotal = 0;
        int contadorVoladores = 0;

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("consumos.txt"));

            for (vehiculos e : vehiculo){
                System.out.println("---------------------------");
                e.mostrarInfo();
                System.out.printf("Consumo: %.2f\n", e.calcularConsumo());
                consumoTotal += e.calcularConsumo();

                // Guardar en fichero
                bw.write(e.getMatricula() + ";" + e.getClass().getSimpleName() + ";" + e.calcularConsumo());
                bw.newLine();

                if (e instanceof volador){
                    contadorVoladores++;
                    ((volador) e).volar();
                }
            }

            System.out.println("---------------------------");
            System.out.println("Consumo total: " + consumoTotal);
            System.out.println("Número de vehículos voladores: " + contadorVoladores);

        } catch (IOException ex) {
            System.out.println("Error al escribir en el fichero: " + ex.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }
}
