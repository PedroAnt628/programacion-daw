 
public class ActividadTren {
    public static void main(String[] args) throws Exception {

        Mecanico mecanico1 = new Mecanico("Paquillo", "4535354f", 345345345, Especialidad.electricidad);
        Mecanico mecanico2 = new Mecanico("Alfonso", "3436346s", 36346346, Especialidad.motor);

        Maquinistas maquinista1 = new Maquinistas("Francisco", "34534643d", "15€", "Lo mas bajo");
        Maquinistas maquinista2 = new Maquinistas("Jesus", "34534643d", "1445€", "Lo mas alto");

        Vagon vagon1 = new Vagon(1, 40, 15, "Arroz");
        Vagon vagon2 = new Vagon(2, 100, 35, "Canabis");
        Vagon vagon3 = new Vagon(3, 200, 12, "Adrianes");
        Vagon vagon4 = new Vagon(4, 200, 12, "Jamos");


        Locomotora locomotora1 = new Locomotora("3453sdf", "2000", "30/12/2008", mecanico2);
        Locomotora locomotora2 = new Locomotora("4568sdf", "1700", "07/07/2015", mecanico1);
        Locomotora locomotora3 = new Locomotora("4568sdf", "2200", "12/08/2015", mecanico1);

        Tren tren1 = new Tren(locomotora3, vagon4, maquinista2);

        System.out.println(tren1);


    }
}
