public class proveedor_suminsitra_pieza {
    pieza pieza;
    proveedor proveedor;
    int cantidad;
    String fecha;

    public proveedor_suminsitra_pieza(){

    }
    public proveedor_suminsitra_pieza(pieza pieza, proveedor proveedor, int cantidad, String fecha) {
        this.pieza = pieza;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
    public pieza getPieza() {
        return pieza;
    }
    public proveedor getProveedor() {
        return proveedor;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getFecha() {
        return fecha;
    }
    public void setPieza(pieza pieza) {
        this.pieza = pieza;
    }
    public void setProveedor(proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        if (pieza == null || proveedor == null) 
        return "proveedor_suminsitra_pieza [pieza=" + pieza.toString() + ", proveedor=" + proveedor.toString() + ", cantidad=" + cantidad
                + ", fecha=" + fecha + "]";
        else return "No hay datos";
    }
}
