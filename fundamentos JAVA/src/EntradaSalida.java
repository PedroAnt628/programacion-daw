import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args){
        //Instruciones de salida por pantalla
    //     int valor=7;
    //     System.out.println(valor);

    //     //Usar printf
    //     double precio=13.456;
    //     System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d","Tablets",precio,valor);
        
    //     //Incluir un icono
    //     System.out.println("Que ganas tengo de unas vacaciones \u26F1");

    //     //Formato reciente de System
    //     System.out.println("El precio del producto "+"Tablet "+"tiene un valor de "+precio+ " y se han comprado "+valor);

    //     //Formato salida texto
    //     System.out.printf("%15s, %-15s \n","Pedro","Informatico");
    
    //     System.out.println("|----------|----------|----------|");
    //     System.out.printf("|%-10s|%-10s|%-10s|\n", "Producto","Cantidad","Valor");
    //     System.out.println("|----------|----------|----------|");
    //     System.out.printf("|%-10s|%d         |%f |\n", "Producto",valor,precio);
    //     System.out.println("|----------|----------|----------|");

    //     System.out.println("|----------|----------|----------|");
    //     System.out.println("|"+"Producto  "+"|"+"Cantidad"  +"  |"+"Precio    "+"|");
    //     System.out.println("|----------|----------|----------|");
    //     System.out.println("|"+"Producto  "+"|"+valor+"         |"+precio + "    |");
    //     System.out.println("|----------|----------|----------|");

        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce:Nombre");
        //Leer nombre
        String nombre=teclado.nextLine();

        System.out.println("Introduce:Apellido");
        //Leer apellido
        String apellido=teclado.nextLine();

        System.out.println("Introduce: Edad");
        //Leer edad
        //int edad=teclado.nextInt();

        //Opcion 1 limpiar buffer
        //teclado.nextLine(); //Limiar el buffer para el salto de linea

        //Opcion 2 limpiar buffer
        int edad=Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce: Profesion");
        //Leer profesion
        String profesion=teclado.nextLine();
        System.out.println("El ususario se llama "+ nombre+ apellido+ ". Tiene "+ edad+ "años y trabaja de "+profesion);

        

        teclado.close();

    }

}
