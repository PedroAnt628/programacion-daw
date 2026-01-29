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
            System.out.print("Introduce la ruta del fichero: ");
            String ruta = teclado.nextLine();

            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));

            Path path = Paths.get(ruta);
            String nombre = path.getFileName().toString();

            int punto = nombre.lastIndexOf('.');
            String base = (punto != -1) ? nombre.substring(0, punto) : nombre;
            String extension = (punto != -1) ? nombre.substring(punto) : "";

            LocalDate fecha = LocalDate.now();
            String nuevoNombre = base + "_copia_" + fecha + extension;

            Path nuevaRuta = path.getParent().resolve(nuevoNombre);

            Files.write(nuevaRuta, contenido.getBytes());

            System.out.println("Copia creada: " + nuevaRuta);
        } catch (IOException e) {
            System.out.println("Error al procesar el fichero: " + e.getMessage());
        }

        teclado.close();
    }
}


