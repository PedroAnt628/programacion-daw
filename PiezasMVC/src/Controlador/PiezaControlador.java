package Controlador;

import Modelo.Pieza;
import Modelo.PiezaDAO;
import Vista.PiezaVista;

public class PiezaControlador {

    private PiezaVista vista;

    public PiezaControlador() {
        vista = new PiezaVista();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {

                case 1:
                    PiezaDAO.listar();
                    break;

                case 2: {
                    Pieza nueva = vista.pedirNuevaPieza();
                    PiezaDAO.insertar(nueva);
                    vista.mostrarMensaje("Pieza insertada");
                    break;
                }

                case 3: {
                    int codigo = vista.pedirIdActualizar();
                    String nuevoNombre = vista.pedirNuevoNombre();
                    String nuevoColor = vista.pedirNuevoColor();
                    double nuevoPrecio = vista.pedirNuevoPrecio();
                    int nuevaCategoria = vista.pedirNuevaCategoria();
                    PiezaDAO.actualizar(codigo, nuevoNombre, nuevoColor, nuevoPrecio, nuevaCategoria);
                    vista.mostrarMensaje("Pieza actualizada");
                    break;
                }

                case 4: {
                    int codigo = vista.pedirIdEliminar();
                    PiezaDAO.borrar(codigo);
                    vista.mostrarMensaje("Pieza eliminada");
                    break;
                }

                case 0:
                    vista.mostrarMensaje("Saliendo del menú de piezas...");
                    break;

                default:
                    vista.mostrarMensaje("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
