package evaluacion_academica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexiones.Conexion;

public class hace {

    // CREATE
    public static void insertar(int idAlumno, int idExamen, double nota) {

        String sql = "INSERT INTO hace (id_alumno, id_examen, nota) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idExamen);
            ps.setDouble(3, nota);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {

        String sql = "SELECT * FROM hace";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Alumno " + rs.getInt("id_alumno") +
                    " - Examen " + rs.getInt("id_examen") +
                    " - Nota: " + rs.getDouble("nota")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE (actualizar nota)
    public static void actualizarNota(int idAlumno, int idExamen, double nuevaNota) {

        String sql = "UPDATE hace SET nota=? WHERE id_alumno=? AND id_examen=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, nuevaNota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idExamen);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int idAlumno, int idExamen) {

        String sql = "DELETE FROM hace WHERE id_alumno=? AND id_examen=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idExamen);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
