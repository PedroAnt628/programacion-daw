package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Vista.CategoriaVista;

public class CategoriaController {

    private CategoriaVista vista;

    public CategoriaController() {
        vista = new CategoriaVista();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {

                case 1:
                    CategoriaDAO.listar();
                    break;

                case 2: {
                    Categoria nueva = vista.pedirNuevaCategoria();
                    CategoriaDAO.insertar(nueva);
                    vista.mostrarMensaje("Categoría insertada");
                    break;
                }

                case 3: {
                    int codigo = vista.pedirIdActualizar();
                    String nuevoNombre = vista.pedirNuevoNombre();
                    CategoriaDAO.actualizar(codigo, nuevoNombre);
                    vista.mostrarMensaje("Categoría actualizada");
                    break;
                }

                case 4: {
                    int codigo = vista.pedirIdEliminar();
                    CategoriaDAO.borrar(codigo);
                    vista.mostrarMensaje("Categoría eliminada");
                    break;
                }

                case 0:
                    vista.mostrarMensaje("Saliendo...");
                    break;

                default:
                    vista.mostrarMensaje("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
