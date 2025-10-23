
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

        // //While porque no sabemos las veces que se va a hacer
        // int numero2;
        // Scanner teclado=new Scanner(System.in);
        // System.out.println("Introduce numero entre 0 y 10");
        // numero2=teclado.nextInt();
        // while (numero2<0 || numero2>10){
        //     System.out.println("Introduce numero entre 0 y 10");
        //     numero2=teclado.nextInt();
        // }
        // System.err.println("El numero valido es: "+ numero2);


        // for (int i = 1; i <= 5; i++) {
        //     System.out.print(i * 3+" ");
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
        

        int numero3;
        System.out.println("Introdude la tabla que quieres multiplicar");
        Scanner teclado=new Scanner(System.in);
        numero3=teclado.nextInt();
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = i * numero3;
            System.out.println(numero3 + " x " + i + " = " + resultado);


            
        }

    }
}