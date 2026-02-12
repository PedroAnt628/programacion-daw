package Vista;

import Modelo.Proveedor;
import java.util.Scanner;

public class ProveedorVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ Proveedor ---");
        System.out.println("1. Listar proveedores");
        System.out.println("2. Insertar proveedor");
        System.out.println("3. Actualizar proveedor");
        System.out.println("4. Eliminar proveedor");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Proveedor pedirNuevoProveedor() {
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();

        System.out.print("Dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Provincia: ");
        String provincia = sc.nextLine();

        return new Proveedor(codigo, ciudad, direccion, provincia);
    }

    public int pedirIdActualizar() {
        System.out.print("Código del proveedor a actualizar: ");
        return sc.nextInt();
    }

    public String pedirNuevaCiudad() {
        sc.nextLine();
        System.out.print("Nueva ciudad: ");
        return sc.nextLine();
    }

    public String pedirNuevaDireccion() {
        System.out.print("Nueva dirección: ");
        return sc.nextLine();
    }

    public String pedirNuevaProvincia() {
        System.out.print("Nueva provincia: ");
        return sc.nextLine();
    }

    public int pedirIdEliminar() {
        System.out.print("Código del proveedor a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
