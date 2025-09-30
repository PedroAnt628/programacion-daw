
public class actividades {

public static void main(String[]args) throws Exception{
    int min=1, max=10;
    int numero1=(int)(Math.random()*(max-min+1))+min;
    int numero2=(int)(Math.random()*(max-min+1))+min;

    double conciente=numero1/(double)numero2;
    double media=(numero1+numero2)/2.0;
    double potencia=Math.pow(numero1, numero2);
    double raiz1=Math.sqrt(numero1);
    double raiz2=Math.sqrt(numero1);

    System.out.println("Los numeros generados son: "+numero1+" y "+numero2);
    System.out.println("El conciente es "+ conciente);
    System.out.println("La media es "+ media);
    System.out.println("La otencia es "+ potencia);
    System.out.println("La raiz cuadra de numero1 es "+ raiz1);
    System.out.println("La raiz cuadra de numero2 es "+ raiz2);

}
}