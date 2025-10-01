import java.util.Scanner;

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

    //Atividad 4
    Scanner teclado=new Scanner(System.in);
    int edad;
    int contadorPersonas=0;
    do{
        System.out.println("Introduce un munero o -1 para salir");
        edad=teclado.nextInt();
        if (edad!=-1) contadorPersonas++;
        double media=(edad+edad)/2.0;

    } while ();
}
}
