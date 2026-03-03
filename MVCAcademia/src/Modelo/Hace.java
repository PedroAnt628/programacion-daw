package Modelo;

public class Hace {
    private int alumnoId;
    private int examenId;
    private Double nota;

    public Hace(int alumnoId, int examenId, Double nota) {
        this.alumnoId = alumnoId;
        this.examenId = examenId;
        this.nota = nota;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getExamenId() {
        return examenId;
    }

    public void setExamenId(int examenId) {
        this.examenId = examenId;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    
}
