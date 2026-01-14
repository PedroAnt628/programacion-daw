package Animales;

public class caballo extends mamifero {
    protected String comida;
    protected int ejercicio;

    public caballo() {
    }
    public caballo(String nombre, int edad, String alimentacion, int gestacion, String comida, int ejercicio) {
        super(nombre, edad, alimentacion, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }
    public String getComida() {
        return comida;
    }
    public void setComida(String comida) {
        this.comida = comida;
    }
    public int getEjercicio() {
        return ejercicio;
    }
    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }

    @Override
    public String toString() {
        return "caballo [nombre=" + nombre + ", comida=" + comida + ", ejercicio=" + ejercicio + ", gestacion="
                + gestacion + ", edad=" + edad + ", alimentacion=" + alimentacion + "]";
    }

}
