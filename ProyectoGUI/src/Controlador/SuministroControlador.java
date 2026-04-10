package Controlador;

import Modelo.Proveedor;
import Modelo.Suministro;
import Modelo.SuministroDAO;
import Vista.SuministroVista;

import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class SuministroControlador {

    private SuministroVista vista;
    private SuministroDAO dao = new SuministroDAO();

    public SuministroControlador(SuministroVista vista) {
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
            int codProv = Integer.parseInt(vista.txtCodProv.getText());
            int codPieza = Integer.parseInt(vista.txtCodPieza.getText());
            int cantidad = Integer.parseInt(vista.txtCantidad.getText());
            Date fecha = Date.valueOf(vista.txtFecha.getText());

            dao.insertar(codProv, codPieza, cantidad, fecha);

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
            int codProv = Integer.parseInt(vista.txtCodProv.getText());
            int codPieza = Integer.parseInt(vista.txtCodPieza.getText());
            int cantidad = Integer.parseInt(vista.txtCantidad.getText());


            dao.actualizarCantidad(codProv, codPieza, cantidad);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Código inválido");
        }
    }

    private void eliminar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        int codProv = Integer.parseInt(vista.txtCodProv.getText());
        int codPieza = Integer.parseInt(vista.txtCodPieza.getText());

        dao.borrar(codProv, codPieza);

        cargarTabla();
        limpiar();
    }

    private void seleccionarFila() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        vista.txtCodProv.setText(vista.tabla.getValueAt(fila, 0).toString());
        vista.txtCodPieza.setText(vista.tabla.getValueAt(fila, 1).toString());
        vista.txtCantidad.setText(vista.tabla.getValueAt(fila, 2).toString());
        vista.txtFecha.setText(vista.tabla.getValueAt(fila, 3).toString());
    }

    private void cargarTabla() {
        vista.modeloTabla.setRowCount(0);
        List<Suministro> suministros = dao.listar();

        for (Suministro s : suministros) {
            vista.modeloTabla.addRow(new Object[]{
                s.getCodProveedor(),
                s.getCodPieza(),
                s.getCantidad(),
                s.getFecha()
            });
        }
    }

    private void limpiar() {
        vista.txtCodProv.setText("");
        vista.txtCodPieza.setText("");
        vista.txtCantidad.setText("");
        vista.txtFecha.setText("");
        vista.tabla.clearSelection();
    }
}


