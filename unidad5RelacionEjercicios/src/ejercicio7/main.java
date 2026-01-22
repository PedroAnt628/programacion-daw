package ejercicio7;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        coche c1 = new coche("Coche");
        moto m1 = new moto("Moto");
        avion a1 = new avion("Avion");
        helicoptero h1 = new helicoptero("Helicoptero");

        c1.frenar();

        ArrayList<vehiculo> listavehiculo = new ArrayList<>();
        listavehiculo.add(a1);
        listavehiculo.add(c1);
        listavehiculo.add(m1);
        listavehiculo.add(h1);

        for (vehiculo v : listavehiculo) {
            v.arrancar();
            if (v instanceof volador ){
                v.volar();
            }
        }
    }
}
