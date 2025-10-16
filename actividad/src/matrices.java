import java.util.Scanner;

public class matrices {
    public static void imprimeMatriz(int[][]matriz) {
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
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
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de filas");
        int filas=teclado.nextInt();
        System.out.println("Introduce el numero de columnas");
        int columnas=teclado.nextInt();

        int [][] matriz=new int[filas][columnas];
        
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {
                matriz[i][j]=(int)(Math.random()*(100)+1);
            }
        }
        imprimeMatriz(matriz);
        System.out.println();

        int[] resultadoFila=new int[filas];
        int[] resultadoColumna=new int[columnas];

        //Recorrer por filas
        for (int i=0;i<filas;i++){
            int total=0;
            for (int j=0;j<columnas;j++){
                total=total+matriz[i][j];
            }
            resultadoFila[i]=total;
        }
        //Mostrar las sumas
        System.out.println("Sumar las filas");
        for (int i=0;i<filas;i++){
            System.out.println(resultadoFila[i]);
        }

        //Recorrer columnas
        for (int j=0;j<columnas;j++){
            int total=0;
            for(int i=0;i<filas;i++){
                total=total+matriz[i][j];
            }
            resultadoColumna[j]=total;
        }
        //Mostrar las sumas
        System.out.println("Sumar las columnas");
        for (int i=0;i<columnas;i++){
            System.out.println(resultadoColumna[i]);
        }

        teclado.close();
    }
}
