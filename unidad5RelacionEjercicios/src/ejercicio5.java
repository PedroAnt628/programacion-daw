import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        // HashMap donde guardaremos usuario → contraseña
        Map<String, String> credenciales = new HashMap<>();

        // Cargar datos desde el fichero
        try {
            Scanner lectorFichero = new Scanner(new File("unidad5RelacionEjercicios/src/ejercicio5.txt"));

            while (lectorFichero.hasNextLine()) {
                String linea = lectorFichero.nextLine().trim();
                if (!linea.isEmpty()) {
                    String[] partes = linea.split(" ");
                    if (partes.length == 2) {
                        credenciales.put(partes[0], partes[1]);
                    }
                }
            }

            lectorFichero.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero ejercicio5.txt");
            return;
        }

        // Control de acceso
        Scanner teclado = new Scanner(System.in);
        int intentos = 3;
        boolean accesoConcedido = false;

        while (intentos > 0 && !accesoConcedido) {

            System.out.print("Usuario: ");
            String usuario = teclado.nextLine();

            System.out.print("Contraseña: ");
            String password = teclado.nextLine();

            // Comprobación
            if (credenciales.containsKey(usuario) &&
                credenciales.get(usuario).equals(password)) {

                System.out.println("Ha accedido al área restringida");
                accesoConcedido = true;

            } else {
                intentos--;
                System.out.println("Datos incorrectos. Intentos restantes: " + intentos);
            }
        }

        if (!accesoConcedido) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }

        teclado.close();
    }
}
