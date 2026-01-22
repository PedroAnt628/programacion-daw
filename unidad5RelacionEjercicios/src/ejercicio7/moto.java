package ejercicio7;

public class moto extends vehiculo{
     
    public moto(String marca) {
        super(marca);
    }

   @Override
   void arrancar() {
        System.out.println("La " + marca + " comienza su trayecto");       
   }

   @Override
   public void volar() {
    
   }
}
