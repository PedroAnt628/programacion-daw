package Actividades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class actividad6Pag18 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            // 1. Pedir la ruta del fichero original
            System.out.print("Introduce la ruta del fichero: ");
            String ruta = teclado.nextLine();

            // 2. Leer contenido del fichero
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));

            // 3. Obtener nombre y extensión
            Path path = Paths.get(ruta);
            String nombre = path.getFileName().toString(); // ejemplo: fichero.txt

            int punto = nombre.lastIndexOf('.');
            String base = (punto != -1) ? nombre.substring(0, punto) : nombre;
            String extension = (punto != -1) ? nombre.substring(punto) : "";

            // 4. Crear nombre nuevo con fecha
            LocalDate fecha = LocalDate.now();
            String nuevoNombre = base + "_copia_" + fecha + extension;

            // 5. Crear ruta nueva en la misma carpeta
            Path nuevaRuta = path.getParent().resolve(nuevoNombre);

            // 6. Escribir contenido en el nuevo fichero
            Files.write(nuevaRuta, contenido.getBytes());

            System.out.println("Copia creada: " + nuevaRuta);
        } catch (IOException e) {
            System.out.println("Error al procesar el fichero: " + e.getMessage());
        }

        teclado.close();
    }
}


