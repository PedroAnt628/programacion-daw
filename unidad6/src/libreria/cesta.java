package libreria;

import java.sql.*;
import conexiones.Conexion;

public class cesta {

    public static void insertar(int id, String fechaCompra, int idCliente) {

        String sql = "INSERT INTO cesta (id, fecha_compra, id_cliente) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, fechaCompra);
            ps.setInt(3, idCliente);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM cesta";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Cesta " + rs.getInt("id") +
                    " - Cliente: " + rs.getInt("id_cliente") +
                    " - Fecha: " + rs.getString("fecha_compra")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevaFecha, int nuevoCliente) {

        String sql = "UPDATE cesta SET fecha_compra=?, id_cliente=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevaFecha);
            ps.setInt(2, nuevoCliente);
            ps.setInt(3, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {

        String sql = "DELETE FROM cesta WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
