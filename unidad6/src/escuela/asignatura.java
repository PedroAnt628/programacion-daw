package escuela;

import java.sql.*;
import conexiones.Conexion;

public class asignatura {

    // CREATE
    public static void insertar(int codigo, String nombre, int numeroHoras, int idProfesor) {

        String sql = "INSERT INTO asignatura (codigo, nombre, numero_horas, id_profesor) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, numeroHoras);
            ps.setInt(4, idProfesor);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {

        String sql = "SELECT * FROM asignatura";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo") + " - " +
                    rs.getString("nombre") + " (" +
                    rs.getInt("numero_horas") + "h) - Profesor: " +
                    rs.getInt("id_profesor")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizarProfesor(int codigo, int nuevoProfesor) {

        String sql = "UPDATE asignatura SET id_profesor=? WHERE codigo=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevoProfesor);
            ps.setInt(2, codigo);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo) {

        String sql = "DELETE FROM asignatura WHERE codigo=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
