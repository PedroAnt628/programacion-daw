
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class pruebaTema3Relacion {
    //Funcion push y pop para cambiar valores de array
    // public static int[] push(int[] pila, int nuevoValor) {
    //     int[] nuevaPila = new int[pila.length + 1];
    //     for (int i = 0; i < pila.length; i++) {
    //         nuevaPila[i] = pila[i];
    //     }
    //     nuevaPila[pila.length] = nuevoValor;
    //     return nuevaPila;
    // }

    // // Función pop: elimina el último número y lo devuelve
    // public static int[] pop(int[] pila) {
    //     if (pila.length == 0) {
    //         System.out.println("La pila está vacía.");
    //         return pila;
    //     }

    //     int valor = pila[pila.length - 1];
    //     System.out.println("Elemento eliminado: " + valor);

    //     int[] nuevaPila = new int[pila.length - 1];
    //     for (int i = 0; i < nuevaPila.length; i++) {
    //         nuevaPila[i] = pila[i];
    //     }
    //     return nuevaPila;
    // }


    // public static void main(String[] args) {
    //     int[] pila = new int[0]; // pila vacía

    //     pila = push(pila, 5);
    //     pila = push(pila, 10);
    //     pila = push(pila, 15);

    //     pila = pop(pila);

    //     // Mostrar pila actual
    //     System.out.print("Pila actual: ");
    //     for (int valor : pila) {
    //         System.out.print(valor + " ");
    //     }
    // }



    //Funcion push dando una lontitud y valores mediante teclado
    // public static int[] push(int[] pila, int nuevoValor) {
    //     int[] nuevaPila = new int[pila.length + 1];
    //     for (int i = 0; i < pila.length; i++) {
    //         nuevaPila[i] = pila[i];
    //     }
    //     nuevaPila[pila.length] = nuevoValor;
    //     return nuevaPila;
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.println("Introduce cuantos numeros que quieres para el vector");
    //     int cantidad = teclado.nextInt();
    //     int[] pila = new int[0];
    //     for (int i = 0; i < cantidad; i++) {
    //         System.out.print("Introduce el numero " + (i + 1) + ": ");
    //         int nuevoValor = teclado.nextInt();
    //         pila = push(pila, nuevoValor);
    //     }


    //     // Mostrar pila actual
    //     System.out.print("Pila actual: ");
    //     for (int valor : pila) {
    //         System.out.print(valor + " ");
    //     }
    // }


    //Max y min de un array

    // public static void main(String[] args) {
    // int[] numeros = {6, 2, 8, 4, 5, 16};
    // int[] resultado = maxMin(numeros);

    // System.out.println("\nMáximo: " + resultado[0]);
    // System.out.println("Mínimo: " + resultado[1]);

    // }

    

    // public static int[] maxMin(int[] numeros) {

    // int max = numeros[0];
    // int min = numeros[0];

    //     for (int i = 0; i < numeros.length; i++) {
    //         if (numeros[i] < min) min = numeros[i];
    //         if (numeros[i] > max) max = numeros[i];
    //         System.out.print(numeros[i] + " ");
 
    //     }
    //     return new int[]{max, min};

    // }


    

    //Decimo de la bonoloto
    // public static void main(String[] args) {
    //     int[] ganadores = {1,53,6,23,65,32};
    //     int[] decimo = new int[6];

    //     System.out.println("INtroduce tus 6 numeros");
    //     Scanner teclado = new Scanner(System.in);
    //         for (int i = 0; i < decimo.length; i++) {
    //             System.out.println("Numero " + (i + 1) + ":");
    //                 decimo[i] = teclado.nextInt();
    //         }

    //     System.out.print("Numeros ganadores: ");
    //     for (int i = 0; i < ganadores.length; i++) {
    //         System.out.print(ganadores[i] + " ");
    //     }
    //     System.out.println();

    //     System.out.print("Numeros del decimo: ");
    //     for (int i = 0; i < decimo.length; i++) {
    //         System.out.print(decimo[i] + " ");
    //     }
    //     System.out.println();



    //     int contador = 0;

    //     for (int i = 0; i < decimo.length; i++) {
    //         for (int j = 0; j < ganadores.length; j++) {
    //             if (decimo[i] == ganadores[j]){
    //                 contador++;
    //             }
                
    //         }    
    //     }
    //     System.out.println("Tiene " + contador + " numeros premiados");

    // }


    //Decimo de la bonoloto pero con arraylist
    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);

    //     ArrayList<Integer> ganadores = new ArrayList<>();
    //         ganadores.add(1);
    //         ganadores.add(23);
    //         ganadores.add(15);
    //         ganadores.add(56);
    //         ganadores.add(43);
    //         ganadores.add(31);

    //     ArrayList<Integer> decimo = new ArrayList<>();
    //     System.out.println("Introde los 6 numeros de tu decimo");
    //     for (int i = 0; i < 6; i++) {
    //         int numero = teclado.nextInt();
    //         decimo.add(numero);   
    //     }
    //     int contador = 0;
    //     for (int i = 0; i < decimo.size(); i++) {
    //             if (ganadores.contains(decimo.get(i))){
    //                 contador++;
    //             }
                
    //     }
        
    //     System.out.println("Hay " + contador + " numeros iguales");


    // }




    //Funcion que devuelve suma, producto y media
    // public static void main(String[] args) {
    //     int[][] matriz1 = {
    //         {2,5,7},
    //         {3,4,1}
    //     };
    //     int[][] matriz2 = {
    //         {4,8,1},
    //         {2,7,3}
    //     };

    //     double[][] resultado = calculos(matriz1, matriz2);

    //     for (int i = 0; i < resultado[0].length; i++) {
    //         System.out.println("Columna " + (i + 1) + " | Suma: " + (int)resultado[0][i] + " | Producto: " + (int)resultado[1][i] + " | Media: " + String.format("%.2f", resultado[2][i]));
    //     }

      
 
    // }
    // public static double[][] calculos( int[][] matriz1, int[][] matriz2){
    //     int filas = matriz1.length;
    //     int columnas = matriz1[0].length;

    //     double[][] salida = new double[3][columnas];

    //     for (int j = 0; j < columnas; j++) {
    //         int suma = 0;
    //         int producto = 1;
    //         for (int i = 0; i < filas; i++) {
    //             suma = suma + matriz1[i][j];
    //             producto = producto * matriz1[i][j];    
    //         }
    //         for (int i = 0; i < filas; i++) {
    //             suma = suma + matriz2[i][j];
    //             producto = producto * matriz2[i][j];       
    //         }
    //         salida[0][j] = suma;
    //         salida[1][j] = producto;
    //         salida[2][j] = suma / (filas * 2);
    //     }
    //     return salida;
    // } 

    

    


}