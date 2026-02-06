package ejercicio2;

public class producto {

    protected String nombre;
    protected double precio;

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: " + precio;
    }
}
