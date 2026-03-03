package Controlador;

import Modelo.*;
import Vista.VistaGeneral;
import java.sql.Date;
import java.util.Scanner;

public class ControladorGeneral {

    private VistaGeneral vista;
    private Scanner sc = new Scanner(System.in);

    public ControladorGeneral() {
        vista = new VistaGeneral();
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenuPrincipal();

            switch (opcion) {

                case 1:
                    menuCursoEscolar();
                    break;

                case 2:
                    menuAlumno();
                    break;

                case 3:
                    menuProfesor();
                    break;

                case 4:
                    menuAsignatura();
                    break;

                case 5:
                    menuSeMatricula();
                    break;

                case 0:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;

                default:
                    vista.mostrarMensaje("Opción incorrecta");
                    break;
            }

        } while (opcion != 0);
    }

    // ============================================================
    // CURSO ESCOLAR
    // ============================================================

    private void menuCursoEscolar() {
        int op;
        do {
            System.out.println("\n--- CURSO ESCOLAR ---");
            System.out.println("1. Listar");
            System.out.println("2. Insertar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    CursoEscolarDAO.listar();
                    break;

                case 2:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Año inicio: ");
                    int ai = sc.nextInt();
                    System.out.print("Año fin: ");
                    int af = sc.nextInt();
                    CursoEscolarDAO.insertar(new CursoEscolar(id, ai, af));
                    break;

                case 3:
                    System.out.print("ID a actualizar: ");
                    int idu = sc.nextInt();
                    System.out.print("Nuevo año inicio: ");
                    int aiu = sc.nextInt();
                    System.out.print("Nuevo año fin: ");
                    int afu = sc.nextInt();
                    CursoEscolarDAO.actualizar(idu, aiu, afu);
                    break;

                case 4:
                    System.out.print("ID a eliminar: ");
                    int ide = sc.nextInt();
                    CursoEscolarDAO.borrar(ide);
                    break;
            }

        } while (op != 0);
    }

    // ============================================================
    // ALUMNO
    // ============================================================

    private void menuAlumno() {
        int op;
        do {
            System.out.println("\n--- ALUMNOS ---");
            System.out.println("1. Listar");
            System.out.println("2. Insertar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    AlumnoDAO.listar();
                    break;

                case 2:
                    System.out.print("Matrícula: ");
                    int mat = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Apellido1: ");
                    String a1 = sc.nextLine();
                    System.out.print("Apellido2: ");
                    String a2 = sc.nextLine();
                    System.out.print("Fecha nacimiento (YYYY-MM-DD): ");
                    Date fn = Date.valueOf(sc.nextLine());
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    AlumnoDAO.insertar(new Alumno(mat, nom, a1, a2, fn, tel));
                    break;

                case 3:
                    System.out.print("Matrícula a actualizar: ");
                    int matu = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nomu = sc.nextLine();
                    System.out.print("Nuevo apellido1: ");
                    String a1u = sc.nextLine();
                    System.out.print("Nuevo apellido2: ");
                    String a2u = sc.nextLine();
                    System.out.print("Nueva fecha nacimiento (YYYY-MM-DD): ");
                    Date fnu = Date.valueOf(sc.nextLine());
                    System.out.print("Nuevo teléfono: ");
                    String telu = sc.nextLine();
                    AlumnoDAO.actualizar(matu, nomu, a1u, a2u, fnu, telu);
                    break;

                case 4:
                    System.out.print("Matrícula a eliminar: ");
                    int mate = sc.nextInt();
                    AlumnoDAO.borrar(mate);
                    break;
            }

        } while (op != 0);
    }

    // ============================================================
    // PROFESOR
    // ============================================================

    private void menuProfesor() {
        int op;
        do {
            System.out.println("\n--- PROFESORES ---");
            System.out.println("1. Listar");
            System.out.println("2. Insertar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    ProfesorDAO.listar();
                    break;

                case 2:
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
                    ProfesorDAO.insertar(new Profesor(id, nom, a1, a2, esp, tel));
                    break;

                case 3:
                    System.out.print("ID a actualizar: ");
                    int idu = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nomu = sc.nextLine();
                    System.out.print("Nuevo apellido1: ");
                    String a1u = sc.nextLine();
                    System.out.print("Nuevo apellido2: ");
                    String a2u = sc.nextLine();
                    System.out.print("Nueva especialidad: ");
                    String espu = sc.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String telu = sc.nextLine();
                    ProfesorDAO.actualizar(idu, nomu, a1u, a2u, espu, telu);
                    break;

                case 4:
                    System.out.print("ID a eliminar: ");
                    int ide = sc.nextInt();
                    ProfesorDAO.borrar(ide);
                    break;
            }

        } while (op != 0);
    }

    // ============================================================
    // ASIGNATURA
    // ============================================================

    private void menuAsignatura() {
        int op;
        do {
            System.out.println("\n--- ASIGNATURAS ---");
            System.out.println("1. Listar");
            System.out.println("2. Insertar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    AsignaturaDAO.listar();
                    break;

                case 2:
                    System.out.print("Código: ");
                    int cod = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Horas: ");
                    int h = sc.nextInt();
                    System.out.print("ID Profesor: ");
                    int idp = sc.nextInt();
                    AsignaturaDAO.insertar(new Asignatura(cod, nom, h, idp));
                    break;

                case 3:
                    System.out.print("Código a actualizar: ");
                    int codu = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nomu = sc.nextLine();
                    System.out.print("Nuevas horas: ");
                    int hu = sc.nextInt();
                    System.out.print("Nuevo ID profesor: ");
                    int idpu = sc.nextInt();
                    AsignaturaDAO.actualizar(codu, nomu, hu, idpu);
                    break;

                case 4:
                    System.out.print("Código a eliminar: ");
                    int code = sc.nextInt();
                    AsignaturaDAO.borrar(code);
                    break;
            }

        } while (op != 0);
    }

    // ============================================================
    // SE MATRICULA
    // ============================================================

    private void menuSeMatricula() {
        int op;
        do {
            System.out.println("\n--- MATRÍCULAS ---");
            System.out.println("1. Listar");
            System.out.println("2. Insertar");
            System.out.println("3. Eliminar");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    SeMatriculaDAO.listar();
                    break;

                case 2:
                    System.out.print("Matrícula alumno: ");
                    int mat = sc.nextInt();
                    System.out.print("ID curso: ");
                    int idc = sc.nextInt();
                    System.out.print("Código asignatura: ");
                    int cod = sc.nextInt();
                    SeMatriculaDAO.insertar(new SeMatricula(mat, idc, cod));
                    break;

                case 3:
                    System.out.print("Matrícula alumno: ");
                    int mate = sc.nextInt();
                    System.out.print("ID curso: ");
                    int idce = sc.nextInt();
                    System.out.print("Código asignatura: ");
                    int code = sc.nextInt();
                    SeMatriculaDAO.borrar(mate, idce, code);
                    break;
            }

        } while (op != 0);
    }
}
