package actividadER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexiones.Conexion;

public class piezaDAO {
    // CREATE
    public static void insertar(int codigo, String nombre, String color, double precio, int categoria) {
    String sql = "INSERT INTO pieza VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, codigo);
    ps.setString(2, nombre);
    ps.setString(3, color);
    ps.setDouble(4, precio);
    ps.setInt(5, categoria);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static void listar() {
    String sql = "SELECT * FROM pieza";
    try (Connection conn = Conexion.getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql)) {
    while (rs.next()) {
    System.out.println(
    rs.getInt("codigo") + " - " + rs.getString("nombre") + " - " + rs.getString("color") + " - " + rs.getDouble("precio")
    );
    }
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // UPDATE
    public static void actualizar(int codigo, String nuevoNombre) {
    String sql = "UPDATE pieza SET nombre=? WHERE codigo=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, nuevoNombre);
    ps.setInt(2, codigo);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int codigo) {
    String sql = "DELETE FROM pieza WHERE codigo=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, codigo);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
}
}
