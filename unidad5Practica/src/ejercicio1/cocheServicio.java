package ejercicio1;

public class cocheServicio extends vehiculos {
    private int km;

    public cocheServicio(int km, String matricula) {
        super(matricula);
        this.km = km;
    }

    @Override
    public double calcularConsumo() {
        return km * 0.12;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Kilometros recorridos: " + km);
    }

    

}
