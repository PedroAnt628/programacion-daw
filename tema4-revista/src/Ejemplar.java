public class Ejemplar {
    private int numeroPaginas;
    private String fechaPublicacion;
    private int numeroEjemplares;
    private Revista revista;

    public Ejemplar() {
    }
    public Ejemplar(int numeroPaginas, String fechaPublicacion, int numeroEjemplares) {
        this.numeroPaginas = numeroPaginas;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroEjemplares = numeroEjemplares;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }
    @Override
    public String toString() {
        if (revista != null) {
            return "Ejemplar [numeroPaginas=" + numeroPaginas + ", fechaPublicacion=" + fechaPublicacion
                    + ", numeroEjemplares=" + numeroEjemplares + ", revista=" + revista.toString() + "]";
        } else {
            return "Ejemplar [numeroPaginas=" + numeroPaginas + ", fechaPublicacion=" + fechaPublicacion
                    + ", numeroEjemplares=" + numeroEjemplares + "]";
        }
    }
}
