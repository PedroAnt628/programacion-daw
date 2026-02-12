package Modelo;

public class Proveedor {
    private int codigo;
    private String ciudad;
    private String direccion;
    private String provincia;

    public Proveedor(int codigo, String ciudad, String direccion, String provincia) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.provincia = provincia;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
