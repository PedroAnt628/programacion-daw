public class Alumno {
    private String nombre;
    private String apellidos;
    private int expediente;
    private String fechaNacamiento;

    public Alumno(String nombre, String apellidos, int expediente, String fechaNacamiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.expediente = expediente;
        this.fechaNacamiento = fechaNacamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public String getFechaNacamiento() {
        return fechaNacamiento;
    }

    public void setFechaNacamiento(String fechaNacamiento) {
        this.fechaNacamiento = fechaNacamiento;
    }

    @Override
    public String toString() {
        return " [nombre=" + nombre + ", apellidos=" + apellidos + ", expediente=" + expediente
                + ", fechaNacamiento=" + fechaNacamiento + "]";
    }
    
    
    
}
