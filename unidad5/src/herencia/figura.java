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


}
