import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


    //Ejericio 3
        // int numero; //Numero del usuario
        // int sumaIm=0; //Para sumar los impares
        // int contador=0; //Para contar los numeros introducidos
        // int maxpar= Integer.MIN_VALUE; //Para sacar el mayor de os pares
        // int min=Integer.MAX_VALUE; //Para sacar el menor de todos
        // Scanner teclado=new Scanner(System.in);

        // do {
        //     System.out.println("Introduce numeros o -1 para salir");
        //     numero = teclado.nextInt();
        //     if (numero !=-1){ //Si el numero no es -1, el contador sube
        //         contador++;
        //     }
        //     if (numero % 2 !=0 && numero !=-1){ //Si el numero no es par, se suma a la variable de sumaIm
        //         sumaIm = numero + sumaIm;   
        //     }
        //     if (numero % 2 ==0 && numero !=-1){ //Si el numero es par, se debe tener en cuenta para saber el par mas grande
        //         maxpar = numero;
        //     }
        //     if (numero<min && numero!=-1){ //Si el numero es menor que el que ya existe como mas pequeño, este sera el nueov minimo
        //         min = numero;
        //     }

        // } while (numero !=-1); //Si el numero es igual a -1, se cierra el bucle e imprime
        // System.out.println("Has introducido " + contador + " numero, ademas, la suma de los impares es: " + sumaIm + " .El mayor de los pares: " + maxpar + " .El menor de todos: " + min);



        //Ejercicio 1
        // int entradas;
        // int dia;
        // int cinecampa;
        // double precio=0.0;
        // Scanner teclado = new Scanner(System.in);

        //     System.out.println("Cuantas personas son");
        //     entradas = teclado.nextInt();
        //     System.out.println("Que dia de la semana es: 1-Lunes/Martes/Viernes/Sabado/Domingo, 2-Miercoles, 3-Jueves");
        //     dia = teclado.nextInt();
        //     System.out.println("Tienes la targeta CineCampa (1=Si o 2=No)");
        //     cinecampa = teclado.nextInt();

        //     if (dia == 1){  //Si el dia es lunes/martes/viernes/sabado o domingo el precio sera el base, 8€
        //         precio = entradas * 8;
        //     }

        //     if (dia == 2){  //Si el dia es miercoles el precio sera 5€
        //         precio = entradas * 5;
        //     }

        //     if (dia == 3 && entradas % 2 ==0){  //Si el dia es jueves, y ademas vienes en pareja, el precio sera 11 por pareja pero si vienes solo o no es pareja es 8
        //         precio = (entradas / 2) * 11;
        //     } else if (dia == 3) {
        //         precio = entradas * 8;
        //     } 

        //     if (cinecampa == 1){
        //         precio= precio * 0.9;
        //     }

        // System.out.println("Aqui tiene sus entradas. En total son " +entradas+ " entradas y el precio es " + precio + " euros");



        //Ejercicio
        // boolean imprimeTablero=false;
        
        // if (imprimeTablero == true){
        //     System.out.println("|   |   |   |   |   |   |   |");
        //     System.out.println("|   |   |   |   |   |   |   |");
        //     System.out.println("|   |   | x |   |   |   |   |");
        //     System.out.println("|   |   | 0 | x |   |   |   |");
        //     System.out.println("|   | x | 0 | 0 |   |   |   |");
        //     System.out.println("| x | 0 | x | 0 | x |   |   |");
        //     System.out.println("-----------------------------");
        //     System.out.println("  0   1   2   3   4   5   6  ");
            
        // } else if (imprimeTablero == false) {
        //     System.out.println("| x | 0 | x |");
        //     System.out.println("-------------");
        //     System.out.println("|   | 0 |   |");
        //     System.out.println("-------------");
        //     System.out.println("|   | x |   |");
        //     System.out.println("-------------");
        //     System.out.println("  0   1   2  ");
        //}



        //Ejercicio 4
        // int n;
        // System.out.println("Introduce un numero para saber si es primo");
        // Scanner teclado = new Scanner(System.in);
        // n = teclado.nextInt();

        // if (n<2){
        //     System.out.println("No es primo");
        // } else{
        //     System.out.println("Es primo");
        // }
        // for (int i=2; i<n ; i++){
        // }

        int jugador;
        int ordenador= (int)(Math.random() * (3 - 1 + 1)) + 1;
        int victoriasOrd=0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Introde tu jugada 1-Piedra, 2-Papel, 3-Tijera o -1 para salir");
            jugador = teclado.nextInt();

                if (jugador == 1 && ordenador == 1 || jugador == 2 && ordenador == 2 || jugador == 3 && ordenador == 3){ //Casos de empate
                    System.out.println("Empate");
                } else if (jugador == 1 && ordenador == 3 || jugador == 2 && ordenador == 1 || jugador == 3 && ordenador == 2){ //Casos en los que gana el jugador
                    System.out.println("Jugador gana");
                }else{ //El resto de casos los gana el ordenador
                    System.out.println("Ordenador gana");
                    victoriasOrd++;
                }
    } while(victoriasOrd!=5 || jugador !=-1);




    }
    
}
