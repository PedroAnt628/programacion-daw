package Modelo;

public class SeMatricula {
    private int numeroMatricula;
    private int idCurso;
    private int codigoAsignatura;

    public SeMatricula(int numeroMatricula, int idCurso, int codigoAsignatura) {
        this.numeroMatricula = numeroMatricula;
        this.idCurso = idCurso;
        this.codigoAsignatura = codigoAsignatura;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }
}
