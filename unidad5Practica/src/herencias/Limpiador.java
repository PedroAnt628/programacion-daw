package herencias;

public class Limpiador extends Empleado implements Turno {

    private double metros;

    public Limpiador(String nombre, int edad, double salarioBase, double metros) {
        super(nombre, edad, salarioBase);
        this.metros = metros;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (metros * 0.5);
    }

    @Override
    public String turnoTrabajo() {
        return "Noche";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Metros que limpia: " + metros);
    }
}
