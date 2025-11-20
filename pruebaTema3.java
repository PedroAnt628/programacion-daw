public class pruebaTema3 {
    public static void main(String[] args) {

     //Suma filas y columnas de un array irregular
    //     int[][] numeros = {
    //     {1, 2, 3},
    //     {4, 5},
    //     {7, 8, 9}
    //     };


    //     for (int j = 0; j < 3; j++) {   // hasta la columna máxima que esperes
    //         int sumaColumna = 0;
    //         for (int i = 0; i < numeros.length; i++) {
    //             if (j < numeros[i].length) {   // comprobamos si la columna existe en esa fila
    //                 sumaColumna = sumaColumna + numeros[i][j];
    //             }
    //         }
    //     System.out.println("La suma total de la columna " + j + " es: " + sumaColumna);
    //     }
    //     for (int i = 0; i < numeros.length; i++) {   
    //         int sumaFila = 0;                        
    //         for (int j = 0; j < numeros[i].length; j++) {   
    //             sumaFila = sumaFila + numeros[i][j];           
    //         }
    //         System.out.println("La suma total de la fila " + i + " es: " + sumaFila);
    //     }
    //     }


    //Suma de filas, columnas diagonales y total
            // int[][] numeros2= {
            //     {1, 2, 3},
            //     {4, 5, 6},
            //     {7, 8, 9}
            // };
            // //Suma total
            // int suma = 0;
            // for (int i = 0; i < numeros2.length; i++) {
            //     for (int j = 0; j < numeros2[0].length; j++) {
            //         suma= suma + numeros2[i][j];
            //     }
                
            // }
            // System.out.println("La suma de todos los numeros del arays es " + suma);

            // //Suma fila
            // for (int i = 0; i<numeros2.length; i++){
            //     int sumaFila = 0;
            //     for (int j = 0; j < numeros2[i].length; j++){
            //         sumaFila = sumaFila + numeros2[i][j];
            //     }
            //     System.out.println("La suma de la fila " + i + " es " + sumaFila);

            // }
            // //Suma columna
            // for (int j = 0; j<numeros2[0].length;j++){
            //     int sumaColumna = 0;
            //     for (int i = 0; i < numeros2.length; i++){
            //         sumaColumna = sumaColumna + numeros2[i][j];

            //     }
            //     System.out.println("La suma de la calumna " + j + " es " + sumaColumna);
            // }
            // //Suma diagonal
            //     int sumaDiagonal = 0;
            //     for (int i = 0; i < numeros2.length; i++) {
            //         sumaDiagonal += numeros2[i][i];
            //     }
            //     System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);


    //Numeros pares en una matriz
            int[][] numeros3= {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
            
            //Contamos y sumamos los numeros pares
            int sumaPares = 0;
            int contadorPar = 0;
            for (int i = 0; i < numeros3.length; i++) {
                for (int j = 0; j < numeros3[0].length; j++) {
                    if (numeros3[i][j] % 2 == 0) {
                        contadorPar++;
                        sumaPares = sumaPares + numeros3[i][j];
                    }
                }  
            }
            System.out.println("Hay " + contadorPar +" y su suma total es " + sumaPares);

            //Sumamos los numeros impares mayores de 5
            int sumaImpares = 0;
            int contadorIm = 0;
            for (int i = 0; i < numeros3.length; i++) {
                for (int j = 0; j < numeros3[0].length; j++) {
                    if (numeros3[i][j] % 2 != 0 && numeros3[i][j] > 5){
                    sumaImpares = sumaImpares + numeros3[i][j];
                    contadorIm++;
                    }
                }
            }
            System.out.println("La suma de los impares mayores a 5 es " + sumaImpares + " y en total con " + contadorIm);
                                
    }
    


}
