public class Publica {
    private Sucursal sucursal = null;
    private Revista revista = null;

    public Publica (){
        
    }

    public Publica(Sucursal sucursal, Revista revista) {
        this.sucursal = sucursal;
        this.revista = revista;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString(){
        if (sucursal != null && revista != null)
            return "Publica [ " + revista.toString() + ", sucursal= " + sucursal.toString() + "]";
        else
            return "No hay datos de sucursal y revista";
    }

}
