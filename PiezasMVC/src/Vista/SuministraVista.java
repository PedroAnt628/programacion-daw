package Vista;

import Modelo.Suministra;
import java.sql.Date;
import java.util.Scanner;

public class SuministraVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ Suministra ---");
        System.out.println("1. Listar suministros");
        System.out.println("2. Insertar suministro");
        System.out.println("3. Actualizar suministro");
        System.out.println("4. Eliminar suministro");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Suministra pedirNuevoSuministro() {
        System.out.print("Código proveedor: ");
        int codProv = sc.nextInt();

        System.out.print("Código pieza: ");
        int codPieza = sc.nextInt();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Fecha (YYYY-MM-DD): ");
        String fechaStr = sc.next();
        Date fecha = Date.valueOf(fechaStr);

        return new Suministra(codProv, codPieza, cantidad, fecha);
    }

    public int pedirCodProveedor() {
        System.out.print("Código proveedor: ");
        return sc.nextInt();
    }

    public int pedirCodPieza() {
        System.out.print("Código pieza: ");
        return sc.nextInt();
    }

    public int pedirNuevaCantidad() {
        System.out.print("Nueva cantidad: ");
        return sc.nextInt();
    }

    public Date pedirNuevaFecha() {
        System.out.print("Nueva fecha (YYYY-MM-DD): ");
        return Date.valueOf(sc.next());
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
