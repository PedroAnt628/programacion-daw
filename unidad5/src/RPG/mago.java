package RPG;

import java.util.Random;

public class mago extends personajes {

    public mago(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        return (int)(Math.random() * (20 - 10 + 1)) + 10;
    }
}
