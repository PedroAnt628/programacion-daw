import java.util.ArrayList;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        int[] array = {10, 1, 5, 8, 9, 2};
        int num = 4;
        
        ArrayList<Integer> resultado = obtenerVector(array, num);
        
        System.out.println("Array original:");
        for(int x : array) {
            System.out.print(x + " ");
        }
        
        System.out.println("\nResultado con num=" + num + ": " + resultado);
    }
    
    public static ArrayList<Integer> obtenerVector(int[] array, int num) {
        ArrayList<Integer> salida = new ArrayList<>();
        
        if(num >= array.length) {
            System.out.println("Error: num debe ser menor que el tamaño del array.");
            return salida;
        }
        
        // Recorremos hasta la posición donde caben num elementos
        for(int i = 0; i <= array.length - num; i++) {
            int suma = 0;
            // Sumamos num elementos consecutivos
            for(int j = i; j < i + num; j++) {
                suma += array[j];
            }
            salida.add(suma);
        }
        
        return salida;
    }
}

