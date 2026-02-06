import actividadER.categoriaDAO;
import actividadER.piezaDAO;

public class actividaER {
    public static void main(String[] args) {

        //Categorias
        //Insertar
        // categoriaDAO.insertar(1, "Herramientas");
        // categoriaDAO.insertar(2, "Juguetes");
        // categoriaDAO.insertar(3, "Borrar");

        //Actualizar
        categoriaDAO.actualizar(2, "Hardware");

        //Borrar
        categoriaDAO.borrar(3);

        //Listar
        categoriaDAO.listar();

        //Piezas
        //Insertar
        piezaDAO.insertar(1, "Martillo", "Rojo", 7.5, 1);
        piezaDAO.insertar(2, "Coche", "Verde", 2.5, 2);
        piezaDAO.insertar(3, "Photoshop", "Azul", 22.5, 2);

        //Actualizar
        // piezaDAO.actualizar(3, "Lapiz");
        // //Borrar
        // categoriaDAO.borrar(2);

        // //Listar
        // categoriaDAO.listar();
    }
}
