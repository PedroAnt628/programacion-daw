package formacion;

import java.sql.*;
import conexiones.Conexion;

public class recibe {

    public static void insertar(int idEmpleado, int idEdicion) {
        String sql = "INSERT INTO recibe (id_empleado, id_edicion) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEmpleado);
            ps.setInt(2, idEdicion);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM recibe";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    "Empleado " + rs.getInt("id_empleado") +
                    " recibe edición " + rs.getInt("id_edicion")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idEmpleado, int idEdicion) {
        String sql = "DELETE FROM recibe WHERE id_empleado=? AND id_edicion=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEmpleado);
            ps.setInt(2, idEdicion);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
