import java.util.Scanner;

import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args){
        // Lista de alumnos
        String[] alumnos = {"Antonio", "María", "Marggio", "Adrián", "Nicolás"};

        // Lista de materias
        String[] materias = {"Programación", "Entornos", "Bases Datos", "LMSGI"};

        // Matriz de notas: cada fila es un alumno, cada columna una materia
        double[][] notas = new double[alumnos.length][materias.length];

        // 1. Generar notas aleatorias y mostrar la tabla
        generaNotas(notas); // Llena la matriz con notas aleatorias
        imprimeNotas(alumnos, materias, notas); // Muestra la tabla de notas

        // 2. Calcular media, máximo y mínimo de un alumno (comentado)
        // obterDatosALumno(alumnos, notas);

        // 3. Ver cuántos alumnos han aprobado una materia (comentado)
        // obtenerSuperadosMaterias(materias, notas);

        // 4. Ver cuántas materias ha aprobado un alumno
        obterAprobadosALumno(alumnos, notas);
    }

    // Muestra la tabla de notas con nombres de alumnos y materias
    public static void imprimeNotas(String[] alumnos, String[] materias, double[][] notas){
    // Imprimir encabezado de materias con ancho fijo
    System.out.printf("%-12s", "Alumno");
    for (String materia : materias) {
        System.out.printf("%-15s", materia); // cada columna de materia ocupa 15 espacios
    }
    System.out.println();

    // Imprimir las notas alineadas debajo de cada materia
    for (int i = 0; i < notas.length; i++) {
        System.out.printf("%-12s", alumnos[i]); // nombre del alumno con ancho fijo
        for (int j = 0; j < notas[0].length; j++) {
            System.out.printf("%-15.1f", notas[i][j]); // nota con 1 decimal y ancho fijo
        }
        System.out.println();
    }
    System.out.println();
}


    // Llena la matriz de notas con valores aleatorios entre 0 y 10
    public static void generaNotas(double[][] notas){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = Math.random() * 10;
            }
        }
    }

    // Muestra la media, nota máxima y mínima de un alumno
    public static void obterDatosALumno(String[] alumnos, double[][] notas){
        System.out.print("Introduce el alumno: ");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        int indice = -1;

        // Buscar el índice del alumno
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equals(nombre)) indice = i;
        }

        // Si no se encuentra el alumno
        if (indice == -1) {
            System.out.println("NO hay notas del alumno " + nombre);
        } else {
            // Calcular media, máximo y mínimo
            double[] notasAlumno = notas[indice];
            double maximo = notasAlumno[0];
            double minimo = notasAlumno[0];
            double media = 0;

            for (int i = 0; i < notasAlumno.length; i++) {
                media += notasAlumno[i];
                if (maximo < notasAlumno[i]) maximo = notasAlumno[i];
                if (minimo > notasAlumno[i]) minimo = notasAlumno[i];
            }

            System.out.println("Nota media del alumno " + nombre + ": " + media / notasAlumno.length);
            System.out.println("Nota máxima del alumno " + nombre + ": " + maximo);
            System.out.println("Nota mínima del alumno " + nombre + ": " + minimo);
        }
    }

    // Muestra cuántos alumnos han aprobado una materia concreta
    public static void obtenerSuperadosMaterias(String[] materias, double[][] notas){
        System.out.print("Introduce la materia: ");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        int indice = -1;

        // Buscar el índice de la materia
        for (int i = 0; i < materias.length; i++) {
            if (materias[i].equals(nombre)) indice = i;
        }

        // Si no se encuentra la materia
        if (indice == -1) {
            System.out.println("NO existen datos de la materia " + nombre);
        } else {
            int aprobadas = 0;

            // Contar cuántos alumnos tienen nota ≥ 5 en esa materia
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][indice] >= 5) aprobadas++;
            }

            System.out.println("Han aprobado la materia " + nombre + ": " + aprobadas);
        }
    }

    // Muestra cuántas materias ha aprobado un alumno
    public static void obterAprobadosALumno(String[] alumnos, double[][] notas){
        System.out.print("Introduce el alumno: ");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        int indice = -1;

        // Buscar el índice del alumno
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equals(nombre)) indice = i;
        }

        // Si no se encuentra el alumno
        if (indice == -1) {
            System.out.println("NO hay notas del alumno " + nombre);
        } else {
            int aprobadas = 0;

            // Contar cuántas materias tiene nota ≥ 5
            for (int i = 0; i < notas[0].length; i++) {
                if (notas[indice][i] >= 5) aprobadas++;
            }

            System.out.println("El alumno " + nombre + " aprueba " + aprobadas + " módulos");
        }
    }
}

