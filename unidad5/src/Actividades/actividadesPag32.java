package Actividades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class actividadesPag32 {
    public static void main(String[] args) {

        List<String> marcas = new ArrayList<>();
        marcas.add("Citroën");
        marcas.add("Seat");
        marcas.add("BMW");
        marcas.add("Citroën");
        marcas.add("BMW");
        marcas.add("Seat");

        Map<String, Integer> contador = new HashMap<>();

        for (String marca : marcas) {

            if (contador.containsKey(marca)) {
                int valorActual = contador.get(marca);
                contador.put(marca, valorActual + 1);
            } else {
                contador.put(marca, 1);
            }
        }

        // Mostrar resultados
        for (String marca : contador.keySet()) {
            System.out.println(marca + " -> " + contador.get(marca));
        }
    }
}