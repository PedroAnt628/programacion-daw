public class Sucursal {
    private int codigo;
    private String direccion;
    private String ciudad;
    private int telefono;
    private String provincia;

    public Sucursal() {
    }

    public Sucursal(int codigo, String direccion, String ciudad, int telefono, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
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
    public int getTelefono() {
        return telefono;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Sucursal [codigo=" + codigo + ", direccion=" + direccion + ", ciudad=" + ciudad + ", telefono=" + telefono
                + ", provincia=" + provincia + "]";
    }
}
