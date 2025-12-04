import java.util.Scanner;

public class Partida {
    private Baraja baraja;
    private Jugador jugador;
    private Jugador crupier;

    
    public Partida(String nombreJugador) {
        baraja = new Baraja();
        jugador = new Jugador(nombreJugador);
        crupier = new Jugador("Crupier");
    }

    //La funcion principal para el blackjack
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

            //se reparten las cartas
            jugador.limpiarMano();
            crupier.limpiarMano();
            baraja = new Baraja(); 

            jugador.recibirCarta(baraja.repartirCarta());
            jugador.recibirCarta(baraja.repartirCarta());
            crupier.recibirCarta(baraja.repartirCarta());
            crupier.recibirCarta(baraja.repartirCarta());

            System.out.println("Tu mano: " + jugador.mostrarMano() + " (puntos: " + jugador.calcularPuntos() + ")");
            System.out.println("Crupier muestra: " + crupier.getMano().get(0));

            //Turno del jugador
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

            //Turno del crupier
            while (crupier.calcularPuntos() < 17) {
                crupier.recibirCarta(baraja.repartirCarta());
            }

            System.out.println("Crupier tiene: " + crupier.mostrarMano() + " (puntos: " + crupier.calcularPuntos() + ")");

            // Decidir ganador
            int puntosJugador = jugador.calcularPuntos();
            int puntosCrupier = crupier.calcularPuntos();

            if (puntosJugador > 21) {
                System.out.println("Te has pasado de 21. El crupier gana");
                jugador.setFondos(jugador.getFondos() - apuesta);
            } else if (puntosCrupier > 21 || puntosJugador > puntosCrupier) {
                System.out.println("Has ganado");
                jugador.setFondos(jugador.getFondos() + apuesta);
                jugador.sumarVictoria();
            } else if (puntosJugador == puntosCrupier) {
                System.out.println("Empate. Se devuelve la apuesta");
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
