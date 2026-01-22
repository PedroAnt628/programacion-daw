package ejercicio6;

public class vertebrados extends animales{
    private String movilidad;
    private int velocidad;

    public vertebrados(String nombre, String tipo, String habitat, String alimentacion, String movilidad,
            int velocidad) {
        super(nombre, tipo, habitat, alimentacion);
        this.movilidad = movilidad;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "vertebrados [nombre=" + nombre + ", movilidad=" + movilidad + ", tipo=" + tipo + ", velocidad="
                + velocidad + ", habitat=" + habitat + ", alimentacion=" + alimentacion + "]";
    }

    
    

    

}
