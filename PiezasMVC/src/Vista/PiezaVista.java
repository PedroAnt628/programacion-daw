package Vista;

import Modelo.Pieza;
import java.util.Scanner;

public class PiezaVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ Pieza ---");
        System.out.println("1. Listar piezas");
        System.out.println("2. Insertar pieza");
        System.out.println("3. Actualizar pieza");
        System.out.println("4. Eliminar pieza");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Pieza pedirNuevaPieza() {
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Color: ");
        String color = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        System.out.print("Código categoría: ");
        int codigoCategoria = sc.nextInt();

        return new Pieza(codigo, nombre, color, precio, codigoCategoria);
    }

    public int pedirIdActualizar() {
        System.out.print("Código de la pieza a actualizar: ");
        return sc.nextInt();
    }

    public String pedirNuevoNombre() {
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        return sc.nextLine();
    }

    public String pedirNuevoColor() {
        System.out.print("Nuevo color: ");
        return sc.nextLine();
    }

    public double pedirNuevoPrecio() {
        System.out.print("Nuevo precio: ");
        return sc.nextDouble();
    }

    public int pedirNuevaCategoria() {
        System.out.print("Nuevo código de categoría: ");
        return sc.nextInt();
    }

    public int pedirIdEliminar() {
        System.out.print("Código de la pieza a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
