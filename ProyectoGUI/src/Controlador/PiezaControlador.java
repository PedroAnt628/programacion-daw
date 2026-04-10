package Controlador;

import Modelo.Pieza;
import Modelo.PiezaDAO;
import Vista.PiezaVista;
import java.util.List;
import javax.swing.JOptionPane;

public class PiezaControlador {

    private PiezaVista vista;
    private PiezaDAO dao = new PiezaDAO();

    public PiezaControlador(PiezaVista vista) {
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
            String nombre = vista.txtNombre.getText();
            String color = vista.txtColor.getText();
            double precio = Double.parseDouble(vista.txtPrecio.getText());
            int codCategoria = Integer.parseInt(vista.txtCodCategoria.getText());

            dao.insertar(codigo, nombre, color, precio, codCategoria);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Datos numéricos inválidos");
        }
    }

    private void actualizar() {
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        try {
            int codigo = Integer.parseInt(vista.txtCodigo.getText());
            double precio = Double.parseDouble(vista.txtPrecio.getText());

            dao.actualizarPrecio(codigo, precio);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Precio inválido");
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
        vista.txtNombre.setText(vista.tabla.getValueAt(fila, 1).toString());
        vista.txtColor.setText(vista.tabla.getValueAt(fila, 2).toString());
        vista.txtPrecio.setText(vista.tabla.getValueAt(fila, 3).toString());
        vista.txtCodCategoria.setText(vista.tabla.getValueAt(fila, 4).toString());
    }

    private void cargarTabla() {
        vista.modeloTabla.setRowCount(0);
        List<Pieza> piezas = dao.listar();

        for (Pieza p : piezas) {
            vista.modeloTabla.addRow(new Object[]{
                p.getCodigo(),
                p.getNombre(),
                p.getColor(),
                p.getPrecio(),
                p.getCodCategoria()
            });
        }
    }

    private void limpiar() {
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.txtColor.setText("");
        vista.txtPrecio.setText("");
        vista.txtCodCategoria.setText("");
        vista.tabla.clearSelection();
    }
}
