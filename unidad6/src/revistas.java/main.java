
public class main {

    public static void main(String[] args) {

        System.out.println("\n=== SUCURSALES ===");
        sucursal.insertar(1, "954111222", "Sevilla", "Sevilla", "Av. Centro 10");
        sucursal.insertar(2, "954333444", "Cádiz", "Cádiz", "C/ Mar 5");
        sucursal.listar();

        System.out.println("\n=== EMPLEADOS ===");
        empleado.insertar(1, "12345678A", "Laura", "García", "López", "600111222", 1);
        empleado.insertar(2, "87654321B", "Carlos", "Pérez", "Ruiz", "600333444", 2);
        empleado.listar();

        System.out.println("\n=== REVISTAS ===");
        revista.insertar(1, "Ciencia Hoy", "Ciencia", "Mensual");
        revista.insertar(2, "Historia Viva", "Historia", "Trimestral");
        revista.listar();

        System.out.println("\n=== PERIODISTAS ===");
        periodista.insertar(1, "Ana", "Torres", "Santos", "600555666", "Ciencia");
        periodista.insertar(2, "Luis", "Martín", "Gómez", "600777888", "Historia");
        periodista.listar();

        System.out.println("\n=== SECCIONES ===");
        seccion.insertar(1, "Tecnología", 5, 1);
        seccion.insertar(2, "Arqueología", 4, 2);
        seccion.listar();

        System.out.println("\n=== EJEMPLARES ===");
        ejemplar.insertar(1, "2024-01-10", 50, 1000, 1);
        ejemplar.insertar(2, "2024-02-15", 60, 1200, 2);
        ejemplar.listar();

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
