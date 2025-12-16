
public class App {
    public static void main(String[] args) throws Exception {
        //Crear categoria
        categoria cat1 = new categoria(1, "Electronica");
        System.out.println(cat1.toString());

        //Crear proveedor
        proveedor prov1 = new proveedor(1, "Proveedor1", "Calle 123", "555-1234");
        System.out.println(prov1.toString());

        //Crear pieza
        pieza pie1 = new pieza(1, "Resistencia", 0.10, "Azul", cat1);
        System.out.println(pie1.toString());

        //Relacion de suministro
        proveedor_suminsitra_pieza suministro1 = new proveedor_suminsitra_pieza(pie1, prov1, 1000, "2024-06-01");
        System.out.println(suministro1.toString());
    }  
}

