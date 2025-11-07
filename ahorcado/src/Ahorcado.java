import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Array con (por ejemplo) 5 palabras posibles
        String[] palabras = {"programacion", "java", "ordenador", "tarea", "ventana"};

        // Elegir una palabra aleatoria
        String palabra = palabras[(int) (Math.random() * palabras.length)].toLowerCase();

        // Estado del juego: array de caracteres para mostrar (guiones bajos para letras no adivinadas)
        char[] palabraoculta = new char[palabra.length()];
        for (int i = 0; i < palabraoculta.length; i++) {
            palabraoculta[i] = '_';
        }

        // Letras intentadas
        Set<Character> intentadas = new HashSet<>();
        // Letras falladas (mostrar al usuario)
        Set<Character> falladas = new HashSet<>();

        // Número máximo de fallos antes de perder
        final int limitefallos = 7;
        int fallos = 0;

        Scanner teclado = new Scanner(System.in);

        // Bucle principal del juego
        while (true) {
            // Estado actual (letras adivinadas o guiones)
            System.out.print("Palabra: ");
            // Leer la posición de cada caracter de la palabra
            for (int i = 0; i < palabraoculta.length; i++) {
                // 'letra' contiene el caracter que mostramos en cada posicion
                char letra = palabraoculta[i];
                System.out.print(letra + " ");
            }
            System.out.println();

            // Mostrar letras falladas, número de intentos restantes y letras usadas
            System.out.println("Letras falladas: " + falladas);
            System.out.println("Fallos: " + fallos + " / " + limitefallos);
            System.out.println("Letras usadas: " + intentadas);

            // Comprobar si el jugador ha ganado
            boolean completo = true;
            // Recorremos el array con un for clásico para detectar si queda algún guion
            for (int i = 0; i < palabraoculta.length; i++) {
                if (palabraoculta[i] == '_') {
                    completo = false;
                    break;
                }
            }
            if (completo) {
                System.out.println("Has adivinado la palabra: " + palabra);
                break;
            }

            // Comprobar si ha perdido
            if (fallos >= limitefallos) {
                System.out.println("Has perdido. La palabra era: " + palabra);
                break;
            }

            // Pedir letra al usuario
            System.out.print("Introduce una letra: ");
            String linea = teclado.nextLine();
            if (linea.isEmpty()) {
                System.out.println("No has introducido ninguna letra. Intenta de nuevo.");
                continue;
            }

            char letraUsada = linea.charAt(0);
            // Validar que es una letra (a-z)
            if (letraUsada < 'a' || letraUsada > 'z') {
                System.out.println("Introduce una letra válida (a-z).\n");
                continue;
            }

            // Comprobar si ya se intentó esa letra
            if (intentadas.contains(letraUsada)) {
                System.out.println("Ya has intentado la letra '" + letraUsada + "'. Elige otra.");
                continue;
            }

            // Marcar la letra como intentada
            intentadas.add(letraUsada);

            // Comprobar si la letra está en la palabra y actualizar el estado
            boolean acierto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letraUsada) {
                    palabraoculta[i] = letraUsada; // Revelar la letra en todas sus posiciones
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("¡Bien! La letra '" + letraUsada + "' está en la palabra.\n");
            } else {
                System.out.println("La letra '" + letraUsada + "' NO está en la palabra.\n");
                fallos++;            // Aumentar contador de fallos
                falladas.add(letraUsada); // Añadir a la lista de falladas para mostrar
            }
        }

    }
}
