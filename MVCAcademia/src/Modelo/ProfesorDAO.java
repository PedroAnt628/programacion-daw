package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProfesorDAO {
    // CREATE
    public static void insertar(Profesor p) {
    String sql = "INSERT INTO profesor VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, p.getId());
    ps.setString(2, p.getNif());
    ps.setString(3, p.getNombre());
    ps.setString(4, p.getApellido1());
    ps.setString(5, p.getApellido2());
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // READ (SELECT)
    public static ArrayList<Profesor> listar() {
        ArrayList<Profesor> profesores = new ArrayList<>();
        String sql = "SELECT * FROM profesor";
        try (Connection conn = Conexion.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            profesores.add(new Profesor(
                rs.getInt("id"),
                rs.getString("nif"),
                rs.getString("nombre"),
                rs.getString("apellido1"),
                rs.getString("apellido2")
            ));
        }
        } catch (SQLException e) {
        System.err.println(e.getMessage());
        }
        return profesores;
    }
    // UPDATE
    public static void actualizar(Profesor p) {
    String sql = "UPDATE profesor SET nombre=? WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setString(1, p.getNombre());
    ps.setInt(2, p.getId());
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
    // DELETE
    public static void borrar(int id) {
    String sql = "DELETE FROM profesor WHERE id=?";
    try (Connection conn = Conexion.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql)) {
    ps.setInt(1, id);
    ps.executeUpdate();
    } catch (SQLException e) {
    System.err.println(e.getMessage());
    }
    }
}