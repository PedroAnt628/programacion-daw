package ejercicio2;

public class perecedero extends producto {

    private int diasCaducidad;

    public perecedero(String nombre, double precio, int diasCaducidad) {
        super(nombre, precio);

        if (diasCaducidad < 0) {
            System.out.println("Advertencia: los días de caducidad no pueden ser negativos. Se establece a 0.");
            diasCaducidad = 0;
        }

        this.diasCaducidad = diasCaducidad;
    }

    @Override
    public String toString() {
        return "Perecedero: " + nombre + " | Precio: " + precio +
               " | Días para caducar: " + diasCaducidad;
    }
}

