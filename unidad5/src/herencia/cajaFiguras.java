package herencia;
import java.util.ArrayList;


public class cajaFiguras<T extends figura> {
    private ArrayList<T> figuras = new ArrayList<>();

    public void guardar(T figura) {
        figuras.add(figura);
    }

    public void mostrarContenido() {
        for (T figura : figuras) {
            System.out.println(figura);
        }
    }

    public double areaTotal() {
        double total = 0;
        for (T figura : figuras) {
            total= total + figura.area();
        }
        return total;
    }
}