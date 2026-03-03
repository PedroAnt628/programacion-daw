
import java.sql.*;
import conexiones.Conexion;

public class sucursal {

    public static void insertar(int codigo, String telefono, String ciudad, String provincia, String direccion) {
        String sql = "INSERT INTO sucursal (codigo, telefono, ciudad, provincia, direccion) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.setString(2, telefono);
            ps.setString(3, ciudad);
            ps.setString(4, provincia);
            ps.setString(5, direccion);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void listar() {
        String sql = "SELECT * FROM sucursal";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo") + " - " +
                    rs.getString("ciudad") + " (" + rs.getString("provincia") + ")"
                );
            }

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void actualizar(int codigo, String nuevoTelefono, String nuevaDireccion) {
        String sql = "UPDATE sucursal SET telefono=?, direccion=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTelefono);
            ps.setString(2, nuevaDireccion);
            ps.setInt(3, codigo);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void borrar(int codigo) {
        String sql = "DELETE FROM sucursal WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }
}
