public class persona {
    private String nombre;
    private String domicilio;
    private String telefono;

    public persona(){

    }

    public persona(String nombre, String domicilio, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void imprimePersona(){
        System.out.println("Se llama " + this.nombre + "\n Vive en " + this.domicilio + "\n Su telefono es " + this.telefono);
      
    }
}
