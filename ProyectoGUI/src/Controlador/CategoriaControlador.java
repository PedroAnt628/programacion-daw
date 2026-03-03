package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Vista.CategoriaVista;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaControlador {
    private CategoriaVista vista;
    private CategoriaDAO dao = new CategoriaDAO();

    public CategoriaControlador(CategoriaVista vista) {
        this.vista = vista;

        initControl();
        cargarTabla();
    }

    private void initControl() {
        vista.btnInsertar.addActionListener(e -> insertar());
        vista.btnActualizar.addActionListener(e -> actualizar());
        vista.btnEliminar.addActionListener(e -> eliminar());
        vista.btnLimpiar.addActionListener(e -> limpiar());

        vista.tabla.getSelectionModel().addListSelectionListener(e ->{
            if(!e.getValueIsAdjusting()) {
                seleccionarFila();
            }
        });
    }

    private void insertar() {
        try {
            int codigo = Integer.parseInt(vista.txtCodigo.getText());
            String nombre = vista.txtNombre.getText();

            dao.insertar(new Categoria(codigo, nombre));

            cargarTabla();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Codigo invalido");
        }
    }

    private void actualizar() {

        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        try {
            int codigo = Integer.parseInt(vista.txtCodigo.getText());
            String nombre = vista.txtNombre.getText();

            dao.actualizar(new Categoria(codigo, nombre));

            cargarTabla();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Codigo invalido");
        }
    }

    private void eliminar(){
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        int codigo = Integer.parseInt(vista.txtCodigo.getText());
        dao.eliminar(codigo);

        cargarTabla();
        limpiar();
    }

    private void seleccionarFila(){
        int fila = vista.tabla.getSelectedRow();
        if (fila == -1) return;

        vista.txtCodigo.setText(
            vista.tabla.getValueAt(fila, 0).toString()
        );

        vista.txtNombre.setText(
            vista.tabla.getValueAt(fila, 1).toString()
        );
    }

    private void cargarTabla(){
        vista.modeloTabla.setRowCount(0);
        List<Categoria> categorias = dao.listar();
        for (Categoria c : categorias) {
            vista.modeloTabla.addRow(new Object[]{
                c.getId(),
                c.getNombre()
            });
        }
    }

    private void limpiar() {
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.tabla.clearSelection();
    }
}
