package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SeMatriculaDAO {

    public static void insertar(SeMatricula s) {
        String sql = "INSERT INTO SeMatricula VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, s.getNumeroMatricula());
            ps.setInt(2, s.getIdCurso());
            ps.setInt(3, s.getCodigoAsignatura());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM SeMatricula";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("numero_matricula") + " - " +
                    rs.getInt("id_curso") + " - " +
                    rs.getInt("codigo_asignatura")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int matricula, int idCurso, int codigoAsignatura) {
        String sql = "DELETE FROM SeMatricula WHERE numero_matricula=? AND id_curso=? AND codigo_asignatura=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, matricula);
            ps.setInt(2, idCurso);
            ps.setInt(3, codigoAsignatura);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
