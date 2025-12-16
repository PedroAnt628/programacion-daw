public class SucursalProducto {
    private Sucursal sucursal;
    private Producto producto;
    private String precioVenta;

    public SucursalProducto(Sucursal sucursal, Producto producto, String precioVenta) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.precioVenta = precioVenta;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public String getPrecioVenta() {
        return precioVenta;
    }
    
    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "SucursalProducto [sucursal=" + sucursal + 
               "producto=" + producto + 
               "precioVenta=" + precioVenta + 
               "]";
    }
}
