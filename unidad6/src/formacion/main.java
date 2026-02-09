package formacion;

public class main {

    public static void main(String[] args) {

        System.out.println("\n=== CURSOS ===");
        curso.insertar(1, "Java Básico", "Introducción a Java", 40, 200);
        curso.insertar(2, "SQL Avanzado", "Consultas complejas", 30, 180);
        curso.listar();


        System.out.println("\n=== EMPLEADOS ===");
        empleado.insertar(1, "Juan", "Pérez", "López", "600111222", "Calle A", "capacitado");
        empleado.insertar(2, "Ana", "Gómez", "Ruiz", "600333444", "Calle B", "no_capacitado");
        empleado.listar();


        //System.out.println("\n=== ESPECIALIZACIÓN ===");
        empleado_capacitado.insertar(1);
        empleado_no_capacitado.insertar(2);
        // Estas tablas no tienen listar porque solo guardan la PK


        System.out.println("\n=== EDICIONES ===");
        edicion.insertar(1, "2024-01-10", "2024-02-10", "Mañanas", "Aula 1", 1, 1);
        edicion.insertar(2, "2024-03-01", "2024-04-01", "Tardes", "Aula 2", 1, 1);
        edicion.listar();


        System.out.println("\n=== RECIBE (N:N) ===");
        recibe.insertar(1, 1);
        recibe.insertar(2, 2);
        recibe.listar();


        System.out.println("\n=== PRERREQUISITOS (N:N con atributo) ===");
        prerrequisito.insertar(2, 1, true);
        prerrequisito.insertar(1, 2, false);
        prerrequisito.listar();


        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
