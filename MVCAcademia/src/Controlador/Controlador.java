package Controlador;


import Modelo.AlumnoDAO;
import Modelo.ProfesorDAO;
import Modelo.ExamenTeoricoDAO;
import Modelo.PracticaDAO;
import Vista.Vista;

public class Controlador {

    private AlumnoDAO alumnoDAO;
    private ProfesorDAO profesorDAO;
    private ExamenTeoricoDAO examenTeoricoDAO;
    private PracticaDAO practicaDAO;
    private Vista view;

    public Controlador() {
        alumnoDAO = new AlumnoDAO();
        profesorDAO = new ProfesorDAO();
        examenTeoricoDAO = new ExamenTeoricoDAO();
        practicaDAO = new PracticaDAO();
        view = new Vista();
    }
    public void iniciar() {
        int opcion;
        try{
            do {
                opcion = view.mostrarMenuPrincipal();
                switch (opcion) {
                    case 1: alumnoDAO.insertar(view.pedirNuevoAlumno()); break;
                    case 2: alumnoDAO.listar().forEach(view::mostrarAlumno); break;
                    case 3: alumnoDAO.borrar(view.eliminarAlumno()); break;
                    case 4: alumnoDAO.actualizar(view.actualizarAlumno()); break;
                    case 5: profesorDAO.insertar(view.pedirNuevoProfesor()); break;
                    case 6: profesorDAO.listar().forEach(view::mostrarProfesor); break;
                    case 7: profesorDAO.borrar(view.eliminarProfesor()); break;
                    case 8: profesorDAO.actualizar(view.actualizarProfesor()); break;
                    case 9: examenTeoricoDAO.insertar(view.pedirNuevoExamen()); break;
                    case 10: examenTeoricoDAO.listar().forEach(view::mostrarExamen); break;
                    case 11: examenTeoricoDAO.borrar(view.eliminarExamen()); break;
                    case 12: examenTeoricoDAO.actualizar(view.actualizarExamen()); break;
                    case 13: practicaDAO.insertar(view.pedirNuevaPractica()); break;
                    case 14: practicaDAO.listar().forEach(view::mostrarPractica); break;
                    case 15: practicaDAO.borrar(view.eliminarPractica()); break;
                    case 16: practicaDAO.actualizar(view.actualizarPractica()); break;
                    
                    case 0: view.mostrarMensaje("Saliendo..."); break;
                    default: view.mostrarMensaje("Opción incorrecta"); break;
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }
}
