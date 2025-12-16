public class Version {
    private String id;
    private String nombre;
    private String potencia;
    private String precioBase;
    private String combustible;
    private Modelo modelo;

    public Version(String id, String nombre, String potencia, String precioBase, String combustible, Modelo modelo) {
        this.id = id;
        this.nombre = nombre;
        this.potencia = potencia;
        this.precioBase = precioBase;
        this.combustible = combustible;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(String precioBase) {
        this.precioBase = precioBase;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Version [id=" + id + ", nombre=" + nombre + ", potencia=" + potencia + ", precioBase=" + precioBase
                + ", combustible=" + combustible + ", modelo=" + modelo + "]";
    }
}
