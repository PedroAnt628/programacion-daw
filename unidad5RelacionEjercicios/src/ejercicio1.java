import java.io.*;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ruta actual: " + new File("./unidad5RelacionEjercicios").getAbsolutePath());

        System.out.print("Ruta del primer fichero: ");
        String ruta1 = teclado.nextLine();
        System.out.print("Ruta del segundo fichero: ");
        String ruta2 = teclado.nextLine();
        System.out.print("Ruta destino (directorio): ");
        String rutaDestino = teclado.nextLine();

        File f1 = new File(ruta1);
        File f2 = new File(ruta2);

        String nombreFinal = f1.getName().replace(".txt","") + "_" + f2.getName();
        File fFinal = new File(rutaDestino + "\\" + nombreFinal);

        try (
            BufferedReader br1 = new BufferedReader(new FileReader(f1));
            BufferedReader br2 = new BufferedReader(new FileReader(f2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fFinal))
        ) {
            String linea;
            while((linea = br1.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            
            while((linea = br2.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo combinado creado: " + fFinal.getAbsolutePath());
        } catch(IOException e) {
            System.out.println("Error al procesar los ficheros: " + e.getMessage());
        }
    }
}
