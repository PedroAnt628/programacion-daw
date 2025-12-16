public class Profesor {
    private int dni;
    private int telefono;
    private String nombre;
    private String direcion;
    public Profesor(int dni, int telefono, String nombre, String direcion) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.direcion = direcion;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDirecion() {
        return direcion;
    }
    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }
    
    @Override
    public String toString() {
        return "Profesor [dni=" + dni + ", telefono=" + telefono + ", nombre=" + nombre + ", direcion=" + direcion
                + "]";
    }

    
    
}
