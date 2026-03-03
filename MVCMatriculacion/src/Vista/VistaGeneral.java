package Vista;

import java.util.Scanner;

public class VistaGeneral {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenuPrincipal() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Gestionar Curso Escolar");
        System.out.println("2. Gestionar Alumnos");
        System.out.println("3. Gestionar Profesores");
        System.out.println("4. Gestionar Asignaturas");
        System.out.println("5. Gestionar Matrículas (SeMatricula)");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
