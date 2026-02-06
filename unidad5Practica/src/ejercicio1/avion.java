package ejercicio1;

public class avion extends vehiculos implements volador{
    private int litrosHora;
    private int horasVuelo;

    public avion(int horasVuelo, int litrosHora, String matricula) {
        super(matricula);
        this.horasVuelo = horasVuelo;
        this.litrosHora = litrosHora;
    }


    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }

    @Override
    public double calcularConsumo() {
        return litrosHora * horasVuelo;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Litros por hora: " + litrosHora);
        System.out.println("Horas de vuelo: " + horasVuelo);
    }
    
}
