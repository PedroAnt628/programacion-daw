package ejercicio6;

public class invertebrados extends animales{
    private int patas;
    private String color;

    public invertebrados(String nombre, String tipo, String habitat, String alimentacion, int patas,
            String color) {
        super(nombre, tipo, habitat, alimentacion);
        this.patas = patas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "invertebrados [nombre=" + nombre + ", patas=" + patas + ", tipo=" + tipo + ", color=" + color
                + ", habitat=" + habitat + ", alimentacion=" + alimentacion + "]";
    }

    
}
