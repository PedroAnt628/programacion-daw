import clases.editorial;
import clases.libro;

public class actividad3clase {
    
    public static void main(String[] args) {
        //Crear objetos
        libro libro1 = new libro("El Quijote", 1605, 29.99, "978-3-16-148410-0");
        editorial editorial1 = new editorial(1, "Editorial", 1990);
        //Imprimir datos
        libro1.imprimeLibro();
        editorial1.ImprimeEditorial();
        libro1.setEditorial(editorial1);
        System.out.println();
        editorial1.setAnyo(2025);
        libro1.imprimeLibro();

    }
}
