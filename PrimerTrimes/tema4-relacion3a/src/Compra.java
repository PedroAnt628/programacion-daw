public class Compra {
    private Cliente cliente;
    private Sucursal sucursal;
    private String descuento;

    public Compra(Cliente cliente, Sucursal sucursal, String descuento) {
        this.cliente = cliente;
        this.sucursal = sucursal;
        this.descuento = descuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Compra [cliente=" + cliente + 
               "sucursal=" + sucursal + 
               "descuento=" + descuento + 
               "]";
    }

}
