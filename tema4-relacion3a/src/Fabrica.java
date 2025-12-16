public class Fabrica {
    private String CUIT;
    private String nombre;
    private String pais;
    private String gerente;
    private int cantEmp;

    public Fabrica(String CUIT, int cantEmp, String gerente, String nombre, String pais) {
        this.CUIT = CUIT;
        this.cantEmp = cantEmp;
        this.gerente = gerente;
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getCantEmp() {
        return cantEmp;
    }

    public void setCantEmp(int cantEmp) {
        this.cantEmp = cantEmp;
    }

    @Override
    public String toString() {
        return "Fabrica [CUIT=" + CUIT + 
               "nombre=" + nombre + 
               "pais=" + pais + 
               "gerente=" + gerente + 
               "cantEmp=" + cantEmp + 
               "]";
    }


}
