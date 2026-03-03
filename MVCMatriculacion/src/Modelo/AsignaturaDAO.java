package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AsignaturaDAO {

    public static void insertar(Asignatura a) {
        String sql = "INSERT INTO Asignatura VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getNombre());
            ps.setInt(3, a.getNumeroHoras());
            ps.setInt(4, a.getIdProfesor());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM Asignatura";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getInt("numero_horas") + " - " +
                    rs.getInt("id_profesor")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int codigo, String nombre, int horas, int idProfesor) {
        String sql = "UPDATE Asignatura SET nombre=?, numero_horas=?, id_profesor=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, horas);
            ps.setInt(3, idProfesor);
            ps.setInt(4, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int codigo) {
        String sql = "DELETE FROM Asignatura WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
