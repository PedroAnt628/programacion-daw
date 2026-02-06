package escuela;

import java.sql.*;
import conexiones.Conexion;

public class curso_escolar {

    // CREATE
    public static void insertar(int id, int anoInicio, int anoFin) {

        String sql = "INSERT INTO curso_escolar VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setInt(2, anoInicio);
            ps.setInt(3, anoFin);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {

        String sql = "SELECT * FROM curso_escolar";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " - " +
                    rs.getInt("ano_inicio") + "/" + rs.getInt("ano_fin")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizarFin(int id, int nuevoAnoFin) {

        String sql = "UPDATE curso_escolar SET ano_fin=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevoAnoFin);
            ps.setInt(2, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int id) {

        String sql = "DELETE FROM curso_escolar WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
