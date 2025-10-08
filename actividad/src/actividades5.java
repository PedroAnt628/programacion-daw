public class actividades5 {
    //Ejercicio 1

    //Contar los digitos de un numero
    // public static int digitos(int n){
    //     int contador = 0;
    //     while (n > 0) {
    //         n=n/10;
    //         contador++;
    //     }
    //     return contador;
    // }

     //Contar los digitos de un numero recursivamente
     // public static int contar(int n){
     //     if(n<10){
     //         return 1;
     //     }else{
     //         return 1+contar(n/10);
     //     }
     // }
    // public static void main(String[] args) {
    //     System.out.println(digitos(200));
    // }

    //Ejercicio 2

    // public static int suma(int n){
    //     if (n==1){
    //         return 1;
    //     } else {
    //         return n+suma(n-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(suma(5));
    // }

    //Ejercicio 3
    //Función que calcula abusando recursividad. Recordad que a^b=a*ab-1

    // public static int potencia(int a,int b){
    //     if (b==0){
    //         return 1;
    //     }else {
    //         return a*potencia(a,b-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(potencia(2,3));
    // }

    // Método recursivo para pasar un número decimal, que
    // compruebe que es positivo, y pasarlo a binario mediante
    // sucesivas divisiones por 2

    public static int binario(int n){
        if (n<=0){
            return 0;
        }else {
            return (n % 2) + 10 * binario(n / 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(binario(4));
    }
}

