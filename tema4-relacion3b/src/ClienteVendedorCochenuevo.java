public class ClienteVendedorCochenuevo {
    private Cliente cliente;
    private Vendedor vendedor;
    private CocheNuevo cocheNuevo;
    private String fecha;

    public ClienteVendedorCochenuevo(Cliente cliente, Vendedor vendedor, CocheNuevo cocheNuevo, String fecha) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.cocheNuevo = cocheNuevo;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public CocheNuevo getCocheNuevo() {
        return cocheNuevo;
    }

    public void setCocheNuevo(CocheNuevo cocheNuevo) {
        this.cocheNuevo = cocheNuevo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    @Override
    public String toString() {  
        return "ClienteVendedorCochenuevo [cliente=" + cliente + ", vendedor=" + vendedor + ", cocheNuevo=" + cocheNuevo + ", fecha=" + fecha + "]";
    }
}
