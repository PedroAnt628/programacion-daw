public class proveedor {
    private int codigo;
    private String direccion;
    private String provincia;
    private String ciudad;


public proveedor(){

    }

    public proveedor(int codigo, String direccion, String provincia, String ciudad) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getCiudad() {
        return ciudad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        if (direccion != null && provincia != null && ciudad != null)
        return "proveedor [codigo=" + codigo + ", direccion=" + direccion + ", provincia=" + provincia + ", ciudad="
                + ciudad + "]";      
        else return "No hay datos";
    }
}
