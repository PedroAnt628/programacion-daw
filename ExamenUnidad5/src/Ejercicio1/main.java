package Ejercicio1;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println(new java.io.File(".").getAbsolutePath());

        Scanner teclado = new Scanner(System.in);
        //Ruta del fichero: ./src/Ejercicio1/ejemplo.java
        System.out.print("Introduce el nombre del fichero: ");
        String nombre = teclado.nextLine();

        File f = new File(nombre);
        if (!f.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().startsWith("//")) {
                    lineas.add(linea);
                }
            }
        } catch (Exception e) {
            System.out.println("Error leyendo archivo.");
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            for (String l : lineas) {
                pw.println(l);
            }
        } catch (Exception e) {
            System.out.println("Error escribiendo archivo.");
        }

        System.out.println("Comentarios eliminados correctamente.");
    }
}

