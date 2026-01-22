package Actividades;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class actividad78Pag18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fichero = "actividad78.csv";
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Leer alumnos");
            System.out.println("2. Insertar alumno");
            System.out.println("3. Modificar nombre por ID");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    leerAlumnos(fichero);
                    break;
                case 2:
                    insertarAlumno(fichero, teclado);
                    break;
                case 3:
                    modificarNombre(fichero, teclado);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);

        teclado.close();
    }

    // Leer y mostrar alumnos
    public static void leerAlumnos(String fichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    // Insertar nuevo alumno
    public static void insertarAlumno(String fichero, Scanner sc) {
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            // Leer primera línea (cabecera)
            String cabecera = br.readLine();
            String[] columnas = cabecera.split(",");

            // Pedir datos según las columnas
            StringBuilder nuevaFila = new StringBuilder();
            for (int i = 0; i < columnas.length; i++) {
                System.out.print("Introduce " + columnas[i] + ": ");
                String dato = sc.nextLine();
                nuevaFila.append(dato);
                if (i < columnas.length - 1) nuevaFila.append(",");
            }

            // Escribir al final del fichero
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true))) {
                bw.newLine();
                bw.write(nuevaFila.toString());
            }

            System.out.println("Alumno insertado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al insertar alumno: " + e.getMessage());
        }
    }

    // Modificar nombre por ID
    public static void modificarNombre(String fichero, Scanner sc) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return;
        }

        // Mostrar alumnos
        System.out.println("Alumnos actuales:");
        for (String l : lineas) {
            System.out.println(l);
        }

        // Pedir ID y nuevo nombre
        System.out.print("Introduce el ID del alumno a modificar: ");
        String id = sc.nextLine();
        System.out.print("Introduce el nuevo nombre: ");
        String nuevoNombre = sc.nextLine();

        // Buscar y modificar
        for (int i = 1; i < lineas.size(); i++) {
            String[] partes = lineas.get(i).split(",");
            if (partes[0].equals(id)) {
                partes[1] = nuevoNombre; // columna Nombre
                lineas.set(i, String.join(",", partes));
                System.out.println("Nombre modificado correctamente.");
                break;
            }
        }

        // Sobrescribir fichero
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (String l : lineas) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
    }
}



