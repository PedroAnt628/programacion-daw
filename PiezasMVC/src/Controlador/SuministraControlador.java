package Controlador;

import Modelo.Suministra;
import Modelo.SuministraDAO;
import Vista.SuministraVista;

public class SuministraControlador {

    private SuministraVista vista;

    public SuministraControlador() {
        vista = new SuministraVista();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {

                case 1:
                    SuministraDAO.listar();
                    break;

                case 2: {
                    Suministra nuevo = vista.pedirNuevoSuministro();
                    SuministraDAO.insertar(nuevo);
                    vista.mostrarMensaje("Suministro insertado");
                    break;
                }

                case 3: {
                    int codProv = vista.pedirCodProveedor();
                    int codPieza = vista.pedirCodPieza();
                    int cantidad = vista.pedirNuevaCantidad();
                    java.sql.Date fecha = vista.pedirNuevaFecha();
                    SuministraDAO.actualizar(codProv, codPieza, cantidad, fecha);
                    vista.mostrarMensaje("Suministro actualizado");
                    break;
                }

                case 4: {
                    int codProv = vista.pedirCodProveedor();
                    int codPieza = vista.pedirCodPieza();
                    SuministraDAO.borrar(codProv, codPieza);
                    vista.mostrarMensaje("Suministro eliminado");
                    break;
                }

                case 0:
                    vista.mostrarMensaje("Saliendo del menú de suministros...");
                    break;

                default:
                    vista.mostrarMensaje("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
