package Actividades;

import java.util.ArrayList;
import java.util.List;

public class actividadesPag29<T> {
    private List<T> elementos = new ArrayList<>();

    public void insertar(T objeto) {
        elementos.add(objeto);
    }

    public T borrar() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T devolverValor() {
        if (estaVacia()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    public int buscar(T objeto) {
        return elementos.indexOf(objeto);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    @Override
    public String toString() {
        return "Pila: " + elementos.toString();
    }
}

class main{

    public static void main(String[] args) {
        actividadesPag29<Integer> pila = new actividadesPag29<>();

        pila.insertar(10);
        pila.insertar(20);
        pila.insertar(30);

        System.out.println(pila);

        System.out.println("Valor superior: " + pila.devolverValor());

        System.out.println("Índice de 20: " + pila.buscar(20));

        System.out.println("Eliminando elemento: " + pila.borrar());
        System.out.println(pila);

        System.out.println("¿La pila está vacía? " + pila.estaVacia());
    }
}

