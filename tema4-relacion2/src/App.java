public class App {
    public static void main(String[] args) {
        Racional racional1 = new Racional(1, 2);
        Racional racional2 = new Racional(2, 4);

        System.out.print("Racional1 = ");
        racional1.imprimirRacional();
        System.out.print("Racional2 = ");
        racional2.imprimirRacional();

        Racional suma = racional1.suma(racional2);
        System.out.print("Suma: ");
        suma.imprimirRacional();

        Racional resta = racional1.resta(racional2);
        System.out.print("Resta: ");
        resta.imprimirRacional();

        Racional producto = racional1.producto(racional2);
        System.out.print("Producto: ");
        producto.imprimirRacional();

        Racional division = racional1.division(racional2);
        System.out.print("Division: ");
        division.imprimirRacional();

        System.out.println("Los racionales son iguales? " + racional1.esIgual(racional2));
    }

}
