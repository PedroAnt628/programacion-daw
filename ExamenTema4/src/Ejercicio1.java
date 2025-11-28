import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    
    
    public static void main(String[] args) {
        // Temas que ha estudiado
        ArrayList<Integer> temasEstudiados = new ArrayList<>();

        // Inicializamos los temas estudiados
        Collections.addAll(temasEstudiados, 4, 11, 23, 34, 35, 36, 39, 50, 60, 65);
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> vectorAleatorio = new ArrayList<>();
        
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Generar vector aleatorio");
            System.out.println("2. VAlidar coincidencias con temas estudiados");
            System.out.println("3. Salir");
            System.out.print("Elige opción: ");
            opcion = teclado.nextInt();
            
            switch(opcion) {
                case 1:
                    vectorAleatorio = generarAleatorio(5, 65);
                    System.out.println("Vector generado: " + vectorAleatorio);
                    break;
                case 2:
                    validarCoincidencias(vectorAleatorio, temasEstudiados);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 3);
        
    }
    
    // Genera un vector aleatorio sin repetidos
    public static ArrayList<Integer> generarAleatorio(int cantidad, int max) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();
        
        while(numeros.size() < cantidad) {
            int num = aleatorio.nextInt(max) + 1; // entre 1 y max
            if(!numeros.contains(num)) {
                numeros.add(num);
            }
        }
        return numeros;
    }
    
    // Valida coincidencias con los temas estudiados
    public static void validarCoincidencias(ArrayList<Integer> vector, ArrayList<Integer> estudiados) {
        ArrayList<Integer> coincidencias = new ArrayList<>();
        
        for(int tema : vector) {
            if(estudiados.contains(tema)) {
                coincidencias.add(tema);
            }
        }
        
        Collections.sort(coincidencias);
        
        if(coincidencias.isEmpty()) {
            System.out.println("No has estudiado ni un tema bueno.");
        } else {
            System.out.println("Los temas que coinciden son: " + coincidencias);
        }
    }
}
