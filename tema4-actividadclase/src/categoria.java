public class categoria {
    private int codigo;
    private String nombre;

    public categoria(){

    }
    public categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        if (nombre != null)
        return "categoria [codigo=" + codigo + ", nombre=" + nombre + "]";
        else return "No hay datos";
    }
}
