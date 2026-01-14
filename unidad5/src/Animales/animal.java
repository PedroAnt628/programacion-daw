package Animales;

public class animal {
        protected String nombre;
        protected int edad;
        protected String alimentacion;
    
    public animal() {
    }
    public animal(String nombre, int edad, String alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "animal [nombre=" + nombre + ", edad=" + edad + ", alimentacion=" + alimentacion + "]";
    }


}
