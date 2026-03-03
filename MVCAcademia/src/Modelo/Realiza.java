package Modelo;

public class Realiza {
    private int alumnoId;
    private int practicaId;
    private String fecha;
    private Double nota;

    public Realiza(int alumnoId, int practicaId, String fecha, Double nota) {
        this.alumnoId = alumnoId;
        this.practicaId = practicaId;
        this.fecha = fecha;
        this.nota = nota;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getPracticaId() {
        return practicaId;
    }

    public void setPracticaId(int practicaId) {
        this.practicaId = practicaId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    
}
