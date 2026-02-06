package herencias;

public class Veterinario extends Empleado implements Turno {

    private String especialidad;

    public Veterinario(String nombre, int edad, double salarioBase, String especialidad) {
        super(nombre, edad, salarioBase);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 300;
    }

    @Override
    public String turnoTrabajo() {
        return "Tarde";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
    }
}

