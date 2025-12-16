public class Escribe {
    private Revista revista=null;
    private Periodista periodista=null;
    public Escribe(Revista revista, Periodista periodista) {
        this.revista = revista;
        this.periodista = periodista;
    }
    public Revista getRevista() {
        return revista;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    public Periodista getPeriodista() {
        return periodista;
    }
    public void setPeriodista(Periodista periodista) {
        this.periodista = periodista;
    }

    @Override
    public String toString(){
        if (revista !=null && periodista !=null)
            return "Escribe [ " + revista.toString() + ", periodista= " +  periodista.toString() + "]";
            else return "No hay datos de revista y periodista";
        }
}