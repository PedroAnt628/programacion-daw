package SegundoTrimes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class unidad5 {
    
    public static void main(String[] args) {
        //System.out.println("Directorio actual: " + new File(".").getAbsolutePath());
        // try {
        // File fichero = new File("heroes.json");
        // System.out.println(fichero.exists());
        // System.out.println("Nombre: " + fichero.getName());
        // System.out.println("Permiso de lectura: " + fichero.canRead());
        // System.out.println("Tamaño: " + fichero.length());
        // }catch (Exception e){
        //     System.out.println(e.getMessage());
        // }

        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        try {
            archivo = new File("heroes.json");
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);

            String linea;
            while ((linea=buffer.readLine()) != null){
                System.out.println(linea);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if (null != reader){
                    reader.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }

    }
}
