package herencias;

public class Cuidador extends Empleado implements Turno {

    private int nAnimales;

    public Cuidador(String nombre, int edad, double salarioBase, int nAnimales) {
        super(nombre, edad, salarioBase);
        this.nAnimales = nAnimales;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (nAnimales * 20);
    }

    @Override
    public String turnoTrabajo() {
        return "Mañana";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Animales a su cargo: " + nAnimales);
    }
}
