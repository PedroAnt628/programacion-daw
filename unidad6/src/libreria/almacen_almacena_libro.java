package libreria;

import java.sql.*;
import conexiones.Conexion;

public class almacen_almacena_libro {

    public static void insertar(int idAlmacen, int idLibro) {

        String sql = "INSERT INTO almacen_almacena_libro (id_almacen, id_libro) VALUES (?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlmacen);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM almacen_almacena_libro";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Almacén " + rs.getInt("id_almacen") +
                    " almacena Libro " + rs.getInt("id_libro")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idAlmacen, int idLibro) {

        String sql = "DELETE FROM almacen_almacena_libro WHERE id_almacen=? AND id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlmacen);
            ps.setInt(2, idLibro);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
