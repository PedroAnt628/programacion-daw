package libreria;

import java.sql.*;
import conexiones.Conexion;

public class editorial {

    public static void insertar(int id, String nombre, String direccion, String telefono,
                                String url, int idLocalidad) {

        String sql = "INSERT INTO editorial (id, nombre, direccion, telefono, url, id_localidad) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, direccion);
            ps.setString(4, telefono);
            ps.setString(5, url);
            ps.setInt(6, idLocalidad);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM editorial";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " (" +
                    rs.getString("telefono") + ")"
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevaDireccion, String nuevoTelefono, String nuevaUrl) {

        String sql = "UPDATE editorial SET direccion=?, telefono=?, url=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevaDireccion);
            ps.setString(2, nuevoTelefono);
            ps.setString(3, nuevaUrl);
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {

        String sql = "DELETE FROM editorial WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
