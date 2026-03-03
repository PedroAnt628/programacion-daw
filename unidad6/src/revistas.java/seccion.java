
import java.sql.*;
import conexiones.Conexion;

public class seccion {

    public static void insertar(int id, String titulo, int extension, int numeroRevista) {

        String sql = "INSERT INTO seccion (id, titulo, extension, numero_registro_revista) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, titulo);
            ps.setInt(3, extension);
            ps.setInt(4, numeroRevista);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void listar() {
        String sql = "SELECT * FROM seccion";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Sección " + rs.getInt("id") +
                    " - " + rs.getString("titulo")
                );
            }

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM seccion WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }
}
