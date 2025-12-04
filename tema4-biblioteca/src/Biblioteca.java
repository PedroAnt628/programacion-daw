import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(){this.libros=new ArrayList<>();}
    public Biblioteca(String nombre){
        this.nombre=nombre;
        this.libros=new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        if(libros!=null)
            return "Biblioteca [nombre=" + nombre + ", libros=" + libros + "]";
        else return "No hay libros en la biblioteca "+nombre;
    }


    public void agregarLibro(Libro libro){
        if(this.libros!=null)
            if(!libros.contains(libro))
                this.libros.add(libro);
        else
            this.libros.add(libro);
    }
    public Libro buscarLibro(Libro libro){

        int posicion=libros.indexOf(libro);
        if (posicion==-1)
            return null;
        else{
            return libros.get(posicion);
        }
    }
    public void eliminaLibro(Libro libro){
        int posicion=libros.indexOf(libro);
        if(posicion!=-1)
            libros.remove(posicion);
    }

    public ArrayList<Libro> buscarPorAutor(String autor){
        ArrayList<Libro> salida = new ArrayList();
       
        for(int i=0;i<libros.size();i++){
            if(autor.equals(libros.get(i).getAutor().getNombre()))
                salida.add(libros.get(i));
        }
        return salida;
    }
}