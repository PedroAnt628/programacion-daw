package Identificacion;

public abstract class moto extends vehiculo{
    private boolean limitador;

    public moto(String matricula, String marca, String modelo, boolean limitador) {
        super(matricula, marca, modelo);
        this.limitador = limitador;
    }

    public boolean isLimitador() {
        return limitador;
    }

    public void setLimitador(boolean limitador) {
        this.limitador = limitador;
    }

    @Override
    public void identificarte() {
        System.out.println("Soy una moto con matrícula: " + matricula + " Limitador:" + limitador);
    }
}
