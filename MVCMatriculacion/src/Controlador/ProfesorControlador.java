package Controlador;

import Modelo.Profesor;
import Modelo.ProfesorDAO;
import Vista.ProfesorVista;

public class ProfesorControlador {

    private ProfesorVista vista;

    public ProfesorController() {
        vista = new ProfesorVista();
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    ProfesorDAO.listar();
                    break;

                case 2:
                    Profesor nuevo = vista.pedirDatosNuevo();
                    ProfesorDAO.insertar(nuevo);
                    vista.mostrarMensaje("Profesor insertado");
                    break;

                case 3:
                    int id = vista.pedirId();
                    String nom = vista.pedirNuevoNombre();
                    String a1 = vista.pedirNuevoApellido1();
                    String a2 = vista.pedirNuevoApellido2();
                    String esp = vista.pedirNuevaEspecialidad();
                    String tel = vista.pedirNuevoTelefono();
                    ProfesorDAO.actualizar(id, nom, a1, a2, esp, tel);
                    vista.mostrarMensaje("Profesor actualizado");
                    break;

                case 4:
                    int ide = vista.pedirId();
                    ProfesorDAO.borrar(ide);
                    vista.mostrarMensaje("Profesor eliminado");
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
