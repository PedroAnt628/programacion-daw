package libreria;

import java.sql.*;
import conexiones.Conexion;

public class cliente {

    public static void insertar(int id, String apellido1, String apellido2, String nombre,
                                String direccion, String email, String telefono, int idLocalidad) {

        String sql = "INSERT INTO cliente (id, apellido1, apellido2, nombre, direccion, email, telefono, id_localidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, apellido1);
            ps.setString(3, apellido2);
            ps.setString(4, nombre);
            ps.setString(5, direccion);
            ps.setString(6, email);
            ps.setString(7, telefono);
            ps.setInt(8, idLocalidad);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM cliente";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " " +
                    rs.getString("apellido1") + " (" +
                    rs.getString("email") + ")"
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevoEmail, String nuevoTelefono, int nuevaLocalidad) {
        String sql = "UPDATE cliente SET email=?, telefono=?, id_localidad=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoEmail);
            ps.setString(2, nuevoTelefono);
            ps.setInt(3, nuevaLocalidad);
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM cliente WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
