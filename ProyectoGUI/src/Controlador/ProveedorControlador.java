package Controlador;

import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Vista.ProveedorVista;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorControlador {

    private ProveedorVista vista;
    private ProveedorDAO dao = new ProveedorDAO();

    public ProveedorControlador(ProveedorVista vista) {
        this.vista = vista;

        initControl();
        cargarTabla();
    }

    private void initControl() {
        vista.btnInsertar.addActionListener(e -> insertar());
        vista.btnActualizar.addActionListener(e -> actualizar());
        vista.btnEliminar.addActionListener(e -> eliminar());
        vista.btnLimpiar.addActionListener(e -> limpiar());

        vista.tabla.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                seleccionarFila();
            }
        });
    }

    private void insertar() {
        try {
            int codigo = Integer.parseInt(vista.txtCodigo.getText());
            String direccion = vista.txtDireccion.getText();
            String ciudad = vista.txtCiudad.getText();
            String provincia = vista.txtProvincia.getText();

            dao.insertar(codigo, direccion, ciudad, provincia);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Código inválido");
        }
    }

    private void actualizar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        try {
            int codigo = Integer.parseInt(vista.txtCodigo.getText());
            String direccion = vista.txtDireccion.getText();

            dao.actualizar(codigo, direccion);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Código inválido");
        }
    }

    private void eliminar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        int codigo = Integer.parseInt(vista.txtCodigo.getText());
        dao.borrar(codigo);

        cargarTabla();
        limpiar();
    }

    private void seleccionarFila() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        vista.txtCodigo.setText(vista.tabla.getValueAt(fila, 0).toString());
        vista.txtDireccion.setText(vista.tabla.getValueAt(fila, 1).toString());
        vista.txtCiudad.setText(vista.tabla.getValueAt(fila, 2).toString());
        vista.txtProvincia.setText(vista.tabla.getValueAt(fila, 3).toString());
    }

    private void cargarTabla() {
        vista.modeloTabla.setRowCount(0);
        List<Proveedor> proveedores = dao.listar();

        for (Proveedor p : proveedores) {
            vista.modeloTabla.addRow(new Object[]{
                p.getCodigo(),
                p.getDireccion(),
                p.getCiudad(),
                p.getProvincia()
            });
        }
    }

    private void limpiar() {
        vista.txtCodigo.setText("");
        vista.txtDireccion.setText("");
        vista.txtCiudad.setText("");
        vista.txtProvincia.setText("");
        vista.tabla.clearSelection();
    }
}
