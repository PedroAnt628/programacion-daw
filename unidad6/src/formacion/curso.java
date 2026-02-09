package formacion;

import java.sql.*;
import conexiones.Conexion;

public class curso {

    public static void insertar(int id, String nombre, String descripcion, int duracion, double coste) {
        String sql = "INSERT INTO curso (id, nombre, descripcion, duracion, coste) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setInt(4, duracion);
            ps.setDouble(5, coste);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM curso";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("nombre") + " (" +
                    rs.getInt("duracion") + "h, " +
                    rs.getDouble("coste") + "€)"
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevoNombre, String nuevaDescripcion,
                                  int nuevaDuracion, double nuevoCoste) {
        String sql = "UPDATE curso SET nombre=?, descripcion=?, duracion=?, coste=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoNombre);
            ps.setString(2, nuevaDescripcion);
            ps.setInt(3, nuevaDuracion);
            ps.setDouble(4, nuevoCoste);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM curso WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

