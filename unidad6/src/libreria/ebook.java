package libreria;

import java.sql.*;
import conexiones.Conexion;

public class ebook {

    public static void insertar(int idLibro, int tamano, double precio) {

        String sql = "INSERT INTO ebook (id_libro, tamano, precio) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idLibro);
            ps.setInt(2, tamano);
            ps.setDouble(3, precio);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM ebook";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Ebook Libro " + rs.getInt("id_libro") +
                    " - Tamaño: " + rs.getInt("tamano") +
                    "MB - Precio: " + rs.getDouble("precio")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idLibro) {

        String sql = "DELETE FROM ebook WHERE id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idLibro);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
