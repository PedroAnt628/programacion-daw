
import java.sql.*;
import conexiones.Conexion;

public class revista {

    public static void insertar(int numeroRegistro, String titulo, String tipo, String periodicidad) {

        String sql = "INSERT INTO revista (numero_registro, titulo, tipo, periodicidad) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, numeroRegistro);
            ps.setString(2, titulo);
            ps.setString(3, tipo);
            ps.setString(4, periodicidad);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void listar() {
        String sql = "SELECT * FROM revista";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("numero_registro") + " - " + rs.getString("titulo")
                );
            }

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void actualizar(int numeroRegistro, String nuevoTitulo) {
        String sql = "UPDATE revista SET titulo=? WHERE numero_registro=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTitulo);
            ps.setInt(2, numeroRegistro);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void borrar(int numeroRegistro) {
        String sql = "DELETE FROM revista WHERE numero_registro=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, numeroRegistro);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }
}
