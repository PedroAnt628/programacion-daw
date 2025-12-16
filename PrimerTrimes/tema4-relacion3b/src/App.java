public class App {
    public static void main(String[] args) throws Exception {
        Marca marca1 = new Marca("M001", "Toyota");

        Modelo modelo1 = new Modelo("Corolla", "MD001", marca1);

        Version version1 = new Version("V001", "Corolla 1.8L", "140HP", "20000", "Gasolina", modelo1);

        CocheNuevo coche1 = new CocheNuevo("C001", "1234ABC", version1);

        Cliente cliente1 = new Cliente("001", "Juan Perez", "Martinez", "456456567", "Avenida");

        Vendedor vendedor1 = new Vendedor("V001", "Ana Gomez", "Lopez", "789789890", "Calle");

        ClienteVendedorCochenuevo venta1 = new ClienteVendedorCochenuevo(cliente1, vendedor1, coche1, "2024-06-15");

        System.out.println(venta1);
        

    }
}
