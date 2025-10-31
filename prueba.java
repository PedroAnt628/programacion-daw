
import java.util.Scanner;

public class prueba{
    public static void main(String[] args){
        //Numeros aleatorios y funciones matematicas 

        // int a=(int)(Math.random() * (10 - 1 + 1)) + 1;
        // int b=(int)(Math.random() * (15 - 5 + 1)) + 5;
        
        // double cociente= (double) a / b;
        // double media= (a + b)/2.0;
        // double potencia= (Math.pow(a, b));
        // double raizA= (Math.sqrt(a));
        // double raizB= (Math.sqrt(b));

        // System.out.println("Número A: " + a);
        // System.out.println("Número B: " + b);
        // System.out.println("Cociente: " + cociente);
        // System.out.println("Media: " + media);
        // System.out.println("Potencia: " + potencia);
        // System.out.println("Raíz de A: " + raizA);
        // System.out.println("Raíz de B: " + raizB);



        // //For porq conozco los valores que pide
        // int numero1=0;
        // for (int i = 1; i <= 10; i++) {
        //     numero1=i;
        //     System.err.println(numero1);
        // }



        //Numero valido entre 0 y 10 y calcula sus 5 primeros multiplos
        //While porque no sabemos las veces que se va a hacer
        // int numero2;
        // Scanner teclado=new Scanner(System.in);
        // System.out.println("Introduce numero entre 0 y 10");
        // numero2=teclado.nextInt();
        // while (numero2<0 || numero2>10){
        //     System.out.println("Introduce numero entre 0 y 10");
        //     numero2=teclado.nextInt();
        // }

        // System.err.println("El numero es: "+ numero2);
        // for (int i = 1; i <= 5; i++) {
        //     System.out.print(i * numero2+" ");
        // }



        // int edad;
        // int edadmax = Integer.MIN_VALUE;         
        // Scanner teclado=new Scanner(System.in);
        // do {
        //     System.err.println("Introduce una edad o -1 para salir");
        //     edad=teclado.nextInt();
        //     if (edad>edadmax && edad !=-1){
        //         edadmax=edad;
        //     }
        // } while (edad !=-1);
        // System.out.println("La edad máxima introducida fue: " + edadmax);
        


        // int numero3;
        // System.out.println("Introdude la tabla que quieres multiplicar");
        // Scanner teclado=new Scanner(System.in);
        // numero3=teclado.nextInt();
        // int resultado;
        // for (int i = 1; i <= 10; i++) {
        //     resultado = i * numero3;
        //     System.out.println(numero3 + " x " + i + " = " + resultado);
        // }



        // int numero4;
        // int contador=0;
        // Scanner teclado=new Scanner(System.in);
        // do { 
        //     System.out.println("Introduce un numero o 0 para salir");
        //     numero4=teclado.nextInt();
        //     if (numero4 % 2 == 0 && numero4 != 0){
        //         contador++;
        //     }
        // } while (numero4 != 0);
        //     System.out.println("Hay " + contador +" numeros pares");
        

        
        // int numero5; 
        // int numeroAle=(int)(Math.random() * (100 - 1 + 1) + 1);
        // Scanner teclado = new Scanner(System.in);
        // do { 
        //     System.out.println("Introduce un numero");
        //     numero5=teclado.nextInt();
        //     if (numero5 < numeroAle) {
        //         System.out.println("El numero es mayor");
        //     }else if (numero5 > numeroAle){
        //         System.out.println("El numero es menor");
        //     }
        // } while (numero5 != numeroAle);
        // System.out.println("Has acertado, el numero era " + numeroAle);



        // int n;
        // System.out.println("Introduce la altura");
        // Scanner teclado = new Scanner(System.in);
        // n = teclado.nextInt();

        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    


        // int resultado=suma(5);
        // System.out.println("La suma es " + resultado); 
        // }
        // public static int suma(int n) {
        //  if (n == 0){
        //  return 0;
        //  } else {
        //  return n + suma(n - 1);
        //  }



        //Contador de pares e impares 10 numeros
        // int numero;
        // int contadorPar=0;
        // int contadorImp=0;
        // System.out.println("Introduce un numero");
        // Scanner teclado= new Scanner(System.in);
        // numero = teclado.nextInt();

        // for (int i = 1; i < 10; i++) {
        //     numero = teclado.nextInt();
        //     if (numero % 2 == 0) {
        //         contadorPar++;
        //     } else {
        //         contadorImp++;
        //     }
        // }
        // System.out.println("Hay " + contadorPar+" numeros para y " + contadorImp + " numeros impares");



        //Tabla de multiplicar personalizada
        // int numero3;
        // System.out.println("Introdude la tabla que quieres multiplicar");
        // Scanner teclado=new Scanner(System.in);
        // numero3=teclado.nextInt();
        // int resultado;
        // for (int i = 1; i <= 10; i++) {
        //     resultado = i * numero3;
        //     System.out.println(numero3 + " x " + i + " = " + resultado);
        // }



        //Sumar números hasta que se introduzca 0
        // int numero;
        // int suma=0;
        // Scanner teclado= new Scanner(System.in);

        // do {
        //     System.out.println("Introduce numeros o 0 para salir");
        //     numero = teclado.nextInt();
        //     suma = suma + numero;
            
        // } while (numero != 0);
        // System.out.println("La suma total es " + suma);



        //Edad mínima y máxima
        // int edad;
        // int max= Integer.MIN_VALUE;
        // int min= Integer.MAX_VALUE;
        // Scanner teclado = new Scanner(System.in);

        // do {
        //     System.out.println("Introduce una edad o -1 para salir");
        //     edad = teclado.nextInt();
        //     if (edad>max && edad != -1 )
        //         max=edad;
        //     if (edad<min && edad != -1 )
        //         min=edad; 

        // } while (edad!=-1);
        // System.out.println("La edad minima es " + min + " y la maxima es " + max);



        //Contador de negativos seguidos
        // int numero;
        // int contadorNeg=0;
        // int contador=0;
        // Scanner teclado = new Scanner(System.in);
        
        // do {
        //     System.out.println("Introduce numeros");
        //     numero = teclado.nextInt();
        //     contador++;

        //     if (numero < 0){
        //         contadorNeg++;
        //     }else{
        //         contadorNeg=0; //Rompe racha
        //     }
        // } while (contadorNeg < 3);
        //     System.out.println("Has introducido " + contador + " numeros");



        //Triángulo alineado a la derecha
        // int altura;
        // System.out.println("Introduce la altura");
        // Scanner teclado = new Scanner(System.in);
        // altura = teclado.nextInt();

        // for (int i = 1; i <= altura; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
 

        //Funcion fibonacci
        //System.out.println(fibonacci(7)); // imprime 13



        //Cuenta atrás
        // int n=8;
        // for (int i = n; i >= n; i--) {
        //     System.out.println(i);
        // }



        //Calculadora
        // int numero1;
        // int numero2;
        // int cuenta;

        // do {
        //     System.out.println("Que operacion quieres hacer: 1-Sumar, 2-Retar, 3-Multiplicar, 4-Dividir o -1 para salir");
        //     Scanner teclado = new Scanner(System.in);
        //     cuenta = teclado.nextInt();
        //     if (cuenta==-1) break;
        //     System.out.println("Cuales son los numeros");
        //     numero1 = teclado.nextInt();
        //     numero2 = teclado.nextInt();
        //     switch (cuenta) {
        //         case 1:
        //             System.out.println(numero1 + numero2);
        //             break;
        //         case 2:
        //             System.out.println(numero1 - numero2);
        //             break;
        //         case 3:
        //             System.out.println(numero1 * numero2);
        //             break;
        //         case 4:
        //             System.out.println(numero1 / numero2);
        //             break;
        //         default:
        //             System.out.println("Operacion no valida");
                
        //     }
        // } while (cuenta!=-1);


        
    }
    



    //Funcion fibonacci
    // public static int fibonacci(int n) {
    //     if (n == 0) {
    //         return 0; // caso base
    //      } else if (n == 1) {
    //         return 1; // caso base
    //     } else {
    //         return fibonacci(n - 1) + fibonacci(n - 2); // caso recursivo
    //     }
    // }

    //Cuenta atras recursiva
    // public static void cuentaAtras(int n) {
    //         if (n < 0) {
    //             System.out.println("¡Despegue!");
    //         } else {
    //             System.out.println(n);
    //             cuentaAtras(n - 1); // llamada recursiva
    //         }
    // }

}