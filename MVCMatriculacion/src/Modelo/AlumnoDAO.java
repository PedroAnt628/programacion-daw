package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoDAO {

    public static void insertar(Alumno a) {
        String sql = "INSERT INTO Alumno VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, a.getNumeroMatricula());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApellido1());
            ps.setString(4, a.getApellido2());
            ps.setDate(5, a.getFechaNacimiento());
            ps.setString(6, a.getTelefono());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM Alumno";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("numero_matricula") + " - " +
                    rs.getString("nombre") + " - " +
                    rs.getString("apellido1") + " - " +
                    rs.getString("apellido2") + " - " +
                    rs.getDate("fecha_nacimiento") + " - " +
                    rs.getString("telefono")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int matricula, String nombre, String apellido1,
                                  String apellido2, java.sql.Date fecha, String telefono) {
        String sql = "UPDATE Alumno SET nombre=?, apellido1=?, apellido2=?, fecha_nacimiento=?, telefono=? WHERE numero_matricula=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, apellido1);
            ps.setString(3, apellido2);
            ps.setDate(4, fecha);
            ps.setString(5, telefono);
            ps.setInt(6, matricula);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int matricula) {
        String sql = "DELETE FROM Alumno WHERE numero_matricula=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, matricula);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
