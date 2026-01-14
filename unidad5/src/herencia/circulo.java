package herencia;

public class circulo extends figura {
    protected double radio;

    public circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    double area() {
        return Math.PI * radio * radio;
    }

    @Override
    double perimetro() {
        return 2 * Math.PI * radio;
    }

}
