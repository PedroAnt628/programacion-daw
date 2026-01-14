package Animales;

public class mamifero extends animal {
    protected int gestacion;
    
    public mamifero() {
    }
    public mamifero(String nombre, int edad, String alimentacion, int gestacion) {
        super(nombre, edad, alimentacion);
        this.gestacion = gestacion;
    }

    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }

    @Override
    public String toString() {
        return "mamifero [nombre=" + nombre + ", gestacion=" + gestacion + ", edad=" + edad + ", alimentacion="
                + alimentacion + "]";
    }
    

}
