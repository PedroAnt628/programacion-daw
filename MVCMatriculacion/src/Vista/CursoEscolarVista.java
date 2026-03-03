package Vista;

import java.util.Scanner;
import Modelo.CursoEscolar;

public class CursoEscolarVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- CURSO ESCOLAR ---");
        System.out.println("1. Listar");
        System.out.println("2. Insertar");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public CursoEscolar pedirDatosNuevo() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Año inicio: ");
        int ai = sc.nextInt();
        System.out.print("Año fin: ");
        int af = sc.nextInt();
        return new CursoEscolar(id, ai, af);
    }

    public int pedirId() {
        System.out.print("ID: ");
        return sc.nextInt();
    }

    public int pedirNuevoAnioInicio() {
        System.out.print("Nuevo año inicio: ");
        return sc.nextInt();
    }

    public int pedirNuevoAnioFin() {
        System.out.print("Nuevo año fin: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
