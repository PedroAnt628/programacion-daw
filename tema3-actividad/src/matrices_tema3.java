import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class matrices_tema3 {
    public static void main(String[] args) {
       //Ejercicios
        //Ejercicio 1
        //Realiza una función que busca un número en un array e indica dónde está
        
        // int[] buscar={1,2,3,4,5,6,7,8,9,10};
        // Scanner teclado = new Scanner(System.in);
        // System.out.println("Introduce un numero a buscar");
        // int num=teclado.nextInt();
        // for(int i=0;i<buscar.length;i++) {
        //     if(buscar[i]==num) {
        //         System.out.println("El numero "+num+" se encuentra en la posicion "+i);
        //     }
        // }
        



        //Ejercicio 2
        // //Realiza un programa que muestra tu horario y qué clases tienes hoy

        // String[][] horario={
        //     {"Lunes", "Prog", "LM", "BD"},
        //     {"Martes", "Prog", "Entor", "BD"},
        //     {"Miercoles", "Prog", "Prog", "Entor"},
        //     {"Jueves", "Prog", "BD", "BD"},
        //     {"Viernes", "Prog", "LM", "LM"}
        // };
        // System.out.println("Introduce un dia de la semana");
        // String dia=teclado.next();
        // for(int i=0;i<horario.length;i++) {
        //     if(horario[i][0].equalsIgnoreCase(dia)) {
        //         System.out.print("El "+dia+" tienes: ");
        //         for(int j=1;j<horario[i].length;j++) {
        //             System.out.print(horario[i][j]+" ");
        //         }
        //     }
        // }




        //Ejercicio 3
        //Realiza un programa que inserta valores en una matriz dinámica y devuelva la
        //suma de los valores de cada fila y columna

        // Scanner teclado = new Scanner(System.in);
        // System.out.println("Introduce el numero de filas");
        // int filas=teclado.nextInt();
        // System.out.println("Introduce el numero de columnas");
        // int columnas=teclado.nextInt();

        // int [][] matriz=new int[filas][columnas];
        
        // for(int i=0;i<filas;i++) {
        //     for(int j=0;j<columnas;j++) {
        //         matriz[i][j]=(int)(Math.random()*(100)+1);
        //     }
        // }
        // imprimeMatriz(matriz);
        // System.out.println();

        // int[] resultadoFila=new int[filas];
        // int[] resultadoColumna=new int[columnas];

        // //Recorrer por filas
        // for (int i=0;i<filas;i++){
        //     int total=0;
        //     for (int j=0;j<columnas;j++){
        //         total=total+matriz[i][j];
        //     }
        //     resultadoFila[i]=total;
        // }
        // //Mostrar las sumas
        // System.out.println("Sumar las filas");
        // for (int i=0;i<filas;i++){
        //     System.out.println(resultadoFila[i]);
        // }

        // //Recorrer columnas
        // for (int j=0;j<columnas;j++){
        //     int total=0;
        //     for(int i=0;i<filas;i++){
        //         total=total+matriz[i][j];
        //     }
        //     resultadoColumna[j]=total;
        // }
        // //Mostrar las sumas
        // System.out.println("Sumar las columnas");
        // for (int i=0;i<columnas;i++){
        //     System.out.println(resultadoColumna[i]);
        // }

        // teclado.close();




        //Ejercicio 4
        // Crea una función que borra un valor en el array. Ej: Quitar 2 → {3,5,7,8}

        // int[] notas={2,3,5,7,8,2};
        // System.out.println("Array original:");
        // //Recorremos array original
        //     for (int i=0; i<notas.length; i++) {
        //         System.out.print(notas[i] + " ");
        //     }

        // System.out.println();
        // //Contamos cuantos 2 hay 
        // int contador=0;
        //     for (int i=0;i<notas.length; i++){
        //         if (notas[i]==2)contador++;
        //     }

        // int[] notas2= new int [notas.length-contador];   //Array nuevo con el tamaño correcto, le restamos el numero de 2
        // int pos=0;                                         
        //     for (int i=0;i<notas.length; i++){               //Recorremos el array original completo
        //         if (notas[i]!=2){                            //Si el numero no es 2
        //             notas2[pos++]=notas[i];                    //Copiamos numero
        //         }
        //     }
        
        // System.out.println("Array sin los numeros 2:");
        //     for (int i=0; i<notas2.length; i++) {
        //         System.out.print(notas2[i] + " ");
        //     }




        //Ejercicio 5
        //Crea una función que inserta un nuevo entero en la posición que le digas de
        //parámetro. Si le indicas un parámetro mayor al tamaño actual, rellenará con 0
        // int[] array={1,2,3,4,5};
        // int valor=10;
        // int posicion=6;
        // int[] arrayModi = insertarValor(array, valor, posicion);
        // System.out.println("Array modificado:");
        // //Recorremos array modificado
        //     for (int i = 0; i < arrayModi.length; i++) {
        //         System.out.print(arrayModi[i] + " ");
        //     }
        //     System.out.println();
        



        //Ejercicio 6
        //Hacer un vector con todo el contenido de la matriz y ordenarlo
            // int[][] matriz={
            //     {3,7,1},
            //     {4,-4,2},
            //     {5,0,5}
            // };
            // int filas=matriz.length;
            // int columnas=matriz[0].length;
            // int[] vector=new int[filas*columnas];
            // int posicion=0;
            // //Pasar matriz a vector
            //     for(int i=0;i<filas;i++) {
            //         for(int j=0;j<columnas;j++) {
            //             vector[posicion]=matriz[i][j];
            //             posicion++;
            //         }
            //     }
            // //Ordenar vector
            //     for(int i=0;i<vector.length-1;i++) {
            //         for(int j=i+1;j<vector.length;j++) {
            //             if(vector[i]>vector[j]) {
            //                 int aux=vector[i];
            //                 vector[i]=vector[j];
            //                 vector[j]=aux;
            //             }
            //         }
            //     }
            // // Mostrar vector ordenado
            // System.out.println("Vector ordenado:");
            //     for (int i = 0; i < vector.length; i++) {
            //         System.out.print(vector[i] + " ");
            //     }
            // System.out.println();




        //Ejercicio 7
        // Usa un ArrayList<String> para almacenar nombres
        // introducidos por el usuario hasta que escriba “fin”. Interesa que no se
        // repitan nombres y al terminar muestra todos los nombres ordenados.
            ArrayList<String> lista = new ArrayList<>(); //Creación de la lista vacía
            Scanner teclado=new Scanner(System.in);
            String palabra;
            boolean salida=false;
            do{
                System.out.println("Introduzca una palabra o fin para terminar: ");
                palabra=teclado.nextLine();
                if(!palabra.equals("fin") && !lista.contains(palabra)){ 
                        lista.add(palabra);
                }
                if(palabra.equals("fin")) {salida=true;}
            }while(!salida);

            //Sacar las palabras guardadas
            System.out.print("Contenido de la lista: ");
            for(int i=0;i<lista.size();i++){
                System.out.print(lista.get(i)+" ");
            }
            System.out.println();

            //Vamos a ordenar la lista y mostrar el resultado
            lista.sort(String.CASE_INSENSITIVE_ORDER);
            // lista.sort((a,b)->{return a.compareTo(b);});
            System.out.print("Contenido de la lista ordenada: ");
            for(int i=0;i<lista.size();i++){
                System.out.print(lista.get(i)+" ");
            }
            System.out.println();




        }





        //Ejercicio 5
        //Crea una función que inserta un nuevo entero en la posición que le digas de
        //parámetro. Si le indicas un parámetro mayor al tamaño actual, rellenará con 0
        public static int[] insertarValor(int[] original, int valor, int posicion) {

            int nuevoTamaño = Math.max(original.length + 1, posicion + 1);
            int[] resultado = new int[nuevoTamaño];

            // Copiar los valores originales
            for (int i = 0; i < original.length; i++) {
                resultado[i] = original[i];
            }

            // Si la posición esta dentro del array original, desplazamos los elementos
            if (posicion < original.length) {
                for (int i = nuevoTamaño - 1; i > posicion; i--) {
                    resultado[i] = resultado[i - 1];
                }
            }

            // Insertar el nuevo valor
            resultado[posicion] = valor;

            return resultado;
    }
    
}
