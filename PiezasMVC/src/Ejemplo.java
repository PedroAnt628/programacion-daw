import Controlador.CategoriaController;
import Controlador.PiezaControlador;
import Controlador.ProveedorControlador;
import Controlador.SuministraControlador;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CategoriaController categoriaController = new CategoriaController();
        PiezaControlador piezaController = new PiezaControlador();
        ProveedorControlador proveedorController = new ProveedorControlador();
        SuministraControlador suministraController = new SuministraControlador();

        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Gestionar Categorías");
            System.out.println("2. Gestionar Piezas");
            System.out.println("3. Gestionar Proveedores");
            System.out.println("4. Gestionar Suministros");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    categoriaController.iniciar();
                    break;

                case 2:
                    piezaController.iniciar();
                    break;

                case 3:
                    proveedorController.iniciar();
                    break;

                case 4:
                    suministraController.iniciar();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
