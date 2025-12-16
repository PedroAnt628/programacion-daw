
import java.util.ArrayList;

public class Empleado {
    private String legajo;
    private String DNI;
    private String nombre;
    private ArrayList<String> telefono;
    private Domicilio domicilio;

    public Empleado(String DNI, Domicilio domicilio, String legajo, String nombre, ArrayList<String> telefono) {
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.legajo = legajo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(ArrayList<String> telefono) {
        this.telefono = telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Empleado [legajo=" + legajo + 
               "DNI=" + DNI + 
               "nombre=" + nombre + 
               "telefono=" + telefono + 
               "domicilio=" + domicilio + 
               "]";
    }

}
