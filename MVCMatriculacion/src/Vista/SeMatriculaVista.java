package Vista;

import java.util.Scanner;
import Modelo.SeMatricula;

public class SeMatriculaVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MATRÍCULAS ---");
        System.out.println("1. Listar");
        System.out.println("2. Insertar");
        System.out.println("3. Eliminar");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public SeMatricula pedirDatosNuevo() {
        System.out.print("Número matrícula: ");
        int mat = sc.nextInt();

        System.out.print("ID curso: ");
        int idc = sc.nextInt();

        System.out.print("Código asignatura: ");
        int cod = sc.nextInt();

        return new SeMatricula(mat, idc, cod);
    }

    public int pedirMatricula() {
        System.out.print("Número matrícula: ");
        return sc.nextInt();
    }

    public int pedirIdCurso() {
        System.out.print("ID curso: ");
        return sc.nextInt();
    }

    public int pedirCodigoAsignatura() {
        System.out.print("Código asignatura: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
