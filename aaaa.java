public class aaaa {
    public static void main(String[] args) {
    int[][] numeros = {
    {1, 2, 3},
    {4, 5},
    {7, 8, 9}
};


for (int j = 0; j < 3; j++) {   // hasta la columna máxima que esperes
    int sumaColumna = 0;
    for (int i = 0; i < numeros.length; i++) {
        if (j < numeros[i].length) {   // comprobamos si la columna existe en esa fila
            sumaColumna = sumaColumna + numeros[i][j];
        }
    }
    System.out.println("La suma total de la columna " + j + " es: " + sumaColumna);
}
for (int i = 0; i < numeros.length; i++) {   
    int sumaFila = 0;                        
    for (int j = 0; j < numeros[i].length; j++) {   
        sumaFila = sumaFila + numeros[i][j];           
    }
    System.out.println("La suma total de la fila " + i + " es: " + sumaFila);
}
    }
}
