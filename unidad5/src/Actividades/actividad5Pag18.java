package Actividades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class actividad5Pag18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            // 1. Leer todo el contenido del fichero
            String contenido = new String(Files.readAllBytes(Paths.get("actividad5.txt")));

            // 2. Pedir palabra al usuario
            System.out.print("Introduce la palabra a buscar: ");
            String palabra = teclado.nextLine();

            // 3. Separar el texto en palabras usando split("\\s+")
            String[] palabras = contenido.split("\\s+");

            // 4. Contar ocurrencias
            int contador = 0;
            for (String p : palabras) {
                if (p.equalsIgnoreCase(palabra)) { // equalsIgnoreCase para no distinguir mayúsculas
                    contador++;
                }
            }

            System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces.");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

        teclado.close();
    }
}


