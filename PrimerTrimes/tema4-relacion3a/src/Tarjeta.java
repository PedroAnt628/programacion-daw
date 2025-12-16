public class Tarjeta {
    private String numero;
    private String nombre;
    private String codigo;
    private String fechVen;
    private Cliente cliente;

    public Tarjeta(String codigo, String fechVen, String nombre, String numero, Cliente cliente) {
        this.codigo = codigo;
        this.fechVen = fechVen;
        this.nombre = nombre;
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechVen() {
        return fechVen;
    }

    public void setFechVen(String fechVen) {
        this.fechVen = fechVen;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 

    @Override
    public String toString() {
        return "Tarjeta [numero=" + numero + 
               "nombre=" + nombre + 
               "codigo=" + codigo + 
               "fechVen=" + fechVen + 
               "cliente=" + cliente + 
               "]";
    }

    
}
