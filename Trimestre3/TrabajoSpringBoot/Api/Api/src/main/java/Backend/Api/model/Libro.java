package Backend.Api.model; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Representa la estructura de un libro en la base de datos.
 * 
 * La anotación @Entity le dice a Spring que esta clase corresponde a una tabla en la BD.
 * Spring crea automáticamente la tabla "Libro" con columnas para cada atributo.
 */
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String titulo;
    private String autor;
    private Integer anio;
    private Double precio;
    private String imagen;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, Integer anio, Double precio, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.precio = precio;
        this.imagen = imagen;
    }

    // Getters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Integer getAnio() { return anio; }
    public Double getPrecio() { return precio; }
    public String getImagen() { return imagen; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setAnio(Integer anio) { this.anio = anio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}