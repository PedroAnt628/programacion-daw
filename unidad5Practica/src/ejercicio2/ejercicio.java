package ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {

        // HashMap con clave String y valor Caja de Producto
        Map<String, caja<? extends producto>> inventario = new HashMap<>();

        // Insertamos productos en cajas
        inventario.put("A1", new caja<>(new producto("Tornillos", 2.5)));
        inventario.put("B2", new caja<>(new perecedero("Leche", 1.2, 5)));
        inventario.put("C3", new caja<>(new noperecedero("Detergente", 3.8, "Limpieza")));
        inventario.put("D4", new caja<>(new perecedero("Yogur", 0.9, 2)));

        // Mostrar inventario usando SOLO las claves
        System.out.println("===== INVENTARIO =====");
        for (String clave : inventario.keySet()) {
            System.out.println(clave + " - " + inventario.get(clave).getContenido());
        }

        // Buscar producto por código
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce un código de producto: ");
        String codigo = sc.nextLine();

        if (inventario.containsKey(codigo)) {
            System.out.println("Producto encontrado:");
            inventario.get(codigo).mostrar();
        } else {
            System.out.println("No existe ningún producto con ese código.");
        }

        sc.close();
    }
}
