package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoDAO;
import Vista.AlumnoVista;

public class AlumnoControlador {

    private AlumnoVista vista;

    public AlumnoController() {
        vista = new AlumnoVista();
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    AlumnoDAO.listar();
                    break;

                case 2:
                    Alumno nuevo = vista.pedirDatosNuevo();
                    AlumnoDAO.insertar(nuevo);
                    vista.mostrarMensaje("Alumno insertado");
                    break;

                case 3:
                    int mat = vista.pedirMatricula();
                    String nom = vista.pedirNuevoNombre();
                    String a1 = vista.pedirNuevoApellido1();
                    String a2 = vista.pedirNuevoApellido2();
                    java.sql.Date fn = vista.pedirNuevaFecha();
                    String tel = vista.pedirNuevoTelefono();
                    AlumnoDAO.actualizar(mat, nom, a1, a2, fn, tel);
                    vista.mostrarMensaje("Alumno actualizado");
                    break;

                case 4:
                    int mate = vista.pedirMatricula();
                    AlumnoDAO.borrar(mate);
                    vista.mostrarMensaje("Alumno eliminado");
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
