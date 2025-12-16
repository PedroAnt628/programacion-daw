public class App {
    public static void main(String[] args) throws Exception {

        Fabrica fabrica1 = new Fabrica("30-12345678-9", 150, "Juan Perez", "FabricaTech", "España");

        Producto producto1 = new Producto("001", "Rojo", "Smartphone de alta gama", "500", fabrica1);

        Sucursal sucursal1 = new Sucursal("S001", "Madrid", "Avenida");

        Cliente cliente1 = new Cliente("45645632U", "Malaga", 456, "05/10/1990", "Carlos Lopez");

        SucursalProducto sucursalProducto1 = new SucursalProducto(sucursal1, producto1, "600");

        Compra compra1 = new Compra(cliente1, sucursal1, "10%");

        System.out.println(fabrica1);
        System.out.println(producto1);
        System.out.println(sucursal1);
        System.out.println(cliente1);
        System.out.println(sucursalProducto1);
        System.out.println(compra1);
    }
}
