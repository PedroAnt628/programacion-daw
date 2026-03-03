
import java.sql.*;
import conexiones.Conexion;

public class empleado {

    public static void insertar(int id, String nif, String nombre, String apellido1, String apellido2,
                                String telefono, int codigoSucursal) {

        String sql = "INSERT INTO empleado (id, nif, nombre, apellido1, apellido2, telefono, codigo_sucursal) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nif);
            ps.setString(3, nombre);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.setString(6, telefono);
            ps.setInt(7, codigoSucursal);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void listar() {
        String sql = "SELECT * FROM empleado";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " " + rs.getString("apellido1")
                );
            }

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void actualizar(int id, String nuevoTelefono) {
        String sql = "UPDATE empleado SET telefono=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTelefono);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM empleado WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }
}
