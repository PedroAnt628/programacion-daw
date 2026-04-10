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

//Campos
public class SuministroVista extends JPanel {
    public JTextField txtCodProv = new JTextField(5);
    public JTextField txtCodPieza = new JTextField(5);
    public JTextField txtCantidad = new JTextField(4);
    public JTextField txtFecha = new JTextField(15);


//Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

//Tablas
    public DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Codigo Proveedor", "Codigo Pieza", "Cantidad", "Fecha"}, 0);

    public JTable tabla = new JTable(modeloTabla);

    public SuministroVista() {
        setLayout(new BorderLayout());

        //Panel Superior
        JPanel panelFormulario = new JPanel(new GridLayout(2,1));
        panelFormulario.setBorder(
                BorderFactory.createTitledBorder("Datos Suministro"));
        panelFormulario.add(new JLabel("Codigo Proveedor:"));
        panelFormulario.add(txtCodProv);

        panelFormulario.add(new JLabel("Codigo Pieza:"));
        panelFormulario.add(txtCodPieza);

        panelFormulario.add(new JLabel("Cantidad:"));
        panelFormulario.add(txtCantidad);

        panelFormulario.add(new JLabel("Fecha:"));
        panelFormulario.add(txtFecha);

        panelFormulario.add(btnInsertar);
        panelFormulario.add(btnActualizar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnLimpiar);
    
        //Panel Inferior
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(
                BorderFactory.createTitledBorder("Listado Suministros"));

        add(panelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }
}
