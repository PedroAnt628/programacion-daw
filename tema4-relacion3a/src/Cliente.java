public class Cliente {
    private int codigo;
    private String nombre;
    private String ciudad;
    private String DNI;
    private String fechaNac;

    public Cliente(String DNI, String ciudad, int codigo, String fechaNac, String nombre) {
        this.DNI = DNI;
        this.ciudad = ciudad;
        this.codigo = codigo;
        this.fechaNac = fechaNac;
        this.nombre = nombre;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + 
               "nombre=" + nombre + 
               "ciudad=" + ciudad + 
               "DNI=" + DNI + 
               "fechaNac=" + fechaNac + 
               "]";
    }


    
}
