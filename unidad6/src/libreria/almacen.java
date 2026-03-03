package libreria;

import java.sql.*;
import conexiones.Conexion;

public class almacen {

    public static void insertar(int id, String telefono, String direccion, int idLocalidad) {

        String sql = "INSERT INTO almacen (id, telefono, direccion, id_localidad) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setInt(4, idLocalidad);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM almacen";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Almacén " + rs.getInt("id") +
                    " - Tel: " + rs.getString("telefono") +
                    " - Loc: " + rs.getInt("id_localidad")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevoTelefono, String nuevaDireccion, int nuevaLocalidad) {

        String sql = "UPDATE almacen SET telefono=?, direccion=?, id_localidad=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTelefono);
            ps.setString(2, nuevaDireccion);
            ps.setInt(3, nuevaLocalidad);
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {

        String sql = "DELETE FROM almacen WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
