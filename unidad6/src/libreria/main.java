package libreria;

public class main {

    public static void main(String[] args) {

        System.out.println("\n=== PROVINCIAS ===");
        provincia.insertar(1, "Sevilla");
        provincia.insertar(2, "Cádiz");
        provincia.listar();

        System.out.println("\n=== LOCALIDADES ===");
        localidad.insertar(1, "Dos Hermanas", 1);
        localidad.insertar(2, "Jerez", 2);
        localidad.listar();

        System.out.println("\n=== CLIENTES ===");
        cliente.insertar(1, "García", "López", "María", "C/ Real 12", "maria@gmail.com", "600111222", 1);
        cliente.insertar(2, "Pérez", "Ruiz", "Juan", "Av. Centro 5", "juan@gmail.com", "600333444", 2);
        cliente.listar();

        System.out.println("\n=== AUTORES ===");
        autor.insertar(1, "Martín", "Santos", "Laura", "http://lauramartin.com", "600555666", "C/ Sol 3", 1);
        autor.insertar(2, "Torres", "Gómez", "Carlos", "http://carlostorres.com", "600777888", "C/ Luna 8", 2);
        autor.listar();

        System.out.println("\n=== EDITORIALES ===");
        editorial.insertar(1, "Planeta", "C/ Industria 10", "954111222", "http://planeta.com", 1);
        editorial.insertar(2, "Anaya", "C/ Comercio 20", "954333444", "http://anaya.com", 2);
        editorial.listar();

        System.out.println("\n=== ALMACENES ===");
        almacen.insertar(1, "955111222", "Polígono Sur 12", 1);
        almacen.insertar(2, "955333444", "Polígono Norte 8", 2);
        almacen.listar();

        System.out.println("\n=== CESTAS ===");
        cesta.insertar(1, "2024-01-10", 1);
        cesta.insertar(2, "2024-02-15", 2);
        cesta.listar();

        System.out.println("\n=== LIBROS ===");
        libro.insertar(1, "ISBN001", "El Viaje", 2020, "Novela de aventuras", "papel");
        libro.insertar(2, "ISBN002", "La Ciudad", 2022, "Drama urbano", "ebook");
        libro.listar();

        System.out.println("\n=== PAPEL ===");
        papel.insertar(1, "2020-05-10", "Madrid", 19.99);
        papel.listar();

        System.out.println("\n=== EBOOK ===");
        ebook.insertar(2, 15, 9.99);
        ebook.listar();

        System.out.println("\n=== CESTA CONTIENE LIBRO ===");
        cesta_contiene_libro.insertar(1, 1);
        cesta_contiene_libro.insertar(2, 2);
        cesta_contiene_libro.listar();

        System.out.println("\n=== AUTOR ESCRIBE LIBRO ===");
        autor_escribe_libro.insertar(1, 1);
        autor_escribe_libro.insertar(2, 2);
        autor_escribe_libro.listar();

        System.out.println("\n=== EDITORIAL PUBLICA LIBRO ===");
        editorial_publica_libro.insertar(1, 1);
        editorial_publica_libro.insertar(2, 2);
        editorial_publica_libro.listar();

        System.out.println("\n=== ALMACEN ALMACENA LIBRO ===");
        almacen_almacena_libro.insertar(1, 1);
        almacen_almacena_libro.insertar(2, 2);
        almacen_almacena_libro.listar();

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
