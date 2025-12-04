public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }



    public void asignaNumerador(int x) {
        this.numerador = x;
    }

    public void asignaDenominador(int y) {
        this.denominador = y;
    }

    public void imprimirRacional() {
        System.out.println(numerador + "/" + denominador);
    }

    public Racional suma(Racional nuevo) {
        int num = this.numerador * nuevo.denominador + nuevo.numerador * this.denominador;
        int den = this.denominador * nuevo.denominador;
        return new Racional(num, den);
    }

    public Racional resta(Racional nuevo) {
        int num = this.numerador * nuevo.denominador - nuevo.numerador * this.denominador;
        int den = this.denominador * nuevo.denominador;
        return new Racional(num, den);
    }

    public Racional producto(Racional nuevo) {
        int num = this.numerador * nuevo.numerador;
        int den = this.denominador * nuevo.denominador;
        return new Racional(num, den);
    }

    public Racional division(Racional nuevo) {
        int num = this.numerador * nuevo.denominador;
        int den = this.denominador * nuevo.numerador;
        return new Racional(num, den);
    }

    public boolean esIgual(Racional nuevo) {
        return this.numerador * nuevo.denominador == nuevo.numerador * this.denominador;
    }
}
