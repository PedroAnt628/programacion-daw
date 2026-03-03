package Vista;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//Campos
public class CategoriaVista extends JPanel {
    public JTextField txtCodigo = new JTextField(5);
    public JTextField txtNombre = new JTextField(15);

//Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

//Tablas
    public DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Codigo", "Nombre"}, 0);

    public JTable tabla = new JTable(modeloTabla);

    public CategoriaVista() {
        setLayout(new BorderLayout());

        //Panel Superior
        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(
                BorderFactory.createTitledBorder("Datos Categoria"));
        panelFormulario.add(new JLabel("Codigo:"));
        panelFormulario.add(txtCodigo);

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);
    
        //Panel Inferior
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(
                BorderFactory.createTitledBorder("Listado Categorias"));

        add(panelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}
