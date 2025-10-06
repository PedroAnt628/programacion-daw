public class funciones_java {
    public static int suma(int numero1, int numero2){
        return numero1+numero2;

    }
    public static double suma(double numero1, double numero2){
        return numero1+numero2;
    }  
    //Sacar el maximo de numeros 
    public static int maximo(int numero1, int numero2){
        if (numero1>=numero2) return numero1;
        return numero2;

    }


    public static void escribir3saludos(String[] args) {
        System.out.println("Hola 1");
        System.out.println("Hola 2");
        System.out.println("Hola 3");
    }
    public static void main(String[] args) {
        
        escribir3saludos(args);
        /*
         * 
         */
        escribir3saludos(args);
         //Operacion
         System.out.println(suma(3, 5));
         
         System.out.println(maximo(maximo(3,7), 8));

}
}
