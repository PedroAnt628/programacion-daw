import Controlador.CategoriaControlador;
import Controlador.PiezaControlador;
import Controlador.ProveedorControlador;
import Vista.CategoriaVista;
import Vista.PiezaVista;
import Vista.ProveedorVista;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import Vista.SuministroVista;
import Controlador.SuministroControlador;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("IES Cura Valera");
        //Crear el JTablePane

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50,50,300,200);
        CategoriaVista categoriaVista = new CategoriaVista();
        PiezaVista piezaVista = new PiezaVista();
        ProveedorVista proveedorVista = new ProveedorVista();
        SuministroVista suministraVista = new SuministroVista();

        //Añadir los paneles como pestañas

        tabbedPane.add("Categoria", categoriaVista);
        tabbedPane.add("Pieza", piezaVista);
        tabbedPane.add("Proveedor", proveedorVista);
        tabbedPane.add("Suministra", suministraVista);

        //Definir el controlador asociado
        CategoriaControlador categoriaControlador = new CategoriaControlador(categoriaVista);
        PiezaControlador piezaControlador = new PiezaControlador(piezaVista);
        ProveedorControlador proveedorControlador = new ProveedorControlador(proveedorVista);
        SuministroControlador suministraControlador = new SuministroControlador(suministraVista);

        //Asociar el TabbedPane

        frame.setContentPane(tabbedPane);

        //Tamaña y visualizacion

        frame.setSize(800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
