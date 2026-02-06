package escuela;

import java.sql.*;
import conexiones.Conexion;

public class se_matricula {

    // CREATE
    public static void insertar(int idAlumno, int idCurso, int codigoAsignatura) {

        String sql = "INSERT INTO se_matricula VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idCurso);
            ps.setInt(3, codigoAsignatura);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {

        String sql = "SELECT * FROM se_matricula";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Alumno " + rs.getInt("id_alumno") +
                    " - Curso " + rs.getInt("id_curso") +
                    " - Asignatura " + rs.getInt("codigo_asignatura")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int idAlumno, int idCurso, int codigoAsignatura) {

        String sql = "DELETE FROM se_matricula WHERE id_alumno=? AND id_curso=? AND codigo_asignatura=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idCurso);
            ps.setInt(3, codigoAsignatura);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
