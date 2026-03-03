package libreria;

import java.sql.*;
import conexiones.Conexion;

public class editorial_publica_libro {

    public static void insertar(int idEditorial, int idLibro) {

        String sql = "INSERT INTO editorial_publica_libro (id_editorial, id_libro) VALUES (?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEditorial);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM editorial_publica_libro";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Editorial " + rs.getInt("id_editorial") +
                    " publica Libro " + rs.getInt("id_libro")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idEditorial, int idLibro) {

        String sql = "DELETE FROM editorial_publica_libro WHERE id_editorial=? AND id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idEditorial);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
