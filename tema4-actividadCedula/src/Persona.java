public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private char genero;

    Fecha fechaNacimiento;
    Ciudad ciudadNacimiento;
    Ciudad ciudadResidencia;
    
    public Persona(){

    }
    public Persona(String cedula, String nombre, String apellido, char genero){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setCiudadNacimiento(Ciudad nacimiento){
        this.ciudadNacimiento=nacimiento;
    }
    public Ciudad getCiudadNaciminento(){
        return this.ciudadNacimiento;
    }
    public void setFechaNacimiento(Fecha fecha){
        this.fechaNacimiento=fecha;
    }
    public void setCiudadResidencia(Ciudad ciudad){
        this.ciudadResidencia=ciudad;
    }
    public Ciudad getCiudadResidencia(){
        return this.ciudadResidencia;
    }
    public Fecha getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public void imprimePesona(){
        System.out.println("Datos de persona");
        if(fechaNacimiento!=null) fechaNacimiento.imprimeFecha();
        if(ciudadNacimiento!=null) ciudadNacimiento.imprimeCiudad();
        if(ciudadResidencia!=null) ciudadResidencia.imprimeCiudad();
        if(cedula!=null) System.out.println("Cedula: " + cedula);
        if(nombre!=null) System.out.println("Nombre: " + nombre);
        if(apellido!=null) System.out.println("Apellido: " + apellido);
        System.out.println("Género: " + genero);
    }

}
