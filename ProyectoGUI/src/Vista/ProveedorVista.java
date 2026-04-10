package Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ProveedorVista extends JPanel {

    // Campos
    public JTextField txtCodigo = new JTextField(5);
    public JTextField txtDireccion = new JTextField(15);
    public JTextField txtCiudad = new JTextField(10);
    public JTextField txtProvincia = new JTextField(10);

    // Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(
        new Object[]{"Código", "Dirección", "Ciudad", "Provincia"}, 0);

    public JTable tabla = new JTable(modeloTabla);

    public ProveedorVista() {
        setLayout(new BorderLayout());

        // Panel superior (formulario)
        JPanel panelFormulario = new JPanel(new GridLayout(2, 1));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos Proveedor"));

        panelFormulario.add(new JLabel("Código:"));
        panelFormulario.add(txtCodigo);

        panelFormulario.add(new JLabel("Dirección:"));
        panelFormulario.add(txtDireccion);

        panelFormulario.add(new JLabel("Ciudad:"));
        panelFormulario.add(txtCiudad);

        panelFormulario.add(new JLabel("Provincia:"));
        panelFormulario.add(txtProvincia);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);

        // Panel inferior (tabla)
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Listado Proveedores"));

        add(panelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}
