package libreria;

import java.sql.*;
import conexiones.Conexion;

public class autor_escribe_libro {

    public static void insertar(int idAutor, int idLibro) {

        String sql = "INSERT INTO autor_escribe_libro (id_autor, id_libro) VALUES (?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAutor);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM autor_escribe_libro";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Autor " + rs.getInt("id_autor") +
                    " escribe Libro " + rs.getInt("id_libro")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idAutor, int idLibro) {

        String sql = "DELETE FROM autor_escribe_libro WHERE id_autor=? AND id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAutor);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
