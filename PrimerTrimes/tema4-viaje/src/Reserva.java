public class Reserva {
    private Hotel hotel= null;
    private Turista turista= null;
    private Sucursal sucursal= null;
    private String fechaSalida;
    private String fechaEntrada;
    private String regimen;
    
    public Reserva(Hotel hotel, Turista turista, Sucursal sucursal, String fechaSalida,
            String fechaEntrada, String regimen) {
        this.hotel = hotel;
        this.turista = turista;
        this.sucursal = sucursal;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.regimen = regimen;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public void imprimeReserva(){
        if ( hotel!=null && turista!=null & sucursal!=null){
            System.out.println(hotel);
            System.out.println(turista);
            System.out.println(sucursal);
            System.out.println("La fecha de entrada es: "+fechaEntrada);
            System.out.println("La fecha de salida es: "+fechaSalida);
            System.out.println("El regimen es: "+ regimen);
        }else System.out.println("Faltan datos");

    }

   
}
