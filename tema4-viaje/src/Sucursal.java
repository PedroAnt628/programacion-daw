public class Sucursal {
    private int id;
    private String direccion;
    private int telefono;
    private String ciudad;
    private String provincia;
    
    public Sucursal(int id, String direccion, int telefono, String ciudad, String provincia) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Sucursal [id=" + id + ", direccion=" + direccion + ", telefono=" + telefono + ", ciudad=" + ciudad
                + ", provincia=" + provincia + "]";
    }


}
