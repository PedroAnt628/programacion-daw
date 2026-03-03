package libreria;

import java.sql.*;
import conexiones.Conexion;

public class papel {

    public static void insertar(int idLibro, String fechaImpresion, String lugarImpresion, double precio) {

        String sql = "INSERT INTO papel (id_libro, fecha_impresion, lugar_impresion, precio) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idLibro);
            ps.setString(2, fechaImpresion);
            ps.setString(3, lugarImpresion);
            ps.setDouble(4, precio);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM papel";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Papel Libro " + rs.getInt("id_libro") +
                    " - Impreso en: " + rs.getString("lugar_impresion") +
                    " - Precio: " + rs.getDouble("precio")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idLibro) {

        String sql = "DELETE FROM papel WHERE id_libro=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idLibro);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
