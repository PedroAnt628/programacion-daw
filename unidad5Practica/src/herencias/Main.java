package herencias;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos un ArrayList de tipo Empleado.
        // Gracias al polimorfismo, aquí podremos guardar Cualquier subclase:
        // Cuidador, Veterinario, Limpiador...
        ArrayList<Empleado> lista = new ArrayList<>();

        // Añadimos objetos de distintas clases hijas.
        // Aunque los guardamos como "Empleado", cada uno mantiene su comportamiento real.
        lista.add(new Cuidador("Ana", 28, 1200, 12));
        lista.add(new Veterinario("Luis", 40, 1500, "Felinos"));
        lista.add(new Limpiador("Carlos", 35, 1100, 300));
        lista.add(new Cuidador("Marta", 30, 1200, 20));
        lista.add(new Veterinario("Pedro", 45, 1500, "Aves"));

        // Variables para estadísticas
        double salarioTotal = 0;

        // Guardamos el primer empleado como referencia para comparar salarios
        Empleado mejorPagado = lista.get(0);

        // Contadores por tipo
        int contCuidadores = 0;
        int contVets = 0;
        int contLimpiadores = 0;

        // Recorremos la lista usando polimorfismo
        for (Empleado e : lista) {
            System.out.println("---------------------------");

            // Llamamos al método mostrarInfo()
            // Cada clase hija puede añadir información extra
            e.mostrarInfo();

            // Llamamos al método calcularSalario()
            // Cada clase tiene su propia versión (polimorfismo)
            System.out.println("Salario final: " + e.calcularSalario());

            // instanceof sirve para saber si el objeto implementa la interfaz Turno
            if (e instanceof Turno) {
                // Hacemos un casting para poder llamar al método turnoTrabajo()
                Turno t = (Turno) e;
                System.out.println("Turno: " + t.turnoTrabajo());
            }

            // Acumulamos el salario total
            salarioTotal += e.calcularSalario();

            // Comprobamos si este empleado cobra más que el actual mejor pagado
            if (e.calcularSalario() > mejorPagado.calcularSalario()) {
                mejorPagado = e;
            }

            // Contamos cuántos hay de cada tipo usando instanceof
            if (e instanceof Cuidador) contCuidadores++;
            if (e instanceof Veterinario) contVets++;
            if (e instanceof Limpiador) contLimpiadores++;
        }

        // Mostramos estadísticas finales
        System.out.println("\n===== ESTADÍSTICAS =====");
        System.out.println("Cuidadores: " + contCuidadores);
        System.out.println("Veterinarios: " + contVets);
        System.out.println("Limpiadores: " + contLimpiadores);
        System.out.println("Salario total del zoológico: " + salarioTotal);
        System.out.println("Empleado mejor pagado: " + mejorPagado.nombre +
                           " con " + mejorPagado.calcularSalario());
    }
}


