import java.io.*;

public class RegistroUsuario {
    public static void main(String[] args) {
        int victoriasJ1 = 0;
        int victoriasJ2 = 0;

        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        try {
            archivo = new File("./unidad5/tresEnRaya.txt");
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);

            String linea;
            while ((linea = buffer.readLine()) != null) {
                String[] partes = linea.split("=");
                if (partes[0].equals("jugador1")) {
                    victoriasJ1 = Integer.parseInt(partes[1]);
                } else if (partes[0].equals("jugador2")) {
                    victoriasJ2 = Integer.parseInt(partes[1]);
                }
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("No se encontró el archivo, se inicializan estadísticas en 0.");
        }

        victoriasJ1++;

        FileWriter fw = null;
        BufferedWriter escritor = null;

        try {
            fw = new FileWriter(archivo);
            escritor = new BufferedWriter(fw);

            escritor.write("jugador1=" + victoriasJ1);
            escritor.newLine();
            escritor.write("jugador2=" + victoriasJ2);

            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        System.out.println("Jugador1: " + victoriasJ1 + " victorias");
        System.out.println("Jugador2: " + victoriasJ2 + " victorias");
    }
}