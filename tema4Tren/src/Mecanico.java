public class Mecanico {
    private String nombre;
    private String DNI;
    private int telefono;
    private Especialidad especialidad = null;
    
    
    
    
    public Mecanico(String nombre, String dNI, int telefono, Especialidad especialidad) {
        this.nombre = nombre;
        DNI = dNI;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDNI() {
        return DNI;
    }


    public void setDNI(String dNI) {
        DNI = dNI;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String toString() {
        return "Mecanico [nombre=" + nombre + ", DNI=" + DNI + ", telefono=" + telefono + ", especialidad="
                + especialidad + "]";
    }

    

}
