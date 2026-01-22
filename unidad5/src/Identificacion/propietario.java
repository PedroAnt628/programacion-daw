package Identificacion;

public abstract class propietario extends persona {
    private String direccion;

    public propietario(String dNI, String nombre, String pape, String direccion) {
        super(dNI, nombre, pape);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void identificarte() {
        System.out.println("Soy el propietario " + nombre + " " + pape + " con DNI: " + DNI + " y vivo en: " + direccion);
    }
}
