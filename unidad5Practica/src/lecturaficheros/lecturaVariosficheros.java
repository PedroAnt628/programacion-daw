package lecturaficheros;

import java.io.*;

public class lecturaVariosficheros {
    public static void main(String[] args) {
        try {
            // Definimos las rutas de los ficheros de entrada
            File f1 = new File("src/lecturaficheros/pruebaA.txt");
            File f2 = new File("src/lecturaficheros/pruebaB.txt");

            // Definimos el fichero de salida
            File fFinal = new File("src/lecturaficheros/pruebaAB.txt");

            // Creamos lectores para los dos ficheros
            BufferedReader br1 = new BufferedReader(new FileReader(f1));
            BufferedReader br2 = new BufferedReader(new FileReader(f2));

            // Creamos escritor para el fichero final
            BufferedWriter bw = new BufferedWriter(new FileWriter(fFinal));

            // Copiamos el contenido del primer fichero
            String linea;
            while((linea = br1.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            // Copiamos el contenido del segundo fichero
            while((linea = br2.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            // Cerramos todos los recursos
            br1.close();
            br2.close();
            bw.close();

            System.out.println("Archivo combinado creado en: " + fFinal.getAbsolutePath());

            // Mostramos el contenido del archivo combinado
            BufferedReader brFinal = new BufferedReader(new FileReader(fFinal));
            String lineaFinal;
            while((lineaFinal = brFinal.readLine()) != null) {
                System.out.println(lineaFinal);
            }

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
