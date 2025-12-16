public class Vagon {
    private int numero;
    private int cargaMaxima;
    private int cargaActual;
    private String tipoMercancia;

    public Vagon(int numero, int cargaMaxima, int cargaActual, String tipoMercancia) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public String toString() {
        return "Vagon [numero=" + numero + ", cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual
                + ", tipoMercancia=" + tipoMercancia + "]";
    }

    
    
}
