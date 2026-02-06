package ejercicio2;

public class caja<T> {

    private T contenido;

    public caja(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public void mostrar() {
        System.out.println(contenido.toString());
    }
}
