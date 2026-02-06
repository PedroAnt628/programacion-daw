package Ejercicio4;

public abstract class vehiculo implements parkeable{
    protected String matricula;
    static int plazasOcupadas = 0;


    public vehiculo(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public abstract void calcularPrecio();

    @Override
    public void entrar() {
        System.out.println("El vehiculo con la matricula" + matricula + "ha entrado al parking");
        plazasOcupadas++;
    }

    @Override
    public void salir() {
        System.out.println("El vehiculo con la matricula" + matricula + "ha salido del parking");
        plazasOcupadas--;
    }

    public void plazasLibres() {
        System.out.println("Plazas libres: " + (plazas - plazasOcupadas));
    }
}
