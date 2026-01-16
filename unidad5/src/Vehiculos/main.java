package Vehiculos;

import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {

        coche co1 = new coche("1234ABC");
        moto m1 = new moto("5678DEF");
        camion ca1 = new camion("9101GHI");

        ArrayList<vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(co1);
        listaVehiculos.add(m1);
        listaVehiculos.add(ca1);

        for (vehiculo v : listaVehiculos) {
            v.mostrarinfo();
        }
        
    }
}
