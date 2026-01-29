package Actividades;

public class actividadesPag28 {
    public static <T> void intercambiar(T[] array, int pos1, int pos2) {
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static <T> int buscar(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1; 
    }

    public static <T extends Comparable<T>> T maximo(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = {10, 20, 30, 40};

        intercambiar(numeros, 0, 2);
        System.out.println("Array tras intercambio: " + java.util.Arrays.toString(numeros));

        int pos = buscar(numeros, 30);
        System.out.println("Posición del 30: " + pos);

        Integer mayor = maximo(15, 27);
        System.out.println("Máximo entre 15 y 27: " + mayor);
    }
}


