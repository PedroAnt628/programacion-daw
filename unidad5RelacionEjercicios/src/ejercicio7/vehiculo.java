package ejercicio7;

public abstract class vehiculo implements volador{
    protected String marca;

    public vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    abstract void arrancar();

    void frenar() {
        System.out.println(marca + " está frenando");
    }

}
