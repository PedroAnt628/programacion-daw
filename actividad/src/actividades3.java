import java.util.Scanner;
import javax.print.attribute.standard.Media;

public class actividades3 {
    public static void main(String[] args) {
    //Actividad 1
    //Numero del 50 al 200 multiplo de 2 y 3
    // for (int i=50;i<200;i++){
    //     if (i%2==0 && i%3==0){
    //     System.out.println("El numero "+i+" es multiplo de 2 y 3");      
    //     }
        
    // }

    //Actividad 2
    // Scanner teclado=new Scanner(System.in);
    // System.out.println("Introduce un numero");
    // int numero=teclado.nextInt();   
    
    // int producto=1;
    // for (int i=1;i<=numero;i++) {
    //     producto=producto*i;
    // } 
    // System.out.println(producto);

    //Actividad 3
    //Leer edades hasta leer -1 y sacar la max y min
    // int min=100000;
    // int max=0;
    // Scanner teclado=new Scanner(System.in);
    // int edad;
    // do{
    //     System.out.println("Introduce un munero o -1 para salir");
    //     edad=teclado.nextInt();
    //     //Logica para max y min
    //     if (edad>max){
    //         max=edad;
    //     }
    //     if (edad<min && edad!=-1){
    //         min=edad;
    //     }

    // }while (edad!=-1);
    // System.out.println("El maximo es "+max);
    // System.out.println("El minimo es "+min);
    // teclado.close();

    //Actividad 4
    // Scanner teclado=new Scanner(System.in);
    // int edad;
    // int contadorPersonas=0;
    // int suma=0;
    // int mayoresEdad=0;
    // double media;
    // do{
    //     System.out.println("Introduce un munero o -1 para salir");
    //     edad=teclado.nextInt();
    //     if (edad!=-1) contadorPersonas++;
    //     media=suma/contadorPersonas;
    //     suma=suma+(edad!=-1?edad:0);
    //     if (edad>=18) mayoresEdad++;

    // } while (edad!=-1);
    // System.out.println("La suma de las edades es: "+suma);
    // System.out.println("La media de las edades es: "+media);
    // System.out.println("El número de alumnos es: "+contadorPersonas);
    // System.out.println("El número de mayores de edad es: "+mayoresEdad);

    // teclado.close();


    //Actividad 5
    //Inicio
    //Introducir un numero
    //Generar numero aleatorio entre 1 y 100
    //Si numero introducido es mayor que el aleatorio
    //Decir que es mayor
    //Si numero introducido es menor que el aleatorio
    //Decir que es menor
    //Contar intentos
    //Fin

    // int tries=0, min=1, max=100;
    // Scanner teclado=new Scanner(System.in);
    //     System.err.println("Introduce tu numero");
    //     int numero=teclado.nextInt();


    // int aleatorio=(int)(Math.random()*(max-min+1))+min;
    // while (numero!=aleatorio){
    //     if (numero>aleatorio){
    //         System.out.println("El numero es mayor");
    //     } else {
    //         System.out.println("El numero es menor");
    //     }
    //     System.out.println("Introduce otro numero");
    //     numero=teclado.nextInt();
    //     tries++;
    // }
    // System.out.println("Has acertado en "+tries+" intentos");
    // teclado.close();

    //Actividad 6 Desarrolla un programa que simule una calculadora
    // según la opción introducida y que pida los operandos
    // hasta que introduces -1
    Scanner teclado=new Scanner(System.in);
    int numer1;
    int numero2;
    int operacion;
    do {
        System.out.println("Introduce un numero o -1 para salir");
        numer1=teclado.nextInt();
        if (numer1==-1)break;
        System.out.println("Introduce otro numero");
        numero2=teclado.nextInt();
        System.out.println("Elige una opcion: 1.Sumar 2.Restar 3.Multiplicar 4.Dividir");
        operacion=teclado.nextInt();
        switch (operacion){
            case 1:
                System.out.println("La suma es: "+(numer1+numero2));
                break;
            case 2:
                System.out.println("La resta es: "+(numer1-numero2));
                break;
            case 3:
                System.out.println("La multiplicacion es: "+(numer1*numero2));
                break;
            case 4:
                if (numero2!=0){
                    System.out.println("La division es: "+(numer1/numero2));
                } else {
                    System.out.println("No se puede dividir entre 0");
                }
                break;
            default:
                System.out.println("Opcion no valida");
        }
    } while (numer1!=-1);
    teclado.close();




    
}
}
