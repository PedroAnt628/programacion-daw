package RPG;

import java.util.ArrayList;
import java.util.Random;

public class Batalla {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<personajes> equipo1 = new ArrayList<>();
        ArrayList<personajes> equipo2 = new ArrayList<>();

        equipo1.add(new caballero("Caballero1", 100));
        equipo1.add(new mago("Mago1", 80));
        equipo1.add(new mago("Mago2", 120));

        equipo2.add(new orco("Orco1", 100));
        equipo2.add(new orco("Orco2", 80));
        equipo2.add(new orco("Orco3", 120));
        int turno = 1;
        while (!equipo1.isEmpty() && !equipo2.isEmpty()) {
            System.out.println("Turno " + turno + ":");

            if (!equipo1.isEmpty() && !equipo2.isEmpty()) {
                personajes atacante = equipo1.get(rand.nextInt(equipo1.size()));
                personajes defensor = equipo2.get(rand.nextInt(equipo2.size()));

                int daño = atacante.atacar();
                System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " con " + daño + " de daño.");
                defensor.recibirDaño(daño);

                if (!defensor.estaVivo()) {
                    System.out.println(defensor.getNombre() + " ha muerto.");
                    equipo2.remove(defensor);
                }
            }

            if (!equipo1.isEmpty() && !equipo2.isEmpty()) {
                personajes atacante = equipo2.get(rand.nextInt(equipo2.size()));
                personajes defensor = equipo1.get(rand.nextInt(equipo1.size()));

                int daño = atacante.atacar();
                System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " con " + daño + " de daño.");
                defensor.recibirDaño(daño);

                if (!defensor.estaVivo()) {
                    System.out.println(defensor.getNombre() + " ha muerto.");
                    equipo1.remove(defensor);
                }
            }

            turno++;
        }

        if (equipo1.isEmpty() && equipo2.isEmpty()) {
            System.out.println("Empate!");
        } else if (equipo1.isEmpty()) {
            System.out.println("Equipo 2 gana!");
        } else {
            System.out.println("Equipo 1 gana!");
        }
    }
}