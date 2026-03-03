package Vista;

import java.util.Scanner;
import Modelo.Asignatura;

public class AsignaturaVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- ASIGNATURAS ---");
        System.out.println("1. Listar");
        System.out.println("2. Insertar");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Asignatura pedirDatosNuevo() {
        System.out.print("Código: ");
        int cod = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nom = sc.nextLine();

        System.out.print("Número de horas: ");
        int horas = sc.nextInt();

        System.out.print("ID Profesor: ");
        int idp = sc.nextInt();

        return new Asignatura(cod, nom, horas, idp);
    }

    public int pedirCodigo() {
        System.out.print("Código: ");
        return sc.nextInt();
    }

    public String pedirNuevoNombre() {
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        return sc.nextLine();
    }

    public int pedirNuevasHoras() {
        System.out.print("Nuevas horas: ");
        return sc.nextInt();
    }

    public int pedirNuevoProfesor() {
        System.out.print("Nuevo ID profesor: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
