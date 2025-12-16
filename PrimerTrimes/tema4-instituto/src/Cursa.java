public class Cursa {
    private Alumno alumno = null;
    private Modulo modulo = null;
    public Cursa(Alumno alumno, Modulo modulo) {
        this.alumno = alumno;
        this.modulo = modulo;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
@Override
public String toString() {
    if (alumno !=null && modulo !=null) 
        return "Cursa [alumno=" + alumno.toString() + ", modulo=" + modulo.toString() +"]";
        else return "Faltan datos de alumno y modulo";
    } 
    
}
