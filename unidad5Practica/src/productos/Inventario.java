package productos;

import java.util.*;

public class Inventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<producto> lista = new ArrayList<>();

        System.out.print("¿Cuántos productos quieres introducir? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for(int i = 0; i < n; i++) {
            System.out.println("\nProducto " + (i+1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();

            lista.add(new producto(nombre, precio, stock));
        }

        // Mostrar todos los productos
        System.out.println("\n--- Lista de productos ---");
        for(producto p : lista) {
            System.out.println(p);
        }

        // Producto más caro y más barato
        producto caro = lista.get(0);
        producto barato = lista.get(0);

        for(producto p : lista) {
            if(p.getPrecio() > caro.getPrecio()) caro = p;
            if(p.getPrecio() < barato.getPrecio()) barato = p;

        }

        System.out.println("\nProducto más caro: " + caro);
        System.out.println("Producto más barato: " + barato);

        // Búsqueda por nombre
        System.out.print("\nIntroduce un nombre para buscar: ");
        String buscar = sc.nextLine();

        boolean encontrado = false;
        for(producto p : lista) {
            if(p.getNombre().equalsIgnoreCase(buscar)) {
                System.out.println("Encontrado: " + p);
                encontrado = true;
                break;
            }
        }

        if(!encontrado) {
            System.out.println("No existe ese producto.");
        }

        sc.close();
    }
}
