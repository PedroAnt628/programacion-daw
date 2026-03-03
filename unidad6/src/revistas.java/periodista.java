
import java.sql.*;
import conexiones.Conexion;

public class periodista {

    public static void insertar(int id, String nombre, String apellido1, String apellido2,
                                String telefono, String especialidad) {

        String sql = "INSERT INTO periodista (id, nombre, apellido1, apellido2, telefono, especialidad) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, telefono);
            ps.setString(6, especialidad);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void listar() {
        String sql = "SELECT * FROM periodista";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " + rs.getString("nombre")
                );
            }

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void actualizar(int id, String nuevoTelefono) {
        String sql = "UPDATE periodista SET telefono=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTelefono);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM periodista WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }
}
