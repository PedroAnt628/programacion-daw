package evaluacion_academica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexiones.Conexion;

public class alumno {
    // CREATE
    public static void insertar(int id, String nif, String nombre, String apellido1, String apellido2, String grupo) {
    String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id);
    ps.setString(2, nif);
    ps.setString(3, nombre);
    ps.setString(4, apellido1);
    ps.setString(5, apellido2);
    ps.setString(6, grupo);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static void listar() {
    String sql = "SELECT * FROM alumno";
    try (Connection conn = Conexion.getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql)) {
    while (rs.next()) {
    System.out.println(
    rs.getInt("id") + " - " + rs.getString("nombre")
    );
    }
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // UPDATE
    public static void actualizar(int id, String nuevoNombre) {
    String sql = "UPDATE alumno SET nombre=? WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, nuevoNombre);
    ps.setInt(2, id);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id) {
    String sql = "DELETE FROM alumno WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
}
