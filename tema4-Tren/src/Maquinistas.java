public class Maquinistas {
    private String nombre;
    private String DNI;
    private String sueldo;
    private String rango;
    
    public Maquinistas(String nombre, String dNI, String sueldo, String rango) {
        this.nombre = nombre;
        DNI = dNI;
        this.sueldo = sueldo;
        this.rango = rango;
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



    public String getSueldo() {
        return sueldo;
    }



    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }



    public String getRango() {
        return rango;
    }



    public void setRango(String rango) {
        this.rango = rango;
    }


    @Override
    public String toString() {
        return "Maquinistas [nombre=" + nombre + ", DNI=" + DNI + ", sueldo=" + sueldo + ", rango=" + rango + "]";
    }
    
}
