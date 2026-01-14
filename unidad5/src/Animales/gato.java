package Animales;

public class gato extends mamifero {
    protected String pedigri;

    public gato() {
    }
    public gato(String nombre, int edad, String alimentacion, int gestacion, String pedigri) {
        super(nombre, edad, alimentacion, gestacion);
        this.pedigri = pedigri;
    }
    public String getPedigri() {
        return pedigri;
    }
    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    @Override
    public String toString() {
        return "gato [nombre=" + nombre + ", pedigri=" + pedigri + ", gestacion=" + gestacion + ", edad=" + edad
                + ", alimentacion=" + alimentacion + "]";
    }

}
