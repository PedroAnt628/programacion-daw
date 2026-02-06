package Ejercicio4;

public class main {
    public static void main(String[] args) {
        coche c1 = new coche("asdf346", 2);
        moto m1 = new moto("asdf654",1);
        coche c2 = new coche("agsf216", 2);


        c1.entrar();
        m1.salir();
        c2.entrar();

        c1.calcularPrecio();
        m1.calcularPrecio();

    }
}
