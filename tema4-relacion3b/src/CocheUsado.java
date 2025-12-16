public class CocheUsado {
    private String id;
    private String matricula;
    private String tasacion;
    private String nombre;
    private Modelo modelo;
    private Cliente cliente;

    public CocheUsado(String id, String matricula, String tasacion, String nombre, Modelo modelo, Cliente cliente) {
        this.id = id;
        this.matricula = matricula;
        this.tasacion = tasacion;
        this.nombre = nombre;
        this.modelo = modelo;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTasacion() {
        return tasacion;
    }

    public void setTasacion(String tasacion) {
        this.tasacion = tasacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CocheUsado [id=" + id + ", matricula=" + matricula + ", tasacion=" + tasacion + ", nombre=" + nombre + ", modelo=" + modelo + ", cliente=" + cliente + "]";
    }
}
