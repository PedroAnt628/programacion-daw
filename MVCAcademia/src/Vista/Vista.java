package Vista;

import Modelo.Alumno;
import Modelo.ExamenTeorico;
import Modelo.Profesor;
import Modelo.Practica;


import java.util.Scanner;

public class Vista {
    
private Scanner sc = new Scanner(System.in);

    public int mostrarMenuPrincipal() {
        System.out.println("\n===== MENÚ Alumno =====");
        System.out.println("1. Insertar Alumnos");
        System.out.println("2. Listar Alumnos");
        System.out.println("3. Borrar Alumno");
        System.out.println("4. Actualizar Alumno");
        System.out.println("\n===== MENÚ Profesor =====");
        System.out.println("5. Insertar Profesores");
        System.out.println("6. Listar Profesores");
        System.out.println("7. Borrar Profesor");
        System.out.println("8. Actualizar Profesor");
        System.out.println("\n===== MENÚ Examen =====");
        System.out.println("9. Insertar Exámenes");
        System.out.println("10. Listar Exámenes");
        System.out.println("11. Borrar Examen");
        System.out.println("12. Actualizar Examen");
        System.out.println("\n===== MENÚ Practica =====");
        System.out.println("13. Insertar Practicas");
        System.out.println("14. Listar Practicas");
        System.out.println("15. Borrar Practica");
        System.out.println("16. Actualizar Practica");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Alumno pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido2: ");
        String apellido2 = sc.nextLine();
        System.out.print("Grupo: ");
        String grupo = sc.nextLine();
        return new Alumno(id,nif,nombre,apellido1,apellido2,grupo);
    }

    public Profesor pedirNuevoProfesor() {
        sc.nextLine();
        System.out.print("ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido2: ");
        String apellido2 = sc.nextLine();
        return new Profesor(id,nif,nombre,apellido1,apellido2);
    }

    public ExamenTeorico pedirNuevoExamen(){
        sc.nextLine();
        System.out.print("ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Numero Preguntas: ");
        int numPreguntas = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha: ");
        String fecha = sc.nextLine();
        System.out.print("Profesor ID: ");
        int idProfesor = sc.nextInt();
        sc.nextLine();
        return new ExamenTeorico(id,titulo,numPreguntas,fecha,idProfesor);
    }

    public Practica pedirNuevaPractica(){
        sc.nextLine();
        System.out.print("ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Dificultad: ");
        String dificultad = sc.nextLine();
        
        return new Practica(id,titulo,dificultad);
    }

    public void mostrarAlumno(Alumno a) {
        System.out.println(a.getId() + " - " + a.getNif() + " - " + a.getNombre() + " " + a.getApellido1() + " " + a.getApellido2() + " - Grupo: " + a.getGrupo());
    }

    public void mostrarProfesor(Profesor p) {
        System.out.println(p.getId() + " - " + p.getNif() + " - " + p.getNombre() + " " + p.getApellido1() + " " + p.getApellido2());
    }
    
    public void mostrarExamen(ExamenTeorico e) {
        System.out.println(e.getId() + " - Titulo: " + e.getTitulo() + " - Numero Preguntas: " + e.getNumeroPreguntas() + " - Fecha: " + e.getFecha() + " - Profesor ID: " + e.getProfesorId());
    }    

    public void mostrarPractica(Practica p) {
        System.out.println(p.getId() + " - Titulo: " + p.getTitulo() + " - Dificultad: " + p.getDificultad());
    }

    public Alumno actualizarAlumno() {
        System.out.print("ID a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Alumno(id, null, nombre, null, null, null);
    }

    public Profesor actualizarProfesor() {
        System.out.print("ID a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Profesor(id, null, nombre, null, null);
    }

    public ExamenTeorico actualizarExamen() {
        System.out.print("ID a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo titulo: ");
        String titulo = sc.nextLine();
        return new ExamenTeorico(id, titulo, 0, null, 0);
    }

    public Practica actualizarPractica() {
        System.out.print("ID a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Nueva dificultad: ");
        String dificultad = sc.nextLine();
        return new Practica(id, titulo, dificultad);
    }

    public int eliminarAlumno() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public int eliminarProfesor() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public int eliminarExamen() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public int eliminarPractica() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }


}

