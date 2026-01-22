package ejercicio7;

public class helicoptero extends vehiculo {
    public helicoptero(String marca) {
        super(marca);
    }
    
    @Override
    void arrancar() {
        System.out.println("El " + marca + " arranca la marcha");       
    }

    @Override
    public void volar() {
        System.out.println("El helicoptero comienza su vuelo");        
    }
}
