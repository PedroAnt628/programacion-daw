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






        //Ejercicios

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

        //Realiza un programa que inserta valores en una matriz dinámica y devuelva la
        //suma de los valores de cada fila y columna
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de filas");
        int filas=teclado.nextInt();
        System.out.println("Introduce el numero de columnas");
        int columnas=teclado.nextInt();

        int [][] matriz=new int[filas][columnas];
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {
                System.out.println("Introduce el valor de la posicion "+i+","+j);
                matriz[i][j]=teclado.nextInt();
            }
        }
        int[] sumaFilas=new int[filas];
        int[] sumaColumnas=new int[columnas];

        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {
                sumaFilas[i]+=matriz[i][j];
                sumaColumnas[j]+=matriz[i][j];
            }
        }

        System.out.println("Suma de filas:");
        for(int i=0;i<filas;i++) {
            System.out.println("Fila "+i+": "+sumaFilas[i]);
        }

        System.out.println("Suma de columnas:");
        for(int j=0;j<columnas;j++) {
            System.out.println("Columna "+j+": "+sumaColumnas[j]);
        }

        teclado.close();
    }
}
