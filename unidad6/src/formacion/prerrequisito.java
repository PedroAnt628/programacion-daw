package formacion;

import java.sql.*;
import conexiones.Conexion;

public class prerrequisito {

    public static void insertar(int idCurso, int idCursoReq, boolean obligatorio) {
        String sql = "INSERT INTO prerrequisito (id_curso, id_curso_requerido, es_obligatorio) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idCurso);
            ps.setInt(2, idCursoReq);
            ps.setBoolean(3, obligatorio);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM prerrequisito";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    "Curso " + rs.getInt("id_curso") +
                    " requiere " + rs.getInt("id_curso_requerido") +
                    " (obligatorio: " + rs.getBoolean("es_obligatorio") + ")"
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int idCurso, int idCursoReq) {
        String sql = "DELETE FROM prerrequisito WHERE id_curso=? AND id_curso_requerido=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idCurso);
            ps.setInt(2, idCursoReq);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
