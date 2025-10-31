import java.util.Scanner;

public class App {
    public static void imprimeArray(double[] array){
        System.out.println(array[1]);
    }
    public static double[] devuelveArray(double[] a){
        a[1]=a[1]*3;
        return a;
    }
    public static void main(String[] args) {
        // //Arrays estaticos
        // int edad;
        // double notaProg;
        // double notaBD;
        // double notaLM;

        // double[] calificaciones = {7, 6, 8, 7};
        // System.out.println(calificaciones[0]);

        //Arrays Dinamicos
        // double[] calificaciones2;
        // System.out.println("Introduce el tamañano del array");
        // Scanner teclado = new Scanner(System.in);
        // calificaciones2 = new double[teclado.nextInt()];

        // //Arrays que apuntas al mismo sitio
        // double[] calificacionesOtro;
        // calificacionesOtro = calificaciones;
        // System.out.println(calificacionesOtro[3]);
        // calificaciones=null;
        // calificacionesOtro=null;
        // System.out.println();  
        
        // //Imprime la posicion
        // imprimeArray(calificaciones);
        // double[] resultado= devuelveArray(calificaciones);
        // System.out.println(resultado[1]);
        // System.out.println(calificaciones[2]);


        //Matrices
        // String[][] comidas={
        //     {"Pasta", "Pizza", "Ensalada"},
        //     {"Sushi", "Ramen", "Tempura"},
        //     {"Tacos", "Burritos", "Quesadillas"}
        // };
        // System.out.println(comidas[1][2]);
        // String[] aux=comidas[1];
        // System.out.println(aux[0]);
        // System.out.println(comidas[2][0]);

        // //Usar la memoria dinamica reservada
        // calificaciones2[3]=5;
        // System.out.println(calificaciones2[3]);
        // System.out.println(calificaciones2[1]);

        // //aceso a args de main
        // System.out.println(args[1]);


        //Recorrer un vector
        // int[] vector={7,5,3,4};
        // for(int i=vector.length-1;i>=0;i--) {
        //     System.out.print(vector[i]+" ");
        //}
        // System.out.println();

        // int[][] matrix={
        //     {1,2,3,4,5},
        //     {2,3,4,5},
        //     {3,4,5},
        //     {4,5},
        //     {5}
        // };
        // for(int i=0;i<matrix.length;i++) {
        //     for(int j=0;j<matrix[i].length;j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        //Realizar una copia de un array
        // int[] vector={1,4,2,6,3};
        // int[] copiaVector = new int[vector.length];
        // for (int i=0;i<vector.length;i++){
        //     copiaVector[i]=vector[i];
        // }
        // vector[4]=10;

        // //Vector original
        // for (int i=0;i<vector.length;i++){
        //     System.out.print(vector[i]+" ");
        // }
        // System.out.println();

        // //Copia del vector
        // for (int i=0;i<copiaVector.length;i++){
        //     System.out.print(copiaVector[i]+" ");
        // }
        // System.out.println();

        //Insertar un elemento mas
        // int[] vectorPrueba={1,2,3};
        // int[] vectorFinal;
        // System.out.println(vectorPrueba.length);
        // //Reservar memoria para 1 elemento mas
        // vectorFinal=new int[vectorPrueba.length+1];
        // for (int i=0;i<vectorPrueba.length;i++){
        //     vectorFinal[i]=vectorPrueba[i];
        // }
        // vectorFinal[vectorPrueba.length]=20;
        // for (int i=0;i<vectorFinal.length;i++){
        //     System.out.print(vectorFinal[i]+" ");
        // }
        // System.out.println();


        int[] notas={2,3,5,7,8,2};
        int contador=0;
        for (int i=0;i<notas.length; i++){
            if (notas[i]==2)contador++;
        }
        int[] notas2= new int [notas.length-contador];  // Creamos el array nuevo con el tamaño correcto
        int j=0;                                          // Variable j para controlar la posición en notas2
        for (int i=0;i<notas.length; i++){               // Recorremos el array original completo
            if (notas[i]!=2){                            // Si el número no es 2
                notas2[j++]=notas[i];                    // Copiamos al nuevo array y aumentamos j
            }
        }
        System.out.println(notas2[0]);

        
    }
}
