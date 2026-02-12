package Controlador;

import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Vista.ProveedorVista;

public class ProveedorControlador {

    private ProveedorVista vista;

    public ProveedorControlador() {
        vista = new ProveedorVista();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {

                case 1:
                    ProveedorDAO.listar();
                    break;

                case 2: {
                    Proveedor nuevo = vista.pedirNuevoProveedor();
                    ProveedorDAO.insertar(nuevo);
                    vista.mostrarMensaje("Proveedor insertado");
                    break;
                }

                case 3: {
                    int codigo = vista.pedirIdActualizar();
                    String ciudad = vista.pedirNuevaCiudad();
                    String direccion = vista.pedirNuevaDireccion();
                    String provincia = vista.pedirNuevaProvincia();
                    ProveedorDAO.actualizar(codigo, ciudad, direccion, provincia);
                    vista.mostrarMensaje("Proveedor actualizado");
                    break;
                }

                case 4: {
                    int codigo = vista.pedirIdEliminar();
                    ProveedorDAO.borrar(codigo);
                    vista.mostrarMensaje("Proveedor eliminado");
                    break;
                }

                case 0:
                    vista.mostrarMensaje("Saliendo del menú de proveedores...");
                    break;

                default:
                    vista.mostrarMensaje("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
