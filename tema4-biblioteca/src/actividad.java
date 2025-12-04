public class actividad {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca=new Biblioteca("IES Carcenal Cisneros");
        Libro libro1=new Libro("El hobbit","Fantasia",10);
        Libro libro2=new Libro("El senor de los anillos","Fantasia",5);
        Autor autor=new Autor("FJ Marber");
        libro1.setAutor(autor);
        biblioteca.agregarLibro(libro1);
        Libro salida=biblioteca.buscarLibro(libro1);
        if(salida!=null)
            System.out.println(salida);
        else{
            System.out.println("No esta el libro");
        }
        
    }
}
