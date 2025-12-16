public class Carta {

    private String valor;
    private String palo;


    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }


    public String getValor() {
        return valor;
    }


    public void setValor(String valor) {
        this.valor = valor;
    }


    public String getPalo() {
        return palo;
    }


    public void setPalo(String palo) {
        this.palo = palo;
    }

    
    public int obtenerPuntos(){
        if (valor.equals("J") || valor.equals("Q") || valor.equals("K")){
            return 10; 
        }else if (valor.equals("A")){
            return 11;
        }else {
            return Integer.parseInt(valor);
        }
        } 

    @Override
    public String toString() {
        return valor + " de " + palo;
    }

}
