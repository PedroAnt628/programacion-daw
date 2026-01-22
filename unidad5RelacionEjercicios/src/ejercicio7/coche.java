package ejercicio7;

public class coche extends vehiculo {

    public coche(String marca) {
        super(marca);
    }

   @Override
   void arrancar() {
        System.out.println("El " + marca + " arranca la marcha");       
   }
   
   @Override
   public void volar() {
        
   }
    
}
