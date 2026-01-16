package Vehiculos;

public class camion extends vehiculo {
    public camion(String matricula) {
        super(matricula);
    }
    public int velocidadMaxima() {
        return 100;
    }

    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Su velocidad máxima es" + velocidadMaxima() + " km/h");
    }
}
