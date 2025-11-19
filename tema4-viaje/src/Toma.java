public class Toma {
    private Sucursal sucursal= null;
    private Turista turista= null;
    private Vuelo vuelo= null;
    private String clase;

    public Toma(Sucursal sucursal, Turista turista, Vuelo vuelo, String clase) {
        this.sucursal = sucursal;
        this.turista = turista;
        this.vuelo = vuelo;
        this.clase = clase;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void imprimeToma(){
        if (sucursal != null && turista!= null && vuelo!= null){
        System.out.println(sucursal);
        System.out.println(turista);
        System.out.println(vuelo);
        System.out.println("La clase del vieaje sera: "+clase);
        } else System.out.println("Faltan datos");;

    }
    
    
}
