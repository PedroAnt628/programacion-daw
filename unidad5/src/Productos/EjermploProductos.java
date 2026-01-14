package Productos;

public class EjermploProductos {
    public static void main(String[] args) {
        productoFisico fisico1 = new productoFisico("PF001", "Libro de Java", 29.99, 3.5, 10.0);
        productoDigital digital1 = new productoDigital("PD001", "Album de Música", 9.99, "http://descarga.musica.com/album", "100MB");

        System.out.println(fisico1.toString());
        System.out.println(digital1.toString());
    }
}
