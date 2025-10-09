
import java.time.LocalTime;
import java.util.Scanner;

public class relacion_ejercicios {
//Ejercicio 1
    // public static void main(String[] args) {
    //     LocalTime clock = LocalTime.now();
    //     int hora=clock.getHour();
    //     if (hora>=6 && hora<=12){
    //         System.out.println("Buenos dias");
    //     }else if (hora>=13 && hora<=20){
    //         System.out.println("Buenas tardes");
    //     }else{
    //         System.out.println("Buenas noches");
    //     }
    // }

//Ejercicio 2
    // public static void main(String[] args) {
    //     int horasExtra;
    //     int horas=0;
    //     int salario;
    //     Scanner teclado=new Scanner(System.in);
    //     System.out.println("Introduce tus horas semanales");
    //     horas=teclado.nextInt();
    //     horasExtra=horas-40;
    //     salario=(40*12)+(horasExtra*16);
    //     if (horas<=40){
    //         System.out.println("Tu sueldo es "+horas*12);
    //     } else if (horas>40){
    //         System.out.println("Tu suldo es "+ salario);
    //     }
    // }
   
    
//Ejercicio 3
    // public static void main(String[] args) {
    //     int dia;
    //     int mes;
    //     Scanner teclado=new Scanner(System.in);
    //     System.out.println("Introduce tu dia de nacimiento");
    //     dia=teclado.nextInt();
    //     System.out.println("Introduce tu mes de nacimiento");
    //     mes=teclado.nextInt();
        
    //     if (mes >=1 && mes <=2){
    //         if (dia >=20 || dia <=19){
    //             System.out.println("Fecha Acuario");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=2 && mes <=3){
    //             if (dia >=19 || dia <=20){
    //                 System.out.println("Fecha Piscis");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=3 && mes <=4){
    //             if (dia >=21 || dia <=19){
    //                 System.out.println("Fecha Aries");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=4 && mes <=5){
    //             if (dia >=20 || dia <=20){
    //                 System.out.println("Fecha Tauro");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=5 && mes <=6){
    //             if (dia >=21 || dia <=20){
    //                 System.out.println("Fecha Geminis");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=6 && mes <=7){
    //             if (dia >=21 || dia <=22){
    //                 System.out.println("Fecha Cancer");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=7 && mes <=8){
    //             if (dia >=23 || dia <=22){
    //                 System.out.println("Fecha Leo");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=8 && mes <=9){
    //             if (dia >=23 || dia <=22){
    //                 System.out.println("Fecha Virgo");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=9 && mes <=10){
    //             if (dia >=23 || dia <=22){
    //                 System.out.println("Fecha Libra");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=10 && mes <=11){
    //             if (dia >=23 || dia <=21){
    //                 System.out.println("Fecha Escorpio");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=11 && mes <=12){
    //             if (dia >=22 || dia <=21){
    //                 System.out.println("Fecha Sagitario");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     }
    //     else if (mes >=12 && mes <=1){
    //             if (dia >=22 || dia <=19){
    //                 System.out.println("Fecha Capricornio");
    //         }
    //         else{
    //             System.out.println("Fecha incorrecta");
    //         }
    //     } else{
    //         System.out.println("Fecha incorrecta");
    //     }
        
    // } 
    

//Ejercicio 4
    public static void main(String[] args) {

    int nota1;
    int nota2;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce la nota del primer examen");
    nota1=teclado.nextInt();
    System.out.println("Introduce la nota del segundo examen");
    nota2=teclado.nextInt();
    int media=(nota1 + nota2) / 2;
    if ( media>= 5 ){
        System.out.println("Estas aprobado con un " + media);
    } else {
        System.out.println("Cual ha sido el resultado de la recuperacion");
        
        Scanner teclado2=new Scanner(System.in);
        String recuperacion=teclado2.nextLine();

            if (recuperacion.equals("apto")){
                System.out.println("Has aprobado la recuperacion");
            } else {
                System.out.println("Has suspendido la recuperacion");
            }
    }

    }
    
}
