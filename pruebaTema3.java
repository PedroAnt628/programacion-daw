public class pruebaTema3 {
    //public static void main(String[] args) {

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


        



            // int[][] numeros3= {
            //         {1, 2, 3},
            //         {4, 5, 6},
            //         {7, 8, 9}
            //     };
            
            // //Contamos y sumamos los numeros pares
            // int sumaPares = 0;
            // int contadorPar = 0;
            // for (int i = 0; i < numeros3.length; i++) {
            //     for (int j = 0; j < numeros3[0].length; j++) {
            //         if (numeros3[i][j] % 2 == 0) {
            //             contadorPar++;
            //             sumaPares = sumaPares + numeros3[i][j];
            //         }
            //     }  
            // }
            // System.out.println("Hay " + contadorPar +" y su suma total es " + sumaPares);


            // //Sumamos los numeros impares mayores de 5
            // int sumaImpares = 0;
            // int contadorIm = 0;
            // for (int i = 0; i < numeros3.length; i++) {
            //     for (int j = 0; j < numeros3[0].length; j++) {
            //         if (numeros3[i][j] % 2 != 0 && numeros3[i][j] > 5){
            //         sumaImpares = sumaImpares + numeros3[i][j];
            //         contadorIm++;
            //         }
            //     }
            // }
            // System.out.println("La suma de los impares mayores a 5 es " + sumaImpares + " y en total con " + contadorIm);


            // //Multiplos de 3 en la diagonal secundaria
            // int contadorMultiplos3 = 0;
            // int sumaMultiplos3 = 0;

            // for (int i = 0; i < numeros3.length; i++) {
            //     int valor = numeros3[i][numeros3.length - 1 - i];
            //     if (valor % 3 == 0) {
            //         contadorMultiplos3++;
            //         sumaMultiplos3 = sumaMultiplos3 + valor;
            //         System.out.println("En la diagonal secundaria está " + valor + " que es múltiplo de 3");
            //     }
            // }
            // System.out.println("Hay " + contadorMultiplos3 + " múltiplos de 3 en la diagonal secundaria y su suma es " + sumaMultiplos3);


            // //Contamos y sumamos los numeros pares
            // int ContadorFilaPar = 0;
            // for (int i = 0; i < numeros3.length; i++) {
            //     for (int j = 0; j < numeros3[0].length; j++) {
            //         if (i % 2 == 0 && j % 2 == 0) {
            //             ContadorFilaPar++;
            //             int valor = numeros3[i][j];
            //             System.out.println("La posicion " + i + ", " + j + " es par, y su valor es " + valor);
            //         }
            //     }  
            // }
            // System.out.println("Hay " + ContadorFilaPar + " numeros en posiciones pares");





            //Invernadero ejercicio
//             int[][] temperaturas = {
//                 {18, 21, 19},
//                 {22, 25, 20},
//                 {17, 23, 24}
//             };

//             //Zonas criticas temperatura mayor o igual a 24°C
//             //Sumar temperaturras seguras entre 18°C y 23°C
//             //Mostrar posicion criticas
//             //Media zona seguras
//             int contadorCritico = 0;
//             int valorCritico = 0;
//             int temperaturaSegura = 0;
//             double mediaSegura = 0;
//             int contadorSegura = 0;
//             for (int i = 0; i < temperaturas.length; i++) {
//                 for (int j = 0; j < temperaturas[0].length; j++) {

//                     int temp = temperaturas[i][j];

//                     if ( temp>= 24){
//                         contadorCritico++;
//                         valorCritico = temp;
//                         System.out.println("Posicion: " + i + ", " + j + " y su valor es: " + valorCritico);
//                     }
//                     if (temp < 24 && temp >= 18) {
//                         contadorSegura++;
//                         temperaturaSegura = temperaturaSegura + temp;
//                     }
//                 }   
//             }
//             System.out.println("\nTotal  de zonas seguras: " + contadorSegura);
//             System.out.println("Suma de temperaturas seguras: " + temperaturaSegura);
//             System.out.println("Total de zonas críticas: " + contadorCritico);
//             if (contadorSegura > 0) {
//                 mediaSegura = temperaturaSegura / contadorSegura;
//                 System.out.println("Media de temperaturas seguras: " + mediaSegura);
        
//             } else {
//                 System.out.println("No hay temperaturas seguras");
//             }
            
//             //Fila completa segura
//             for (int i = 0; i < temperaturas.length; i++) {

//                 boolean filaSegura = true;

//                 for (int j = 0; j < temperaturas[i].length; j++) {
//                 int temp = temperaturas[i][j];
//                     if (temp < 18 || temp > 23){
//                         filaSegura = false;
//                         break;
//                     }
//                 }
//                 if (filaSegura == true) {
//                     System.out.print("\nFila " + i + " segura: ");
//                     for (int j = 0; j < temperaturas[i].length; j++) {
//                         System.out.print(temperaturas[i][j] + " ");
//                     }
//                     System.out.println();
// }
//             }

//             //Pintamos X donde sea mas de 24
//             System.out.println("\nTabla visual de zonas críticas (X = temperatura >= 24):");

//             for (int i = 0; i < temperaturas.length; i++) {
//                 for (int j = 0; j < temperaturas[i].length; j++) {
//                     if (temperaturas[i][j] >= 24) {
//                         System.out.print("X ");
//                     } else if (temperaturas[i][j]<18) {
//                         System.out.print( "- ");
//                     }else {
//                         System.out.print("S ");
//                     }
//                 }
                
//                 System.out.println(); // salto de línea al final de cada fila
//             }
//             System.out.println("\nTabla de valores:");
//                 for (int i = 0; i < temperaturas.length; i++) {
//                     for (int j = 0; j < temperaturas[i].length; j++) {
//                         System.out.print(temperaturas[i][j] + " ");
//                     }
//                     System.out.println(); // salto de línea
//                 }

//             //Las 2 tablas pero en horizonta

//             System.out.println("\nSímbolos y valores alineados (S = segura, X = crítica, - = fuera de rango):\n");

//             for (int i = 0; i < temperaturas.length; i++) {
//                 String lineaSimbolos = "";
//                 String lineaValores = "";

//                 for (int j = 0; j < temperaturas[i].length; j++) {
//                     int temp = temperaturas[i][j];

//                     // Construir línea de símbolos
//                     if (temp >= 24) {
//                         lineaSimbolos += " X ";
//                     } else if (temp < 18) {
//                         lineaSimbolos += " - ";
//                     } else {
//                         lineaSimbolos += " S ";
//                     }

//                     // Construir línea de valores con formato fijo
//                     lineaValores = lineaValores + String.format("%2d ", temp);
//                 }

//                 // Imprimir ambas líneas alineadas
//                 System.out.println(lineaSimbolos + "     " + lineaValores);
//             }

//     }


            // Tablero inicial (0 = casilla vacía)
                static int[][] tablero = {
                    {5,3,0, 0,7,0, 0,0,0},
                    {6,0,0, 1,9,5, 0,0,0},
                    {0,9,8, 0,0,0, 0,6,0},

                    {8,0,0, 0,6,0, 0,0,3},
                    {4,0,0, 8,0,3, 0,0,1},
                    {7,0,0, 0,2,0, 0,0,6},

                    {0,6,0, 0,0,0, 2,8,0},
                    {0,0,0, 4,1,9, 0,0,5},
                    {0,0,0, 0,8,0, 0,7,9}
                };

                // Función para imprimir el sudoku
                public static void imprimirSudoku(int[][] tablero) {
                    for (int i = 0; i < 9; i++) {
                        if (i % 3 == 0) System.out.println(" ");
                        for (int j = 0; j < 9; j++) {
                            if (j % 3 == 0) System.out.print(" ");
                            System.out.print(tablero[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println(" ");
                }

                // Validar si un número puede colocarse en una posición
                public static boolean esValido(int[][] tablero, int fila, int col, int num) {
                    // Recorremos la columna para ver si el numero esta
                    for (int i = 0; i < 9; i++) {
                        if (tablero[i][col] == num) return false;
                    }
                    // Recorremos la fila para ver si el numero esta
                    for (int j = 0; j < 9; j++) {
                        if (tablero[fila][j] == num) return false;
                    }
                    // Validar subcuadro 3x3
                    int inicioFila = (fila / 3) * 3;
                    int inicioCol = (col / 3) * 3;
                    for (int i = inicioFila; i < inicioFila + 3; i++) {
                        for (int j = inicioCol; j < inicioCol + 3; j++) {
                            if (tablero[i][j] == num) 
                                return false;
                        }
                    }
                    return true;
                }

                // Resolver sudoku con backtracking
                public static boolean resolverSudoku(int[][] tablero) {
                    for (int fila = 0; fila < 9; fila++) {
                        for (int col = 0; col < 9; col++) {
                            if (tablero[fila][col] == 0) { // celda vacía
                                for (int num = 1; num <= 9; num++) {
                                    if (esValido(tablero, fila, col, num)) {
                                        tablero[fila][col] = num;
                                        if (resolverSudoku(tablero)) return true;
                                        tablero[fila][col] = 0; // retroceder
                                    }
                                }
                                return false; // no hay número válido
                            }
                        }
                    }
                    return true; // sudoku completo
                }

                // Programa principal
                public static void main(String[] args) {
                    System.out.println("Sudoku inicial:");
                    imprimirSudoku(tablero);

                    if (resolverSudoku(tablero)) {
                        System.out.println("\nSudoku resuelto:");
                        imprimirSudoku(tablero);
                    } else {
                        System.out.println("No se pudo resolver el sudoku.");
                    }
                }
            

    
}
