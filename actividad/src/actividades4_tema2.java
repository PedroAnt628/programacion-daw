import java.util.Scanner;

public class actividades4_tema2 {
 
    //Ejercicio 1 Pagina 24
    //Crea un procedimiento para calcular el área y volumen
    //de un cilindro (2*PI*(altura+radio), PI*radio2*altura)

//     final static double PI=3.14159;  
//     public static void main(String[] args) {
        
    
//     Scanner teclado=new Scanner(System.in);
//     double altura;
//     double radio;
//     System.out.println("Introduce los valores para altura");
//     altura=Double.parseDouble(teclado.nextLine());
//     System.out.println("Introduce el radio");
//     radio=Double.parseDouble(teclado.nextLine());
//     imprimeCilindro(altura, radio);
    
//     }
//     public static void imprimeCilindro(double altura, double radio){
//         System.out.println(2*PI*(altura+radio));
//         System.out.println(PI*(radio*radio)*altura);
//     }


        //Ejercicio 2 Pagina 24
        //Crear las funciones esPar, esDivisible3 y un
        //procedimiento para imprimir los números pares divisibles por 3 que
        //hay entre 1 y 20

        
        public static boolean esPar(int numero){
            return numero%2==0;
        }
        public static boolean esDivisible3(int numero){
            return numero%3==0;
        }
        public static void main(String[] args) {
            
        for (int i=1;i<=20;i++){
            if (esPar(i)&& esDivisible3(i)){
                System.out.println(i);
            }
        }
        
}
}

