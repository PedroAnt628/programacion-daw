package Vista;

import java.util.Scanner;
import Modelo.Profesor;

public class ProfesorVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- PROFESORES ---");
        System.out.println("1. Listar");
        System.out.println("2. Insertar");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Profesor pedirDatosNuevo() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nom = sc.nextLine();

        System.out.print("Apellido1: ");
        String a1 = sc.nextLine();

        System.out.print("Apellido2: ");
        String a2 = sc.nextLine();

        System.out.print("Especialidad: ");
        String esp = sc.nextLine();

        System.out.print("Teléfono: ");
        String tel = sc.nextLine();

        return new Profesor(id, nom, a1, a2, esp, tel);
    }

    public int pedirId() {
        System.out.print("ID: ");
        return sc.nextInt();
    }

    public String pedirNuevoNombre() {
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        return sc.nextLine();
    }

    public String pedirNuevoApellido1() {
        System.out.print("Nuevo apellido1: ");
        return sc.nextLine();
    }

    public String pedirNuevoApellido2() {
        System.out.print("Nuevo apellido2: ");
        return sc.nextLine();
    }

    public String pedirNuevaEspecialidad() {
        System.out.print("Nueva especialidad: ");
        return sc.nextLine();
    }

    public String pedirNuevoTelefono() {
        System.out.print("Nuevo teléfono: ");
        return sc.nextLine();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
