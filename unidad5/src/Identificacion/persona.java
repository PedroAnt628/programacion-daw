package Identificacion;

public abstract class persona implements identificacion {
    protected String DNI;
    protected String nombre;
    protected String pape;

    public persona(String dNI, String nombre, String pape) {
        DNI = dNI;
        this.nombre = nombre;
        this.pape = pape;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPape() {
        return pape;
    }

    public void setPape(String pape) {
        this.pape = pape;
    }

    @Override
    public void identificarte() {
        System.out.println("Me llamo " + nombre + " " + pape + " y mi DNI es " + DNI);
    }
    
}
