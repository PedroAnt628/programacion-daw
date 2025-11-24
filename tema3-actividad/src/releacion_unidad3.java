import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class releacion_unidad3 {
    
    //Ejercicio 1
    //  public static void main(String[] args) {
    //     //Crea vector dinamico
    //     int[] vector=null;
    //     //Añade valores al vector
    //     vector=push(vector,3);
    //     //Añade otro valor al vector
    //     vector=push(vector,5);
    //     for (int i = 0; i < vector.length; i++) {
    //         System.out.print(vector[i]+" ");
    //     }
    //     System.out.println();
    //     //Eliminar el ultimo
    //     int valor=pop(vector);
    //     System.out.println("Valor eliminado "+valor);

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

    //     //Crea el array y mete los numeros con push
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

    
    // //Funcion push q añade un valor al array y devuelve el nuevo 
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
    //     System.out.println("Introduce tus 6 numeros de Bonoloto:");
    //     for (int i = 0; i < 6; i++) {
    //         System.out.print("Numero " + (i + 1) + ": ");
    //         int num = teclado.nextInt();
    //         usuario.add(num);
    //     }

    //     System.out.print("Numeros ganadores: ");
    //     mostrarLista(ganadores);
    //     System.out.print("Tus numeros: ");
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
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriz2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        double[][] resultado = calcularColumnas(matriz1, matriz2);

        for (int i = 0; i < resultado[0].length; i++) {
            System.out.println("Columna " + (i + 1) + " | Suma: " + (int)resultado[0][i] + " | Producto: " + (int)resultado[1][i] + " | Media: " + String.format("%.2f", resultado[2][i]));
        }
    }

        public static double[][] calcularColumnas(int[][] matriz1, int[][] matriz2) {
        //Numero de filas
        int filas = matriz1.length;
        //Numero de columnas en la primera fila
        int columnas = matriz1[0].length;

        double[][] salida = new double[3][columnas]; // 3 filas: suma, producto, media

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            int producto = 1;
            for (int i = 0; i < filas; i++) {
                suma = suma + matriz1[i][j];
                producto = producto * matriz1[i][j];
            }
            for (int i = 0; i < filas; i++) {
                suma = suma + matriz2[i][j];
                producto = producto * matriz2[i][j];
            }
            salida[0][j] = suma;
            salida[1][j] = producto;
            salida[2][j] = suma / (filas * 2.0); // total de elementos por columna
        }
        return salida;
    }




    //Ejercicio 7
    // public static void main(String[] args) {
    //     int[][] matriz = new int[5][5];

    //     // Rellenar matriz con numeros aleatorios entre 0 y 100
    //     for (int i = 0; i < 5; i++) {
    //         for (int j = 0; j < 5; j++) {
    //             matriz[i][j] = (int)(Math.random()* 100);
    //         }
    //     }

    //     System.out.println("Matriz original:");
    //     mostrarMatriz(matriz);

    //     rotarPosicion(matriz);

    //     System.out.println("Matriz rotada:");
    //     mostrarMatriz(matriz);
    // }

    // public static void mostrarMatriz(int[][] matriz) {
    //     for (int i = 0; i < matriz.length; i++) {
    //         for (int j = 0; j < matriz[i].length; j++) {
    //             System.out.print(matriz[i][j] + "  ");
    //         }
    //         System.out.println(); 
    //     }
    // }

    // public static void rotarPosicion(int[][] matriz) {
    //     int temp = matriz[0][0];
    //     //Fila superior a la izquierda
    //     for (int j = 0; j < 4; j++) {
    //         matriz[0][j] = matriz[0][j + 1];
    //     }
    //     //Columna derecha hacia arriba
    //     for (int i = 0; i < 4; i++) {
    //         matriz[i][4] = matriz[i + 1][4];
    //     }
    //     //Fila inferior a la derecha
    //     for (int j = 4; j > 0; j--) {
    //         matriz[4][j] = matriz[4][j - 1];
    //     }
    //     //Columna izquierda hacia abajo
    //     for (int i = 4; i > 1; i--) {
    //         matriz[i][0] = matriz[i - 1][0];
    //     }

    //     matriz[1][0] = temp;
    // }



    //Ejercicio 8
    // public static void main(String[] args) {
    //     String frase = "Dábale arroz a la zorra el abad";
    //     if (esPalindroma(frase)) {
    //         System.out.println("La frase es palíndroma");
    //     } else {
    //         System.out.println("La frase no es palindroma");
    //     }
    // }

    // public static boolean esPalindroma(String frase) {
    //     //Todo a minusculas
    //     frase = frase.toLowerCase();
    //     //Quitar espacios
    //     frase = frase.replace(" ", "");
    //     //Quitar tildes
    //     frase = frase.replace("á", "a")
    //                  .replace("é", "e")
    //                  .replace("í", "i")
    //                  .replace("ó", "o")
    //                  .replace("ú", "u");

    //     //Invertir frase
    //     String invertida = new StringBuilder(frase).reverse().toString();
    //     //Comparar original con invertida
    //     return frase.equals(invertida);
    // }

    


    //Ejercicio 9
    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     ArrayList<Integer> lista = new ArrayList<>();
    //     int opcion;

    //     do {
    //         System.out.println("1. Agregar un numero");
    //         System.out.println("2. Eliminar un numero");
    //         System.out.println("3. Mostrar todos los numeros");
    //         System.out.println("4. Comprobar si un numero esta en la lista");
    //         System.out.println("5. Eliminar todos los numeros");
    //         System.out.println("6. Consultar el tamaño de la lista");
    //         System.out.println("7. Salir");
    //         System.out.print("Elige una opcion: ");
    //         opcion = teclado.nextInt();

    //         switch (opcion) {
    //             case 1:
    //                 int numero;
    //                 do {
    //                     System.out.print("Introduce un numero positivo: ");
    //                     numero = teclado.nextInt();
    //                 } while (numero < 0);
    //                 lista.add(numero);
    //                 break;

    //             case 2:
    //                 System.out.print("Numero a eliminar: ");
    //                 int numeroEliminar = teclado.nextInt();
    //                 lista.removeIf(n -> n == numeroEliminar);
    //                 System.out.println("Numero eliminado");
    //                 break;

    //             case 3:
    //                 System.out.println("Contenido de la lista:");
    //                 for (int n : lista) {
    //                     System.out.print(n + " ");
    //                 }
    //                 System.out.println();
    //                 break;

    //             case 4:
    //                 System.out.print("Numero a comprobar: ");
    //                 int numeroBuscar = teclado.nextInt();
    //                 if (lista.contains(numeroBuscar)) {
    //                     System.out.println("El numero esta en la lista");
    //                 } else {
    //                     System.out.println("El numero no esta en la lista");
    //                 }
    //                 break;

    //             case 5:
    //                 lista.clear();
    //                 System.out.println("Lista vacia");
    //                 break;

    //             case 6:
    //                 System.out.println("Tamaño de la lista: " + lista.size());
    //                 break;

    //             case 7:
    //                 System.out.println("Programa cerrado");
    //                 break;

    //             default:
    //                 System.out.println("Opcion no valida");
    //         }

    //     } while (opcion != 7);
    // }


}

