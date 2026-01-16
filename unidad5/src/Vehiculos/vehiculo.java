package Vehiculos;


public abstract class vehiculo {
    protected String matricula;

    public vehiculo(String matricula) {
        this.matricula = matricula;
    }

    abstract int velocidadMaxima();
    
    public void mostrarinfo(){
        System.out.println("Matrícula: " + matricula + "  Velocidad Máxima: " + velocidadMaxima() + " km/h");
    }
}
