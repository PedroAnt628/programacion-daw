public class Empleado {
    private int codigo;
    private String nombre;
    private String apellido;
    private String dni;
    private int telefono;
    private Sucursal trabajo;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String apellido, String dni, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }
    public String getApellido() {
        return apellido;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        if (trabajo != null) {
            return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
                    + ", telefono=" + telefono + ", sucursal=" + trabajo.toString() + "]";
        } else {
        return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
                + ", telefono=" + telefono + "]";
        }
    }
}
