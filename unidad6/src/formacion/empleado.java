package formacion;

import java.sql.*;
import conexiones.Conexion;

public class empleado {

    public static void insertar(int id, String nombre, String apellido1, String apellido2, String telefono, String direccion, String tipo) {
        String sql = "INSERT INTO empleado (id, nombre, apellido1, apellido2, telefono, direccion, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
            ps.setString(7, tipo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM empleado";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " " + rs.getString("apellido1") +
                    " (" + rs.getString("tipo") + ")"
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevoTelefono, String nuevaDireccion, String nuevoTipo) {
        String sql = "UPDATE empleado SET telefono=?, direccion=?, tipo=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoTelefono);
            ps.setString(2, nuevaDireccion);
            ps.setString(3, nuevoTipo);
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM empleado WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
