import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
    //     for(int i=0;i<5;i++){
    //         System.out.println(i);
    //     }
    //     int j=0;
    // while(j<5){
    //     System.out.println(j);
    //     j++;
    // }
    // //Bucle do-while
    // int k=0;
    //  do{
    //     System.out.println(k);
    //     k++;
    //  } while(k<5);
    
    //Cosas que no debemos hacer
    // for (int i=0;i<5;i++){
    //     System.out.println(i);
    //     if (i==3) break;
    // }
    // //Hacerlo mejor con un bucle while
    // boolean continua=true;
    // int j=0;
    // while(j<5 && continua){
    //     System.out.println(j);
    //     if(j==3) continua=false;
    //     j++;
    // }

        // Scanner teclado=new Scanner(System.in);
        // int numero=0;
        // do{
        //     System.out.println("Escribe un numero entre 1 y 5: ");
        //     numero=teclado.nextInt();
        
        // } while(numero<1||numero>5);
        // teclado.close();
    
    //Bucles anidados
    // for (int i=1;i<=4;i++){
    //     if(i%2==0){
    //         for (int j=4;j>=i;j--){
    //             System.out.print("*");
    //         }
    //     }
    //     System.out.println("");
    // }

    //Imprimer las tablas de multiplicar del 1 al 10
    for (int i=1;i<=10;i++)
        for (int j=1;j<=10;j++) {
            System.out.println(i+"*"+j + "= " +(i*j));
        }
        System.out.println("");

    }
}

