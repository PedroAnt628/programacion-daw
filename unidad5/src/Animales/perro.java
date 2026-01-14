package Animales;

public class perro extends mamifero {
    protected String raza;

    public perro() {
    }
    public perro(String nombre, int edad, String alimentacion, int gestacion, String raza) {
        super(nombre, edad, alimentacion, gestacion);
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "perro [nombre=" + nombre + ", raza=" + raza + ", gestacion=" + gestacion + ", edad=" + edad
                + ", alimentacion=" + alimentacion + "]";
    }

}
