package ejercicio6;

public abstract class animales {
    protected String nombre;
    protected String tipo;
    protected String habitat;
    protected String alimentacion;


    public animales(String nombre, String tipo, String habitat, String alimentacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "animales [nombre=" + nombre + ", tipo=" + tipo + ", habitat=" + habitat + ", alimentacion="
                + alimentacion + "]";
    } 

    

}
