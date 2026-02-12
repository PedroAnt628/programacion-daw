package Vista;

import Modelo.Categoria;
import java.util.Scanner;

public class CategoriaVista {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ Categoria ---");
        System.out.println("1. Listar categorias");
        System.out.println("2. Insertar categoria");
        System.out.println("3. Actualizar categoria");
        System.out.println("4. Eliminar categoria");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Categoria pedirNuevaCategoria() {
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        return new Categoria(codigo, nombre);
    }

    public int pedirIdActualizar() {
        System.out.print("Código a actualizar: ");
        return sc.nextInt();
    }

    public String pedirNuevoNombre() {
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        return sc.nextLine();
    }

    public int pedirIdEliminar() {
        System.out.print("Código a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
