package RPG;

import java.util.Random;

public class orco extends personajes {

    public orco(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        return (int)(Math.random() * (20 - 10 + 1)) + 10;
    }
}
