package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExamenTeoricoDAO {

    // CREATE
    public static void insertar(ExamenTeorico et) {
        String sql = "INSERT INTO examen_teorico VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, et.getId());
            ps.setString(2, et.getTitulo());
            ps.setInt(3, et.getNumeroPreguntas());
            ps.setString(4, et.getFecha());
            ps.setInt(5, et.getProfesorId());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static ArrayList<ExamenTeorico> listar() {

        ArrayList<ExamenTeorico> examenes = new ArrayList<>();
        String sql = "SELECT * FROM examen_teorico";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                examenes.add(new ExamenTeorico(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getInt("numero_preguntas"),
                    rs.getString("fecha"),
                    rs.getInt("profesor_id")
                ));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return examenes;
    }

    // UPDATE (solo actualiza el título, puedes añadir más si quieres)
    public static void actualizar(ExamenTeorico et) {

        String sql = "UPDATE examen_teorico SET titulo=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, et.getTitulo());
            ps.setInt(5, et.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int id) {

        String sql = "DELETE FROM examen_teorico WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
