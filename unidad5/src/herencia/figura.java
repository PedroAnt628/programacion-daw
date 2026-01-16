package herencia;

public abstract class figura {

    private String nombre;

    public figura(String nombre) {
        this.nombre = nombre;
    }

    abstract double area();
    abstract double perimetro();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return getNombre() + " | Área: " + area() + " | Perímetro: " + perimetro();
    }
}
