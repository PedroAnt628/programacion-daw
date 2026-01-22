import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class ejercicio1 {
    public static void main(String[] args) {
        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        try {
            archivo = new File("./unidad5RelacionEjercicios/Nombre.txt");
        } catch (Exception e) {
            System.err.println("Error al leer o escribir la imagen: " + e.getMessage());
        }

    }
}
