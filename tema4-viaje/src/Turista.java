public class Turista {
    private int id;
    private String direccion;
    private String nombre;
    private String apellido;
    private int telefono;

    public Turista(int id, String direccion, String nombre, String apellido, int telefono) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Turista [id=" + id + ", direccion=" + direccion + ", nombre=" + nombre + ", apellido=" + apellido
                + ", telefono=" + telefono + "]";
    }
    

}
