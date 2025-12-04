import java.util.Scanner;

public class Partida {
    private Baraja baraja;
    private Jugador jugador;
    private Jugador crupier;

    
    public Partida(String nombreJugador) {
        baraja = new Baraja();
        jugador = new Jugador(nombreJugador, 100);
        crupier = new Jugador("Crupier", 0);
    }

    public void jugar() {
        Scanner teclado = new Scanner(System.in);

        while (jugador.getFondos() > 0) {
            System.out.println("\nTienes " + jugador.getFondos() + " euros de fondos");
            System.out.print("Introduce tu apuesta: ");
            int apuesta = teclado.nextInt();

            if (apuesta > jugador.getFondos()) {
                System.out.println("No tienes suficiente dinero");
                continue;
            }

            jugador.limpiarMano();
            crupier.limpiarMano();
            baraja = new Baraja(); 

            jugador.recibirCarta(baraja.repartirCarta());
            jugador.recibirCarta(baraja.repartirCarta());
            crupier.recibirCarta(baraja.repartirCarta());
            crupier.recibirCarta(baraja.repartirCarta());

            System.out.println("Tu mano: " + jugador.mostrarMano() + " (puntos: " + jugador.calcularPuntos() + ")");
            System.out.println("Crupier muestra: " + crupier.mostrarMano().split(",")[0]);

            while (jugador.calcularPuntos() < 21) {
                System.out.print("Quieres otra carta? (s/n): ");
                String opcion = teclado.next();
                if (opcion.equalsIgnoreCase("s")) {
                    jugador.recibirCarta(baraja.repartirCarta());
                    System.out.println("Tu mano: " + jugador.mostrarMano() + " (puntos: " + jugador.calcularPuntos() + ")");
                } else {
                    break;
                }
            }

            while (crupier.calcularPuntos() < 17) {
                crupier.recibirCarta(baraja.repartirCarta());
            }

            System.out.println("Crupier tiene: " + crupier.mostrarMano() + " (puntos: " + crupier.calcularPuntos() + ")");

            // Decidir ganador
            int puntosJugador = jugador.calcularPuntos();
            int puntosCrupier = crupier.calcularPuntos();

            if (puntosJugador > 21) {
                System.out.println("Te has pasado de 21. Pierdes");
                jugador.setFondos(jugador.getFondos() - apuesta);
            } else if (puntosCrupier > 21 || puntosJugador > puntosCrupier) {
                System.out.println("Has ganado");
                jugador.setFondos(jugador.getFondos() + apuesta);
                jugador.sumarVictoria();
            } else if (puntosJugador == puntosCrupier) {
                System.out.println("Empate. Se devuelve la apuesta");
            } else {
                System.out.println("El crupier gana");
                jugador.setFondos(jugador.getFondos() - apuesta);
            }
        }

        System.out.println("\nTe has quedado sin dinero. Fin del juego");
        System.out.println("Victorias totales: " + jugador.getVictorias());
    }
    public static void main(String[] args) {
        Partida partida = new Partida("Pedro");
        partida.jugar();
    }
}
