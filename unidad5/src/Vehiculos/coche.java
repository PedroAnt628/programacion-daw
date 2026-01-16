package Vehiculos;

public class coche extends vehiculo {
    public coche(String matricula) {
        super(matricula);
    }
    public int velocidadMaxima() {
        return 150;
    }

    @Override
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Su velocidad máxima es" + velocidadMaxima() + " km/h");
    }
}


    

    
    

