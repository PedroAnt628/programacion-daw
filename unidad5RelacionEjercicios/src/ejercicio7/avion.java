package ejercicio7;

public class avion extends vehiculo {

    public avion(String marca) {
        super(marca);
    }
    
    @Override
    void arrancar() {
        System.out.println("El " + marca + " arranca la marcha");       
    }

    @Override
    public void volar() {
        System.out.println("El avion comienza su vuelo");        
    }

}
