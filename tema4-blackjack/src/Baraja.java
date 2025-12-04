import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baraja() {
        String[] valores = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] palos = {"Corazones","Diamantes","Treboles","Picas"};

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < palos.length; j++) {
                cartas.add(new Carta(valores[i], palos[j]));
            }
        }

        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        return cartas.remove(0);
    }

}
