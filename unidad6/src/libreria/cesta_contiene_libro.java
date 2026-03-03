package libreria;

import java.sql.*;
import conexiones.Conexion;

public class cesta_contiene_libro {

    public static void insertar(int idCesta, int idLibro) {

        String sql = "INSERT INTO cesta_contiene_libro (id_cesta, id_libro) VALUES (?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idCesta);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM cesta_contiene_libro";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Cesta " + rs.getInt("id_cesta") +
                    " contiene Libro " + rs.getInt("id_libro")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idCesta, int idLibro) {

        String sql = "DELETE FROM cesta_contiene_libro WHERE id_cesta=? AND id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idCesta);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
