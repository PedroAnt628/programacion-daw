public class Seccion {
    private String titulo;
    private String extension;
    private Revista revista;

    public Seccion() {
    }
    public Seccion(String titulo, String extension) {
        this.titulo = titulo;
        this.extension = extension;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    @Override
    public String toString() {  
        if (revista != null) {
            return "Ejemplar [titulo=" + titulo + ", extension=" + extension + ", revista=" + revista.toString() + "]";
        } else {
        return "Ejemplar [titulo=" + titulo + ", extension=" + extension + "]";
        } 
    }
}
