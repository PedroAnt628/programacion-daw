package formacion;

import java.sql.*;
import conexiones.Conexion;

public class edicion {

    public static void insertar(int id, String fechaInicio, String fechaFin, String horario, String lugar, int idCurso, int idEmpleadoImparte) {
        String sql = "INSERT INTO edicion (id, fecha_inicio, fecha_fin, horario, lugar, id_curso, id_empleado_imparte) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, fechaInicio);
            ps.setString(3, fechaFin);
            ps.setString(4, horario);
            ps.setString(5, lugar);
            ps.setInt(6, idCurso);
            ps.setInt(7, idEmpleadoImparte);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM edicion";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                    "Edición " + rs.getInt("id") +
                    " - Curso: " + rs.getInt("id_curso") +
                    " - Imparte: " + rs.getInt("id_empleado_imparte") +
                    " - Lugar: " + rs.getString("lugar")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevaFechaInicio, String nuevaFechaFin,
                                  String nuevoHorario, String nuevoLugar, int nuevoCurso,
                                  int nuevoEmpleadoImparte) {
        String sql = "UPDATE edicion SET fecha_inicio=?, fecha_fin=?, horario=?, lugar=?, id_curso=?, id_empleado_imparte=? WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevaFechaInicio);
            ps.setString(2, nuevaFechaFin);
            ps.setString(3, nuevoHorario);
            ps.setString(4, nuevoLugar);
            ps.setInt(5, nuevoCurso);
            ps.setInt(6, nuevoEmpleadoImparte);
            ps.setInt(7, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM edicion WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
