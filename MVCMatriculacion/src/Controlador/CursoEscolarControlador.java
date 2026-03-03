package Controlador;

import Modelo.CursoEscolar;
import Modelo.CursoEscolarDAO;
import Vista.CursoEscolarVista;

public class CursoEscolarControlador {

    private CursoEscolarVista vista;

    public CursoEscolarController() {
        vista = new CursoEscolarVista();
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    CursoEscolarDAO.listar();
                    break;

                case 2:
                    CursoEscolar nuevo = vista.pedirDatosNuevo();
                    CursoEscolarDAO.insertar(nuevo);
                    vista.mostrarMensaje("Insertado correctamente");
                    break;

                case 3:
                    int id = vista.pedirId();
                    int ai = vista.pedirNuevoAnioInicio();
                    int af = vista.pedirNuevoAnioFin();
                    CursoEscolarDAO.actualizar(id, ai, af);
                    vista.mostrarMensaje("Actualizado correctamente");
                    break;

                case 4:
                    int ide = vista.pedirId();
                    CursoEscolarDAO.borrar(ide);
                    vista.mostrarMensaje("Eliminado correctamente");
                    break;

                case 0:
                    vista.mostrarMensaje("Volviendo...");
                    break;

                default:
                    vista.mostrarMensaje("Opción incorrecta");
            }

        } while (opcion != 0);
    }
}
