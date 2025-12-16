public class Revista {
    private int numeroRegistro;
    private String periocidad;
    private String titulo;
    private String tipo;

    public Revista() {
    }
    public Revista(int numeroRegistro, String periocidad, String titulo, String tipo) {
        this.numeroRegistro = numeroRegistro;
        this.periocidad = periocidad;
        this.titulo = titulo;
        this.tipo = tipo;
    }


    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public String getPeriocidad() {
        return periocidad;
    }
    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Revista [numeroRegistro=" + numeroRegistro + ", periocidad=" + periocidad + ", titulo=" + titulo
                + ", tipo=" + tipo + "]";
    }
    

}
