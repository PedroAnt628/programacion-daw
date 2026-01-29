package lecturaficheros;

import java.io.*;         
import java.util.Scanner; 

public class escribirfichero {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            // Definimos la ruta del fichero de salida
            // Se guardará en src/lecturaficheros/ con el nombre Salida.txt
            File f = new File("src/lecturaficheros/Salida.txt");

            // Creamos un BufferedWriter para escribir en el fichero
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            // Pedimos al usuario que escriba varias líneas
            System.out.println("Escribe texto (escribe 'FIN' para terminar):");


            String linea;
            while(true) {
                linea = teclado.nextLine();
                if(linea.equalsIgnoreCase("FIN")) {
                    break; // salimos del bucle si escribe FIN
                }
                bw.write(linea);   // escribimos la línea en el fichero
                bw.newLine();      // añadimos salto de línea
            }

            // Cerramos el escritor (muy importante)
            bw.close();
            System.out.println("Texto guardado en: " + f.getAbsolutePath());

            
            // Mostramos el contenido del fichero escrito
            Scanner lectura = new Scanner(f);
            while(lectura.hasNextLine()) {
                System.out.println(lectura.nextLine());
            }

            lectura.close();
        } catch(IOException e) {
            // Si hay error (ej. permisos, ruta incorrecta), mostramos el mensaje
            System.out.println("Error: " + e.getMessage());
        }
    }
}


