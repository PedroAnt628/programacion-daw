package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DisenaDAO {

    // CREATE
    public static void insertar(Disena d) {

        String sql = "INSERT INTO diseña_practica (id_profesor, id_practica, fecha) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, d.getProfesorId());
            ps.setInt(2, d.getPracticaId());
            ps.setInt(3, d.getExamenId());
            ps.setString(4, d.getFecha());   // formato YYYY-MM-DD

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ
    public static void listar() {

        String sql = "SELECT * FROM diseña_practica";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Profesor " + rs.getInt("id_profesor") +
                    " - Práctica " + rs.getInt("id_practica") +
                    " - Fecha: " + rs.getString("fecha")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE (actualizar fecha)
    public static void actualizarFecha(int idProfesor, int idPractica, String nuevaFecha) {

        String sql = "UPDATE diseña_practica SET fecha=? WHERE id_profesor=? AND id_practica=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevaFecha);
            ps.setInt(2, idProfesor);
            ps.setInt(3, idPractica);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int idProfesor, int idPractica) {

        String sql = "DELETE FROM diseña_practica WHERE id_profesor=? AND id_practica=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idProfesor);
            ps.setInt(2, idPractica);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
