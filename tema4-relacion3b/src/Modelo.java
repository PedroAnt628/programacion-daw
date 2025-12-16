public class Modelo {
    private String nombre;
    private String id;
    private Marca marca;

    public Modelo(String nombre, String id, Marca marca) {
        this.nombre = nombre;
        this.id = id;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo [nombre=" + nombre + ", id=" + id + ", marca=" + marca + "]";
    }

}
