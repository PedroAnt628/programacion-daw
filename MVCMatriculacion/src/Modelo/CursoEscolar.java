package Modelo;

public class CursoEscolar {
    private int id;
    private int anioInicio;
    private int anioFin;

    public CursoEscolar(int id, int anioInicio, int anioFin) {
        this.id = id;
        this.anioInicio = anioInicio;
        this.anioFin = anioFin;
    }

    public int getId() {
        return id;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public int getAnioFin() {
        return anioFin;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }

    public void setAnioFin(int anioFin) {
        this.anioFin = anioFin;
    }
}
