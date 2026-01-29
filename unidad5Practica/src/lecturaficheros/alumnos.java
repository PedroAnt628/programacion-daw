package lecturaficheros;

import java.io.*;
import java.util.*;

class Alumno {
    private String nombre;
    private int edad;
    private ArrayList<Double> nota;

    public Alumno(String nombre, int edad, ArrayList<Double> nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    // Calcular la media de las notas 
    public double getMedia() { 
        double suma = 0;
        for(double n : nota) { 
            suma += n;
        } 
        return suma / nota.size(); 
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - Media: " + getMedia();
    }
}

public class alumnos {
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();

        try {
            // Leer el fichero alumnos.txt
            File f = new File("src/lecturaficheros/alumnos.txt");
            Scanner teclado = new Scanner(f);

            while(teclado.hasNextLine()) {
                String linea = teclado.nextLine();
                String[] partes = linea.split(";"); // separa por ;
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                
                // Convertimos las notas (del índice 2 en adelante)
                ArrayList<Double> nota = new ArrayList<>();
                for(int i = 2; i < partes.length; i++) {
                    nota.add(Double.parseDouble(partes[i]));
                }
                Alumno a = new Alumno(nombre, edad, nota);
                lista.add(a);
            }
            teclado.close();

            // Calcular la nota media global, máxima y mínima
            double suma = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            for(Alumno a : lista) {
                double mediaAlumno = a.getMedia();
                suma += mediaAlumno;

                if(mediaAlumno > max) max = mediaAlumno;
                if(mediaAlumno < min) min = mediaAlumno;
            }

            double mediaClase = suma / lista.size();
            System.out.println("Nota media de la clase: " + mediaClase);
            System.out.println("Nota máxima de la clase: " + max);
            System.out.println("Nota mínima de la clase: " + min);

            // Ordenar alumnos de mayor a menor por nota media (Bubble Sort)
            for(int i = 0; i < lista.size() - 1; i++) {
                for(int j = 0; j < lista.size() - i - 1; j++) {
                    if(lista.get(j).getMedia() < lista.get(j+1).getMedia()) {
                        Alumno temp = lista.get(j);
                        lista.set(j, lista.get(j+1));
                        lista.set(j+1, temp);
                    }
                }
            }

            System.out.println("\nAlumnos ordenados por nota media (descendente):");
            for(Alumno a : lista) {
                System.out.println(a);
            }

            // Crear fichero aprobados.txt
            File fAprobados = new File("src/lecturaficheros/aprobados.txt");
            BufferedWriter aprobados = new BufferedWriter(new FileWriter(fAprobados));

            for(Alumno a : lista) {
                if(a.getMedia() >= 5) {
                    aprobados.write(a.toString());
                    aprobados.newLine();
                }
            }
            aprobados.close();

            // Mostrar contenido de aprobados.txt
            Scanner teclado2 = new Scanner(fAprobados);
            System.out.println("\nAlumnos aprobados:");
            while(teclado2.hasNextLine()) {
                System.out.println(teclado2.nextLine());
            }
            teclado2.close();

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
