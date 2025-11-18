public class Modulo {
    private int codigo;
    private String nombre;
    public Modulo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " [codigo=" + codigo + ", nombre=" + nombre + "]";
    }

    
}
