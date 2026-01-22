package Actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class actividadesPag16 {
public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new File(".").getAbsolutePath());

        // Actividad 1: Lee una secuencia de números
        // en un fichero y calcula su suma y media.
        // Usa Scanner donde la entrada es fichero y
        // en while usa scanner.hasNextInt()

        try {
            File archivo = new File("numeros.txt");
            double suma = 0;
            int contador = 0;

            Scanner fichero = new Scanner(archivo);

            while (fichero.hasNextInt()) {
                int numero = fichero.nextInt();
                System.out.println(numero);
                suma += numero;
                contador++;
            }

            double media = suma / contador;
            System.out.println("Hay " + contador + " números, la suma es " + suma + " y la media es " + media);

            fichero.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
     }
}

class actividad2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new File(".").getAbsolutePath());

        // Actividad 2: Haz el mismo ejercicio anterior
        // pero ahora las líneas van una tras otro
        // separados por ‘,’. Tendrás que usar
        // sc.useDelimiter(",") o leer String y split en
        // un array
        File archivo=null;
        FileReader reader=null;
        BufferedReader buffer = null;
        try {
            
        archivo=new File("./unidad5/numeros.txt");
        reader=new FileReader(archivo);
        buffer=new BufferedReader(reader);

        String linea= buffer.readLine();
        System.out.println(linea); //Linea de numeros separados por ",""
        String[] numeros=linea.split(";");
        //Procesar el array de String
        double contador=0,suma=0,media=0;
        for(int i=0;i<numeros.length;i++){
            contador++;
            suma+=Integer.parseInt(numeros[i]);
        }
        media=suma/contador;
        System.out.println("Hay "+contador+" números y la suma es "+suma+" y la media es "+media);
        buffer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     }
}


