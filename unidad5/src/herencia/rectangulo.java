package herencia;

public class rectangulo extends figura {
    protected double ancho;
    protected double alto;

    public rectangulo(String nombre, double ancho, double alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double area() {
        return ancho * alto;
    }

    @Override
    double perimetro() {
        return 2 * (ancho + alto);
    }
}