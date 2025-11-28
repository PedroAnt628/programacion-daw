public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        

        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0 ; i < filas; i++){
            for ( int j = 0; j <columnas; j++){
                matriz[i][j] = (int)(Math.random() * (50 - 1 + 1) + 1);
            }
        }
        //Suma filas
        for (int i = 0; i < filas; i++) {
            int sumaFi = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFi = sumaFi + matriz[i][j];  
            }
            System.out.println("La suma de la fila " + (i + 1) +  " es: " + sumaFi);
   
        }

        for (int j = 0; j < columnas; j++) {
            int sumaCol = 0;
            for (int i = 0; i < columnas; i++) {
                sumaCol = sumaCol + matriz[i][j];  
            }
            System.out.println("La suma de la columna " + (j + 1) +  " es: " + sumaCol);
 
        }

        int max = matriz[0][0];
        int min = matriz[0][0];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; i <columnas; i++){
                if ( max < matriz[i][j])
                    max = matriz[i][j];
                if ( min > matriz[i][j])
                    min = matriz[i][j];

            }
            
        }
        System.out.println("El numero mas grande es " + max + " y el mas pequeño " + min);

    }

}
