package Vista;

import java.sql.Date;
import java.util.Scanner;
import Modelo.Alumno;

public class AlumnoVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- ALUMNOS ---");
        System.out.println("1. Listar");
        System.out.println("2. Insertar");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Alumno pedirDatosNuevo() {
        System.out.print("Número matrícula: ");
        int mat = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nom = sc.nextLine();

        System.out.print("Apellido1: ");
        String a1 = sc.nextLine();

        System.out.print("Apellido2: ");
        String a2 = sc.nextLine();

    }
}