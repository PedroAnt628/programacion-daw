package formacion;

import java.sql.*;
import conexiones.Conexion;

public class empleado_capacitado {

    public static void insertar(int idEmpleado) {
        String sql = "INSERT INTO empleado_capacitado (id_empleado) VALUES (?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEmpleado);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idEmpleado) {
        String sql = "DELETE FROM empleado_capacitado WHERE id_empleado=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idEmpleado);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
