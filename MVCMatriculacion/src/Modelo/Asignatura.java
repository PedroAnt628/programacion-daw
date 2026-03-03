package Modelo;

public class Asignatura {
    private int codigo;
    private String nombre;
    private int numeroHoras;
    private int idProfesor; // FK hacia Profesor

    public Asignatura(int codigo, String nombre, int numeroHoras, int idProfesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        this.idProfesor = idProfesor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
}
