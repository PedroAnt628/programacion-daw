import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EvolucionArray {
    public static void main(String[] args){
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Maria");
        alumnos.add("Carlos");
        ArrayList<String> materias = new ArrayList<>();
        materias.add("Programación");
        materias.add("Entornos");
        materias.add("Bases Datos");
        materias.add("LMSGI");
        ArrayList<ArrayList<Double>> notas = new ArrayList<>();

        //Generar notas aleatorias
        generaNotas(notas,alumnos.size(),materias.size());
        
        //Imprimir notas
        imprimeNotas(alumnos,materias,notas);

        //Obtener estadisticas de alumnos
        obterDatosALumno(alumnos,notas);
    }
    public static void generaNotas(ArrayList<ArrayList<Double>> notas,int filas, int columnas){
        for(int i=0;i<filas;i++){
            ArrayList<Double> fila = new ArrayList<>();
            for(int j=0;j<columnas;j++){
                fila.add(Math.random()*(10));
            }
            notas.add(fila);
        }
    }


    public static void imprimeNotas(ArrayList<String> alumnos, ArrayList<String> materias, ArrayList<ArrayList<Double>> notas){
        for(int i=0;i<materias.size();i++){//Materias
            System.out.print(materias.get(i)+" | ");
        }
        System.out.println();
        //Imprimir las notas
        for(int i=0;i<notas.size();i++){
            System.out.print(alumnos.get(i)+" | ");
            for(int j=0;j<notas.get(i).size();j++){
                System.out.printf("%2.1f | ",notas.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void obterDatosALumno(ArrayList<String> alumnos, ArrayList<ArrayList<Double>> notas){
        //Pedir alumno
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el alumno: ");
        String alumno = teclado.nextLine();

        if(alumnos.contains(alumno)){
            System.out.println("El alumno esta en la lista");
            int indice = alumnos.indexOf(alumno);
            ArrayList<Double> notasAlumno = notas.get(indice);

            //Maximo, minimo y madia
            double maximo= notasAlumno.get(0);
            double minimo= notasAlumno.get(0);
            double media=0;
            for (int i=0; i< notasAlumno.size();i ++){
                if (notasAlumno.get(i)> maximo) maximo= notasAlumno.get(i);
                if (notasAlumno.get(i)< minimo) minimo= notasAlumno.get(i);
                media+= notasAlumno.get(i);
            }
            media = media/notasAlumno.size();
            System.out.printf("Nota media del alumno "+alumno+": %.2f\n", media);
            System.out.printf("Nota máxima del alumno "+alumno+": %.2f\n", maximo);
            System.out.printf("Nota mínima del alumno "+alumno+": %.2f\n", minimo);
        } else {
            System.out.println("El alumno no esta en la lista");
            
        }
    }

    public static void materiasSuperadas(ArrayList<String> materias,ArrayList<ArrayList<Double>> notas ){
        //Pedir materia
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la materia: ");
        String materia = teclado.nextLine();
        if  (materias.contains(materia)){
            System.out.println("Esta materia existe");
            int indice = materias.indexOf(materia);
            ArrayList<Double> notasMateria = new ArrayList<>();
            


        }else {
            System.out.println("No existe esa materia");
        }

    }

}
