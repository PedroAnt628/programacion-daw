package Modelo;

public class Disena {
    private int profesorId;
    private int practicaId;
    private int examenId;
    private String fecha;

    public Disena(int profesorId, int practicaId, int examenId, String fecha) {
        this.profesorId = profesorId;
        this.practicaId = practicaId;
        this.examenId = examenId;
        this.fecha = fecha;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }

    public int getPracticaId() {
        return practicaId;
    }

    public void setPracticaId(int practicaId) {
        this.practicaId = practicaId;
    }

    public int getExamenId() {
        return examenId;
    }

    public void setExamenId(int examenId) {
        this.examenId = examenId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

    
}
