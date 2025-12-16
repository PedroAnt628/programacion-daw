package unidad5.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class tema5 {
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsolutePath());

        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        try {
            archivo = new File("numeros.txt");
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);

            String linea;
            while ( (linea=buffer.readLine()) != null) {
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
