package lecturaficheros;

import java.io.*;         
import java.util.Scanner;  

public class lecturafichero {


    public static void main(String[] args) {
        try {
            //Creamos un objeto File que apunta al fichero
            File f = new File("src/lecturaficheros/pruebaA.txt");

            //Creamos un Scanner para leer el contenido del fichero
            Scanner teclado = new Scanner(f);

            //Mientras haya líneas en el fichero, las mostramos
            while(teclado.hasNextLine()) {
                System.out.println(teclado.nextLine());
            }

            //Cerramos el Scanner (buena práctica)
            teclado.close();

        } catch (IOException e) {
            //Si hay error (ej. fichero no encontrado), mostramos el mensaje
            System.out.println("Error: " + e.getMessage());
        }
    }
}
