package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProveedorDAO {

    public static void insertar(Proveedor p) {
        String sql = "INSERT INTO proveedor VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getCiudad());
            ps.setString(3, p.getDireccion());
            ps.setString(4, p.getProvincia());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM proveedor";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo") + " - " +
                    rs.getString("ciudad") + " - " +
                    rs.getString("direccion") + " - " +
                    rs.getString("provincia")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int codigo, String ciudad, String direccion, String provincia) {
        String sql = "UPDATE proveedor SET ciudad=?, direccion=?, provincia=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, ciudad);
            ps.setString(2, direccion);
            ps.setString(3, provincia);
            ps.setInt(4, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int codigo) {
        String sql = "DELETE FROM proveedor WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
