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

public class PiezaVista extends JPanel {

    // Campos
    public JTextField txtCodigo = new JTextField(5);
    public JTextField txtNombre = new JTextField(10);
    public JTextField txtColor = new JTextField(10);
    public JTextField txtPrecio = new JTextField(7);
    public JTextField txtCodCategoria = new JTextField(5);

    // Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(
        new Object[]{"Código", "Nombre", "Color", "Precio", "CodCategoria"}, 0
    );

    public JTable tabla = new JTable(modeloTabla);

    public PiezaVista() {
        setLayout(new BorderLayout());

        // Panel principal del formulario (2 filas)
        JPanel panelFormulario = new JPanel(new GridLayout(2, 1));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos Pieza"));

        // Subpanel 1: campos
        JPanel panelCampos = new JPanel();
        panelCampos.add(new JLabel("Código:"));
        panelCampos.add(txtCodigo);

        panelCampos.add(new JLabel("Nombre:"));
        panelCampos.add(txtNombre);

        panelCampos.add(new JLabel("Color:"));
        panelCampos.add(txtColor);

        panelCampos.add(new JLabel("Precio:"));
        panelCampos.add(txtPrecio);

        panelCampos.add(new JLabel("CodCategoria:"));
        panelCampos.add(txtCodCategoria);

        // Subpanel 2: botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnInsertar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnLimpiar);

        panelFormulario.add(panelCampos);
        panelFormulario.add(panelBotones);

        // Tabla
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Listado Piezas"));

        add(panelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}
