
import java.time.LocalTime;
import java.util.Scanner;

public class relacion_ejercicios_tema2 {
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
    //             System.out.println("| GBd      | PROG     | SIST.INF | IPE      | LMSGI    |");
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
    //     System.out.println("Introduce tu cargo (1 - Prog. junior, 2 - Prog. senior, 3 – JEfe de proyecto)");
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

//Ejercicio 7
    // public static void main(String[] args) {
    //     Scanner teclado=new Scanner(System.in);
    //     int numero;
    //     int contadorPositivos=0;
    //     int contadorNegativos=0;
    //     System.err.println("Introucde un numero o 0 para salir");
    //     numero=teclado.nextInt();
    //     while (numero!=0){
    //         if (numero<0){
    //             System.out.println("El numero es negativo");
    //             contadorNegativos++;
    //         } else{
    //             System.out.println("El numero es positivo");
    //             contadorPositivos++;
    //         }
    //         System.err.println("Introduce un numero o 0 para salir");
    //         numero=teclado.nextInt();
    //     }
    //     System.out.println("Numeros positivos: " + contadorPositivos);
    //     System.out.println("Numeros negativos: " + contadorNegativos);
    // }


//Ejercicio 8
    // public static void main(String[] args) {
    //     int n;
    //     int fibonacci1=0;
    //     int fibonacci2=1;
    //     int fibonacci3;
    //     int contador=0;
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.println("Introduce un numero");
    //     n = teclado.nextInt();
    //     if (n > 0) {
    //         System.out.println(fibonacci1);
    //     }
    //     if (n > 1) {
    //         System.out.println(fibonacci2);
    //     }
    //     for (contador = 2; contador < n; contador++) {
    //         fibonacci3 = fibonacci1 + fibonacci2;
    //         System.out.println(fibonacci3);
    //         fibonacci1 = fibonacci2;
    //         fibonacci2 = fibonacci3;
    //     }
    //     teclado.close();
    // }
    
//Ejercicio 9
    // public static int fibonacci(int n) {
    //     if (n <= 0) {
    //         return 0;
    //     } else if (n == 1) {
    //         return 1;
    //     } else {
    //         return fibonacci(n - 1) + fibonacci(n - 2);
    //     }
    // }
    // public static void main(String[] args) {
    //     int n;
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.println("INtroduce un numero");
    //     n = teclado.nextInt();
    //     for (int i = 0; i < n; i++) {
    //         System.out.println(fibonacci(i));
    //     }
    //     teclado.close();
    // }


//Ejercicio 10
    // public static int contarPar(int n) {
    //     if (n == 0) {
    //         return 0;
    //     } else {
    //         int digito = n % 10;
    //         if (digito % 2 == 0) {
    //             return 1 + contarPar(n / 10);
    //         } else {
    //             return contarPar(n / 10);
    //         }
    //     }
    // }

    // public static int contarImpar(int n) {
    //     if (n == 0) {
    //         return 0;
    //     } else {
    //         int digito = n % 10;
    //         if (digito % 2 != 0) {
    //             return 1 + contarImpar(n / 10);
    //         } else {
    //             return contarImpar(n / 10);
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);
    //     System.out.println("INtroduce un numero");
    //     int numero = teclado.nextInt();
    //     int pares = contarPar(numero);
    //     int impares = contarImpar(numero);
    //     System.out.println("El " + numero + " tiene " + pares + " digitos pares y " + impares + " digitos impares.");
    //     teclado.close();
    // }

//Ejercicio 11
    // public static void main(String[] args) {
    //     Scanner teclado=new Scanner(System.in);
    //     int numer1;
    //     int numero2;
    //     int operacion;
    //     do {
    //     System.out.println("Introduce un numero o -1 para salir");
    //     numer1=teclado.nextInt();
    //     if (numer1==-1)break;
    //     System.out.println("Introduce otro numero");
    //     numero2=teclado.nextInt();
    //     System.out.println("Elige una opcion: 1.Sumar 2.Restar 3.Multiplicar 4.Dividir");
    //     operacion=teclado.nextInt();
    //     switch (operacion){
    //         case 1:
    //             System.out.println("La suma es: "+(numer1+numero2));
    //             break;
    //         case 2:
    //             System.out.println("La resta es: "+(numer1-numero2));
    //             break;
    //         case 3:
    //             System.out.println("La multiplicacion es: "+(numer1*numero2));
    //             break;
    //         case 4:
    //             System.out.println("La division es: "+(numer1/numero2));

    //             break;
    //         default:
    //             System.out.println("Opcion no valida");
    //     }
    // } while (numer1!=-1);
    // }


//Ejercicio 12
    // public static void main(String[] args) {
    //     int a;
    //     int b;
    //     int resto;
    //     Scanner teclado=new Scanner(System.in);
    //     System.out.println("Introduce a");
    //     a=teclado.nextInt();
    //     System.out.println("Introduce b");
    //     b=teclado.nextInt();
    //     int originalA = a;
    //     int originalB = b;
    //     while (b!=0){
    //         resto =a % b;
    //         a=b;  
    //         b=resto;
    //     }
    //     System.out.println("El mcd es: "+a);

    //     int mcm=Math.max(originalA,originalB);
    //     while (mcm % originalA!=0 || mcm % originalB!=0){
    //         mcm=mcm+Math.max(originalA, originalB);
    //     }
    //         System.out.println("El mcm es: "+mcm);
    // }
}