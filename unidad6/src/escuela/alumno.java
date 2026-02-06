package escuela;

import java.sql.*;
import conexiones.Conexion;

public class alumno {

    // CREATE
    public static void insertar(int numeroMatricula, String nombre, String apellido1, String apellido2, String fechaNacimiento, String telefono) {

        String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numeroMatricula);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, fechaNacimiento);
            ps.setString(6, telefono);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {

        String sql = "SELECT * FROM alumno";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("numero_matricula") + " - " +
                    rs.getString("nombre") + " " + rs.getString("apellido1")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizarTelefono(int numeroMatricula, String nuevoTelefono) {

        String sql = "UPDATE alumno SET telefono=? WHERE numero_matricula=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTelefono);
            ps.setInt(2, numeroMatricula);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int numeroMatricula) {

        String sql = "DELETE FROM alumno WHERE numero_matricula=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, numeroMatricula);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
