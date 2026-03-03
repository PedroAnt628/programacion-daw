
import java.sql.*;
import conexiones.Conexion;

public class ejemplar {

    public static void insertar(int id, String fecha, int paginas, int ejemplares, int numeroRevista) {

        String sql = "INSERT INTO ejemplar (id, fecha, numero_paginas, numero_ejemplares, numero_registro_revista) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, fecha);
            ps.setInt(3, paginas);
            ps.setInt(4, ejemplares);
            ps.setInt(5, numeroRevista);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void listar() {
        String sql = "SELECT * FROM ejemplar";
        try (Connection conn = Conexion.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Ejemplar " + rs.getInt("id") +
                    " - Fecha: " + rs.getString("fecha")
                );
            }

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }

    public static void borrar(int id) {
        String sql = "DELETE FROM ejemplar WHERE id=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }
}
