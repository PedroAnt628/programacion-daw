package libreria;

import java.sql.*;
import conexiones.Conexion;

public class libro {

    public static void insertar(int id, String isbn, String titulo, int anoPublicacion,
                                String descripcion, String tipo) {

        String sql = "INSERT INTO libro (id, isbn, titulo, ano_publicacion, descripcion, tipo) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, isbn);
            ps.setString(3, titulo);
            ps.setInt(4, anoPublicacion);
            ps.setString(5, descripcion);
            ps.setString(6, tipo);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {

        String sql = "SELECT * FROM libro";

        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Libro " + rs.getInt("id") +
                    " - " + rs.getString("titulo") +
                    " (" + rs.getString("tipo") + ")"
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int id, String nuevoTitulo, int nuevoAno, String nuevaDescripcion) {

        String sql = "UPDATE libro SET titulo=?, ano_publicacion=?, descripcion=? WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nuevoTitulo);
            ps.setInt(2, nuevoAno);
            ps.setString(3, nuevaDescripcion);
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int id) {

        String sql = "DELETE FROM libro WHERE id=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
