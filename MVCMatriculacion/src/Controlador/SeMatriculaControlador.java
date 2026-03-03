package Controlador;

import Modelo.SeMatricula;
import Modelo.SeMatriculaDAO;
import Vista.SeMatriculaVista;

public class SeMatriculaControlador {

    private SeMatriculaVista vista;

    public SeMatriculaController() {
        vista = new SeMatriculaVista();
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    SeMatriculaDAO.listar();
                    break;

                case 2:
                    SeMatricula nueva = vista.pedirDatosNuevo();
                    SeMatriculaDAO.insertar(nueva);
                    vista.mostrarMensaje("Matrícula insertada");
                    break;

                case 3:
                    int mat = vista.pedirMatricula();
                    int idc = vista.pedirIdCurso();
                    int cod = vista.pedirCodigoAsignatura();
                    SeMatriculaDAO.borrar(mat, idc, cod);
                    vista.mostrarMensaje("Matrícula eliminada");
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
