package evaluacion_academica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexiones.Conexion;

public class realiza {

    // CREATE
    public static void insertar(int idAlumno, int idPractica, String fecha, double nota) {

        String sql = "INSERT INTO realiza VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idPractica);
            ps.setString(3, fecha);   // formato YYYY-MM-DD
            ps.setDouble(4, nota);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {

        String sql = "SELECT * FROM realiza";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Alumno " + rs.getInt("id_alumno") +
                    " - Práctica " + rs.getInt("id_practica") +
                    " - Fecha: " + rs.getString("fecha") +
                    " - Nota: " + rs.getDouble("nota")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE (ejemplo: actualizar nota)
    public static void actualizarNota(int idAlumno, int idPractica, double nuevaNota) {

        String sql = "UPDATE realiza SET nota=? WHERE id_alumno=? AND id_practica=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, nuevaNota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idPractica);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int idAlumno, int idPractica) {

        String sql = "DELETE FROM realiza WHERE id_alumno=? AND id_practica=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idPractica);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
