// Crea las clases en JAVA con sus correspondientes
// constructores y funciones necesarias para mostrar información y
// modificar los atributos del siguiente diagrama E-R
public class Actividad {
    public static void main(String[] args) throws Exception {
        Sucursal sucursal1 = new Sucursal(1, "Avenida", 453643637, "Albox", "Almeria");
        Sucursal sucursal2 = new Sucursal(2, "Calle", 547457473, "Huercal", "Almeria");

        Revista revista1 = new Revista(1234, "Mensual", "National Geographic", "Ciencia");
        Revista revista2 = new Revista(5678, "Semanal", "Hola", "Famosos");

        Publica publica1 = new Publica(sucursal1, revista1);
        Publica publica2 = new Publica(sucursal2, revista2);

        System.out.println(publica1);
        System.out.println(publica2);
    }
}
