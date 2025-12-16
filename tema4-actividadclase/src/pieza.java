public class pieza {
    private int codigo;
    private String nombre;
    private double precio;
    private String color;
    private categoria categoria;

    public pieza(){

    }
    public pieza(int codigo, String nombre, double precio, String color, categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.categoria = categoria;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getColor() {
        return color;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public categoria getCategoria() {
        return categoria;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        if (categoria != null)
        return "pieza [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", color=" + color
                + ", categoria=" + categoria + "]";
        else return "No hay datos";
    }

}
