package RPG;

import java.util.Random;

public class caballero extends personajes {

    public caballero(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        return (int)(Math.random() * (20 - 10 + 1)) + 10;
    }
}
