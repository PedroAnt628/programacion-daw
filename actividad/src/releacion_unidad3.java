import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class releacion_unidad3 {
    // public static void main(String[] args) {
       
    // //Ejercicio 1
    // //Crear vector dinamico
    //     int[] vector=null;
    //     //Añadir valores al vector
    //     vector=push(vector,3);
    //     //Añadir otro valor al vector
    //     vector=push(vector,5);
    //     for (int i = 0; i < vector.length; i++) {
    //         System.out.print(vector[i]+" ");
    //     }
    //     //Eliminar el ultimo
    //     int valor=pop(vector);
    //     System.out.println(valor);

    // }
    // //Funcion push añade un valor al array y devuelve el nuevo array
    // public static int[] push(int[] array, int valor) {
    //     int longitud;
    //     if (array == null) longitud = 0;
    //     else longitud = array.length;
    //     //Crear nuevo array con +1
    //     int[] salida = new int[longitud + 1];
    //     //Copiar lo que haya en ese momento
    //     for (int i = 0; i < longitud; i++) {
    //         salida[i] = array[i];
    //     }
    //     salida[longitud] = valor;
    //     return salida;
    // }

    // //Funcion pop elimina el ultimo valor del array y devuelve el nuevo array
    // public static int pop(int[] array) {
    //     if (array == null) return -1;
    //     int valor=array[array.length-1];
    //     int[] nuevo = new int[array.length - 1];
    //     for (int i=0;i<nuevo.length;i++){
    //         nuevo[i]=array[i];
    //     }
    //     array=nuevo;
    //     return valor;
    // }



    //Ejercicio 2
    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);

    //     System.out.print("Cuantos numeros quieres introducir ");
    //     int cantidad = teclado.nextInt();

    //     //Crear el array y meter los números con push
    //     int[] vector = null;
    //     for (int i = 0; i < cantidad; i++) {
    //         System.out.print("INtroduce el numero " + (i + 1) + ": ");
    //         int num = teclado.nextInt();
    //         vector = push(vector, num);
    //     }

    //     //Array original
    //     System.out.print("Vector original: ");
    //     mostrarVector(vector);

    //     //Mayor a menor
    //     ordenarDescendente(vector);

    //     //Array ordenado
    //     System.out.print("Vector ordenado: ");
    //     mostrarVector(vector);
    // }

    
    // //Funcion push añade un valor al array y devuelve el nuevo array
    // public static int[] push(int[] array, int valor) {
    //     int longitud;
    //     if (array == null) longitud = 0;
    //     else longitud = array.length;
    //     //Crear nuevo array con +1
    //     int[] salida = new int[longitud + 1];
    //     //Copiar lo que haya en ese momento
    //     for (int i = 0; i < longitud; i++) {
    //         salida[i] =array[i];
    //     }
    //     salida[longitud] = valor;
    //     return salida;
    // }

    // // Mostrar el array
    // public static void mostrarVector(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    //     System.out.println();
    // }

    // // Ordenar de mayor a menor
    // public static void ordenarDescendente(int[] array) {
    //     for (int i = 0; i < array.length - 1; i++) {
    //         for (int j = 0; j < array.length - 1 - i; j++) {
    //         if (array[j] < array[j + 1]) {
    //             int temp =array[j];
    //             array[j] =array[j + 1];
    //             array[j + 1] = temp;
    //         }
    //         }
    //     }
    // }



    //Ejercicio 3
    // public static void main(String[] args) {
    //     int[] vector = {4, 9, 2, 7, 1};

    //     int[] extremos = maxMin(vector);
    //     System.out.println("Maximo: " + extremos[0]);
    //     System.out.println("Minimo: " + extremos[1]);
    // }

    // public static int[] maxMin(int[] array) {
    //     int max = array[0];
    //     int min = array[0];
    //     for (int i = 1; i < array.length; i++) {
    //         if (array[i] > max) max =array[i];
    //         if (array[i] < min) min =array[i];
    //     }
    //     return new int[]{max, min};
    // }



    //Ejercicio 4
    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);

    //     // Numeros ganadores
    //     int[] ganadores = {5, 12, 23, 34, 45, 49};

    //     //MI array
    //     int[] usuario = new int[6];
    //     System.out.println("Introduce tus 6 numeros de la Bonoloto:");
    //     for (int i = 0; i < usuario.length; i++) {
    //         System.out.print("Numero " + (i + 1) + ": ");
    //         usuario[i] = teclado.nextInt();
    //     }

    //     System.out.print("Numeros ganadores: ");
    //     mostrarVector(ganadores);
    //     System.out.print("Tus numeros: ");
    //     mostrarVector(usuario);

    //     // Contar aciertos
    //     int aciertos = contarAciertos(ganadores, usuario);
    //     System.out.println("Has tenido " + aciertos + " aciertos.");
    // }

    // // Mostrar array
    // public static void mostrarVector(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    //     System.out.println();
    // }

    // // Contar cuantos numeros coinciden
    // public static int contarAciertos(int[] ganadores, int[] usuario) {
    //     int contador = 0;
    //     for (int i = 0; i < usuario.length; i++) {
    //         for (int j = 0; j < ganadores.length; j++) {
    //             if (usuario[i] == ganadores[j]) {
    //                 contador++;
    //             }
    //         }
    //     }
    //     return contador;
    // }



    //Ejercicio 5
    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);

    //     //Lista de numeros ganadores
    //     ArrayList<Integer> ganadores = new ArrayList<>();
    //     ganadores.add(5);
    //     ganadores.add(12);
    //     ganadores.add(23);
    //     ganadores.add(34);
    //     ganadores.add(45);
    //     ganadores.add(49);

    //     //Lista mis numeros
    //     ArrayList<Integer> usuario = new ArrayList<>();
    //     System.out.println("Introduce tus 6 números de la Bonoloto:");
    //     for (int i = 0; i < 6; i++) {
    //         System.out.print("Número " + (i + 1) + ": ");
    //         int num = teclado.nextInt();
    //         usuario.add(num);
    //     }

    //     System.out.print("Números ganadores: ");
    //     mostrarLista(ganadores);
    //     System.out.print("Tus números: ");
    //     mostrarLista(usuario);

    //     // Contar aciertos
    //     int aciertos = contarAciertos(ganadores, usuario);
    //     System.out.println("Has tenido " + aciertos + " aciertos.");
    // }

    // // Mostrar una lista
    // public static void mostrarLista(ArrayList<Integer> lista) {
    //     for (int i = 0; i < lista.size(); i++) {
    //         System.out.print(lista.get(i) + " ");
    //     }
    //     System.out.println();
    // }

    // // Contar los numeros que coinciden en las listass
    // public static int contarAciertos(ArrayList<Integer> ganadores, ArrayList<Integer> usuario) {
    //     int contador = 0;
    //     for (int i = 0; i < usuario.size(); i++) {
    //         if (ganadores.contains(usuario.get(i))) {
    //             contador++;
    //         }
    //     }
    //     return contador;
    // }



    //Ejercicio 6
    // public static void main(String[] args) {
    //     int[][] matriz1 = {
    //         {1, 2, 3},
    //         {4, 5, 6}
    //     };

    //     int[][] matriz2 = {
    //         {7, 8, 9},
    //         {10, 11, 12}
    //     };

    //     double[][] resultado = calcularColumnas(matriz1, matriz2);

    //     for (int i = 0; i < resultado[0].length; i++) {
    //         System.out.printf("Columna %d | Suma: %.0f | Producto: %.0f | Media: %.2f%n ",
    //             i + 1, resultado[0][i], resultado[1][i], resultado[2][i]);
    //     }
    // }

    // public static double[][] calcularColumnas(int[][] matriz1, int[][] matriz2) {
    //     int filas = matriz1.length;
    //     int columnas = matriz1[0].length;

    //     double[][] salida = new double[3][columnas]; // 3 filas: suma, producto, media

    //     for (int j = 0; j < columnas; j++) {
    //         int suma = 0;
    //         int producto = 1;
    //         for (int i = 0; i < filas; i++) {
    //             suma += matriz1[i][j];
    //             producto *= matriz1[i][j];
    //         }
    //         for (int i = 0; i < filas; i++) {
    //             suma += matriz2[i][j];
    //             producto *= matriz2[i][j];
    //         }
    //         salida[0][j] = suma;
    //         salida[1][j] = producto;
    //         salida[2][j] = suma / (filas * 2.0); // total de elementos por columna
    //     }

    //     return salida;
    // }



    //Ejercicio 7
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();

        // Rellenar matriz con numeros aleatorios entre 0 y 100
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(101);
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        rotarUnaPosicion(matriz);

        System.out.println("Matriz rotada:");
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println(); 
        }
    }

    public static void rotarUnaPosicion(int[][] m) {
        int temp = m[0][0];

        for (int j = 0; j < 4; j++) {
            m[0][j] = m[0][j + 1];
        }

        for (int i = 0; i < 4; i++) {
            m[i][4] = m[i + 1][4];
        }

        for (int j = 4; j > 0; j--) {
            m[4][j] = m[4][j - 1];
        }

        for (int i = 4; i > 1; i--) {
            m[i][0] = m[i - 1][0];
        }

        m[1][0] = temp;
    

}
}

