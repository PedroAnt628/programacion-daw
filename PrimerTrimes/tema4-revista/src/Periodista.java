public class Periodista {
    private int codigo;
    private String nombre;
    private String apellido;
    private String especialidad;
    private int telefono;

    public Periodista() {
    }
    public Periodista(int codigo, String nombre, String apellido, String especialidad, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Periodista [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
                + ", telefono=" + telefono + "]";
    }
}
