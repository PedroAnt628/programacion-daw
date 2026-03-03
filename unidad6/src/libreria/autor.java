package libreria;

import java.sql.*;
import conexiones.Conexion;

public class autor {

    public static void insertar(int id, String apellido1, String apellido2, String nombre,
                                String url, String telefono, String direccion, int idLocalidad) {

        String sql = "INSERT INTO autor (id, apellido1, apellido2, nombre, url, telefono, direccion, id_localidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, apellido1);
            ps.setString(3, apellido2);
            ps.setString(4, nombre);
            ps.setString(5, url);
            ps.setString(6, telefono);
            ps.setString(7, direccion);
            ps.setInt(8, idLocalidad);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM autor";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " " +
                    rs.getString("apellido1") +
                    " (" + rs.getString("url") + ")"
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevoTelefono, String nuevaDireccion, String nuevaUrl) {
        String sql = "UPDATE autor SET telefono=?, direccion=?, url=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTelefono);
            ps.setString(2, nuevaDireccion);
            ps.setString(3, nuevaUrl);
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM autor WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
