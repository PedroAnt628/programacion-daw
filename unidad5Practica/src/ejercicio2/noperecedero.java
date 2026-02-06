package ejercicio2;

public class noperecedero extends producto {

    private String tipo;

    public noperecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "No Perecedero: " + nombre + " | Precio: " + precio +
               " | Tipo: " + tipo;
    }
}
