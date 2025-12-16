// Hemos recibido el encargo de un cliente para definir las clases necesarias
// (atributos, constructores y get/set) para gestionar una empresa ferroviaria, en la que se
// distinguen dos grandes grupos: el personal y la maquinaria.
public class ActividadTren {
    public static void main(String[] args) throws Exception {

        Mecanico mecanico1 = new Mecanico("Paquillo", "4535354f", 345345345, Especialidad.electricidad);
        Mecanico mecanico2 = new Mecanico("Alfonso", "3436346s", 36346346, Especialidad.motor);

        Maquinistas maquinista1 = new Maquinistas("Francisco", "34534643d", "15€", "Lo mas bajo");
        Maquinistas maquinista2 = new Maquinistas("Jesus", "34534643d", "1445€", "Lo mas alto");

        Locomotora locomotora1 = new Locomotora("3453sdf", "2000", "30/12/2008", mecanico2);
        Locomotora locomotora2 = new Locomotora("4568sdf", "1700", "07/07/2015", mecanico1);

        Vagon[] vagon1= new Vagon[3];

        for ( int i = 0; i < vagon1.length; i++){
            vagon1[i] = new Vagon(5, 1000, 600, "Tierra");

        }

        Tren tren1 = new Tren();
        tren1.setLocomotora(locomotora2);
        tren1.setVagon(vagon1);
        tren1.setMaquinistas(maquinista2);

         Tren tren2 = new Tren();
        tren1.setLocomotora(locomotora1);
        tren1.setVagon(vagon1);
        tren1.setMaquinistas(maquinista1);

         Tren tren3 = new Tren();
        tren1.setLocomotora(locomotora2);
        tren1.setVagon(vagon1);
        tren1.setMaquinistas(maquinista1);

        System.out.println(tren1);

    }
}
