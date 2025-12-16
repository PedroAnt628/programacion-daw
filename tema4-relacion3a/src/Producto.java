public class Producto {
    private String codigo;
    private String color;
    private String descripcion;
    private String costo;
    private Fabrica fabrica;

    public Producto(String codigo, String color, String descripcion, String costo, Fabrica fabrica) {
        this.codigo = codigo;
        this.color = color;
        this.descripcion = descripcion;
        this.costo = costo;
        this.fabrica = fabrica;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCosto() {
        return costo;
    }
    public void setCosto(String costo) {
        this.costo = costo;
    }
    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }
    

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + 
               "color=" + color + 
               "descripcion=" + descripcion + 
               "costo=" + costo + 
               "fabrica" + fabrica + 
               "]";
    }

    

    
}
