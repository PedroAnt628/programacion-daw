public class Hotel {
    private int id;
    private String nombre;
    private int telefono;
    private int plaza;
    private String ciudad;
    private String direccion;
    
    public Hotel(int id, String nombre, int telefono, int plaza, String ciudad, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.plaza = plaza;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
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

    @Override
    public String toString() {
        return "Hotel [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", plaza=" + plaza + ", ciudad="
                + ciudad + ", direccion=" + direccion + "]";
    }

    
}
