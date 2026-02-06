package ejercicio1;

public class helicoptero extends vehiculos implements volador{
    private int litrosMin;
    private int minVuelo;

    public helicoptero(int minVuelo, int litrosMin, String matricula) {
        super(matricula);
        this.minVuelo = minVuelo;
        this.litrosMin = litrosMin;
    }


    @Override
    public void volar() {
        System.out.println("El helicóptero está volando.");
    }

    @Override
    public double calcularConsumo() {
        return litrosMin * minVuelo;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Litros por minuto: " + litrosMin);
        System.out.println("Minutos de vuelo: " + minVuelo);
    }

    

}