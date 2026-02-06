package Ejercicio4;

public class moto extends vehiculo{
    static int precio_hora = 1;

    public moto(String matricula, int precio_hora) {
        super(matricula);
        this.precio_hora = precio_hora;
    }

    @Override
    public void entrar() {
        super.entrar();
    }

    @Override
    public void salir() {
        super.salir();
    }

    @Override
    public void calcularPrecio() {
        int horas=(int)(Math.random() * (10 - 1 + 1)) + 1;
        System.out.println("El precio es:"+ (horas + precio_hora));
    }
    
}
