import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano;
    private int fondos;
    private int victorias;

    public Jugador(String nombre, int fondos) {
        this.nombre = nombre;
        this.fondos = fondos;
        this.mano = new ArrayList<>();
        this.victorias = 0;
    }


    public String getNombre() {
        return nombre;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }

    public int getVictorias() {
        return victorias;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }


    public void sumarVictoria() {
        victorias++;
    }

    public void limpiarMano() {
        mano.clear();
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }


    public int calcularPuntos() {
        int total = 0;
        int ases = 0;

        for (int i = 0; i < mano.size(); i++) {
            total = total + mano.get(i).obtenerPuntos();
            if (mano.get(i).getValor().equals("A")) {
                ases++;
            }
        }

        while (total > 21 && ases > 0) {
            total = total - 10;
            ases--;
        }

        return total;
    }

    public String mostrarMano() {
    String resultado = "";
    for (int i = 0; i < mano.size(); i++) {
        resultado += mano.get(i).toString() + " ";
    }
    return resultado;
    }

    
}

