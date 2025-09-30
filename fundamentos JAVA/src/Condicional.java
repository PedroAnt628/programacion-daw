import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
    //     int user = 45;
    //     if (user<=18) {
    //         System.out.println("User es muy joven");
    //     }
    //     else if (user > 18 && user <40) {
    //         System.out.println("User esta entre 19 y 39");
    //     }
    //     else if (user ==45||user==50){
    //         System.out.println("User tiene 45 o 50");
    //     }
    //     else {
    //         System.out.println("User es mayor de 40");
    //     }
    // }

    //Comprobar si un numero es divisible por 2 y 3
        // Scanner teclado=new Scanner(System.in);

        // System.out.println("Introduce el primer numero");
        // int numero1=teclado.nextInt();

        // System.out.println("Introduce el segundo numero");
        // int numero2=teclado.nextInt();

        // teclado.close();

        // int aleatorio=(int)(Math.random()*(numero1-numero2+1))+numero2;

        // if (aleatorio%2==0 && aleatorio%3==0) {
        //     System.out.println("El numero "+aleatorio+" es divisible entre 2 y 3");
        // }
        // else {
        //     System.out.println("El numero "+aleatorio+" no es divisible entre 2 y 3");
        

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce un numero");
        int mes=teclado.nextInt();

        teclado.close();


        // if (mes==1) {
        //     System.out.println("El numero corresponde a Enero");
        // }
        // else if (mes==2){
        //     System.out.println("el numero corresponde a Febrero");
        // }
        // else if (mes==3){
        //     System.out.println("el numero corresponde a Marzo");
        // }
        // else if (mes==4){
        //     System.out.println("el numero corresponde a Abril");
        // }
        // else if (mes==5){
        //     System.out.println("el numero corresponde a Mayo");
        // }
        // else if (mes==6){
        //     System.out.println("el numero corresponde a Junio");
        // }
        // else if (mes==7){
        //     System.out.println("el numero corresponde a Julio");
        // }
        // else if (mes==8){
        //     System.out.println("el numero corresponde a Agosto");
        // }
        // else if (mes==9){
        //     System.out.println("el numero corresponde a Septiembre");
        // }
        // else if (mes==10){
        //     System.out.println("el numero corresponde a Octubre");
        // }
        // else if (mes==11){
        //     System.out.println("el numero corresponde a Noviembre");
        // }
        // else if (mes==12){
        //     System.out.println("el numero corresponde a Diciembre");
        // }

        //Lo mismo pero un switch
        switch(mes)  {
            case 1:System.out.println("Enero");break;
            case 2:System.out.println("Febrero");break;
            case 3:System.out.println("Marzo");break;
            case 4:System.out.println("Abril");break;
            case 5:System.out.println("Mayo");break;
            case 6:System.out.println("Junio");break;
            case 7:System.out.println("Julio");break;
            case 8:System.out.println("Agosto");break;
            case 9:System.out.println("Septiembre");break;
            case 10:System.out.println("Octubre");break;
            case 11:System.out.println("Noviembre");break;
            default: System.out.println("Diciembre");
        }     
        
}
}
