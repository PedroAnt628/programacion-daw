import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {

        Caja<Integer> cajaEntero = new Caja<>(42);
        System.out.println(cajaEntero);

        Caja<String> cajaTexto = new Caja<>("Hola mundo");
        System.out.println(cajaTexto);

        Caja<ArrayList<Integer>> cajaLista = new Caja<>(new ArrayList<>(Arrays.asList(  2, 7, 3, 1)));
        System.out.println(cajaLista);
    }
}

class Caja<T> {

    private T valor;

    public Caja(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Caja contiene: " + valor;
    }
}
