package Vehiculos;

public class moto extends vehiculo {
    public moto(String matricula) {
        super(matricula);
    }
    public int velocidadMaxima() {
        return 120;
    }

    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Su velocidad máxima es" + velocidadMaxima() + " km/h");
    }
}
