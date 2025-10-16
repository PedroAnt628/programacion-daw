
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
    // public static void main(String[] args) {
    //     int nota1;
    //     int nota2;
    //     double media;
    //     String recuperacion;
    //     Scanner teclado=new Scanner(System.in);
    //     System.out.println("Nota del primer examen");
    //     nota1=teclado.nextInt();
    //     System.out.println("Nota del segundo examen");
    //     nota2=teclado.nextInt();
    //     media=(nota1+nota2)/2.0;
    //     if (media>=5){
    //         System.out.println("Estas aprobado con un "+media);
    //     } else if (media<5){
    //         System.out.println("Resultado de la recuperación (apto/no apto)");
    //         recuperacion=teclado.next();
    //         if (recuperacion.equalsIgnoreCase("apto")){
    //             System.out.println("Tu nota es un 5");
    //         } else if (recuperacion.equalsIgnoreCase("no apto")){
    //             System.out.println("Tu nota es un "+media);
    //         } else{
    //             System.out.println("Respuesta incorrecta");
    //         }
    //     }
    // }


//Ejercicio 5
    // public static void main(String[] args) {
    //     int diasemana;
    //     Scanner teclado=new Scanner(System.in);
    //     System.out.println("Introduce un dia de la semana (1-5) para ver las asignaturas de ese dia, 6 para ver el horario completo o 7 para salir");
    //     diasemana=teclado.nextInt();
    //     switch (diasemana){
    //         case 1:
    //             System.out.println("Lunes: IPE, SIST.INF, GBD, PROG");
    //             break;
    //         case 2:
    //             System.out.println("Martes: LMSGI, SIST.INF, PROG, ENT.DESA");
    //             break;
    //         case 3:
    //             System.out.println("Miercoles: GBD, SIST.INF, PROG");
    //             break;
    //         case 4:
    //             System.out.println("Jueves: PROG, ENT.DESA, IPE, GBD, Sostenibilidad");
    //             break;
    //         case 5:
    //             System.out.println("Viernes: GBD, Digitalizacion, LMSGI, IPE, PROG");
    //             break;
    //         case 6:
    //             System.out.println("|----------|----------|----------|----------|----------|");
    //             System.out.println("| Lunes    | Martes   | Miercoles| Jueves   | Viernes  |");
    //             System.out.println("|----------|----------|----------|----------|----------|");
    //             System.out.println("| IPE      | LMSGI    | GBD      | PROG     | GBD      |");
    //             System.out.println("| SIST.INF | SIST.INF | GBD      | ENT.DESA | Digitaliz|");
    //             System.out.println("| GBD      | SIST.INF | SIST.INF | ENT.DESA | LMSGI    |");
    //             System.out.println("| GBD      | PROG     | SIST.INF | IPE      | LMSGI    |");
    //             System.out.println("| PROG     | PROG     | PROG     | GBD      | IPE      |");
    //             System.err.println("| PROG     | ENT.DESA | PROG     | Sosteni  | Sosteni  |");
    //             System.out.println("|----------|----------|----------|----------|----------|");
    //             break;
    //         case 7:
    //             System.out.println();
    //             break;
    //         default:
    //             System.out.println("Dia incorrecto");
    //     }
    // }

//Ejercicio 6
    // public static void main(String[] args) {
    //     int cargo;
    //     int diaViaje;
    //     int estadoCivil;
    //     int sueldoBase=0;
    //     int dietas;
    //     double irpf;
    //     double sueldoNeto;
    //     Scanner teclado=new Scanner(System.in);
    //     System.out.println("Introduce tu cargo (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto)");
    //     cargo=teclado.nextInt();
    //     System.out.println("Introduce los dias que has visitado clientes");
    //     diaViaje=teclado.nextInt();
    //     System.out.println("Introduce tu estado civil (1 - Soltero, 2 - Casado)");
    //     estadoCivil=teclado.nextInt();
    //     switch (cargo){
    //         case 1:
    //             sueldoBase=950;
    //             break;
    //         case 2:
    //             sueldoBase=1200;
    //             break;
    //         case 3:
    //             sueldoBase=1600;
    //             break;
    //         default:
    //             System.out.println("Cargo incorrecto");
    //     }
    //     dietas=diaViaje*30;
    //     if (estadoCivil==1){
    //         irpf=0.25;
    //     } else if (estadoCivil==2){
    //         irpf=0.20;
    //     } else{
    //         irpf=0;
    //         System.out.println("Estado civil incorrecto");
    //     }
    //     sueldoNeto=(sueldoBase+dietas)-(sueldoBase+dietas)*irpf;
    //     System.out.println("|-------------------------------------|");
    //     System.out.println("| Sueldo Base:          |" + sueldoBase + "          |");
    //     System.out.println("| Dietas (" + diaViaje + " viajes)     | " + dietas + "          |");
    //     System.out.println("| IRPF (" + (irpf*100) + "%)          | " + ((sueldoBase+dietas)*irpf) + "       |");
    //     System.out.println("| Sueldo Neto:          | " + sueldoNeto + "       |");
    //     System.out.println("|-------------------------------------|");
  
    // }



}
