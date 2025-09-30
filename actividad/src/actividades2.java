import java.time.LocalDate;
import java.util.Scanner;

public class actividades2{
    public static void main(String[] args) throws Exception {
    // int a=0,b=0,c=0;
    // Scanner teclado=new Scanner(System.in);

    // System.out.println("Introduce a");
    // a=teclado.nextInt();

    // System.out.println("Introduce b");
    // b=teclado.nextInt();

    // System.out.println("Introduce c");
    // c=teclado.nextInt();

    // teclado.close();

    // double x1=0, x2=0;
    // double discriminante=Math.pow(b,2)-4*c*b;
    // if (discriminante <0) {
    //     System.out.println("NO hay soluccion");
    // }
    // else if (discriminante==0){
    //     x1=-b/2*a;
    //     System.out.println("La unica soluccion es "+x1);
    // }
    // else{
    //     x1=(-b+Math.sqrt(discriminante))/(2*a);
    //     x2=(-b-Math.sqrt(discriminante))/(2*a);
    //     System.out.println("La primera soluccion es "+x1);
    //     System.out.println("La primera soluccion es "+x2);

    // }


      //Actividad2
    // Scanner teclado2=new Scanner(System.in);
    // System.out.println("Introduce la nota");
    // int nota=teclado2.nextInt();

    // teclado2.close();

    // if (nota<5) {
    // System.out.print("Suspenso");
    // }
    // else if (nota==5){
    //     System.out.println("Aprobado");
    // }
    // else if(nota<=7){
    //     System.out.println("Bien");
    // }
    // else if(nota<=9 ){
    //     System.out.println("Notable");
    // }
    // else if(nota==10){
    //     System.out.println("Sobresaliente");
    // }
    // else {
    //     System.out.println("Nota incorrecta");
    // }
    
    //Actividad3

    int dia=0,mes=0,año=0;
    Scanner teclado=new Scanner(System.in);

    System.out.println("Introduce dia");
    dia=teclado.nextInt();

    System.out.println("Introduce mes");
    mes=teclado.nextInt();

    System.out.println("Introduce año");
    año=teclado.nextInt();

    teclado.close();

    if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
        if (dia>1 && dia<=31){
            System.out.println("fecha correcta");
        }
        else{
            System.out.println("fecha incorrecta");
        }
    }
    else if(mes==4 || mes==6 || mes==9 || mes==11){
        if (dia>=1 && dia<=30){
            System.out.println("Fecha correcta");
        }
        else {
            System.out.println("Fecha incorrecta");
        }
    }
    else if(mes==2){
        if (dia>=1 && dia<=28){
            System.out.println("Fecha correcta");
        }
        else if(dia==29){
            if ((año%4==0 && año%100!=0) || (año%400==0)){
                System.out.println("fecha correcta");
            }
            else {
                System.out.println("feccha incorrecta");
            }
        }
        else {
            System.out.println("fecha incorrecta");
        }
         
    }
    




    }

  

}
