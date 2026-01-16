package herencia;


public class main {
    public static void main(String[] args) {

        cajaFiguras<circulo> cajaCirculos = new cajaFiguras<>();
        cajaCirculos.guardar(new circulo("Círculo A", 3));
        cajaCirculos.guardar(new circulo("Círculo B", 5));

        System.out.println("Caja de círculos:");
        cajaCirculos.mostrarContenido();
        System.out.println("Área total: " + cajaCirculos.areaTotal());

        cajaFiguras<rectangulo> cajaRectangulos = new cajaFiguras<>();
        cajaRectangulos.guardar(new rectangulo("Rectángulo A", 4, 6));
        cajaRectangulos.guardar(new rectangulo("Rectángulo B", 2, 3));

        System.out.println("\nCaja de rectángulos:");
        cajaRectangulos.mostrarContenido();
        System.out.println("Área total: " + cajaRectangulos.areaTotal());

        cajaFiguras<figura> cajaGeneral = new cajaFiguras<>();
        cajaGeneral.guardar(new circulo("Círculo C", 2));
        cajaGeneral.guardar(new rectangulo("Rectángulo C", 5, 5));

        System.out.println("\nCaja general:");
        cajaGeneral.mostrarContenido();
        System.out.println("Área total: " + cajaGeneral.areaTotal());
    }
}
