import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import conexiones.Conexion;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        //String sql = "Create table if not exists personas (id int auto_increment primary key, nombre varchar(50), email varchar(50))";
        //try {

            // Connection conexion = Conexion.getConnection();
            // Statement stat = conexion.createStatement();
            // stat.executeUpdate(sql);

            //Crear personas
            // crearPersona("Juan Perez", "juan.perez@example.com");
            // crearPersona("Juan Luis", "juanlu@gmail.com");
            // crearPersona("Lozanillo", "lozavapers@gmai.com");
            System.out.println("Campo añadido");

            actualizarPersona(2, "soyretrasao@gmail.com");

            eliminarPersona(3);
            //Leemos los campoes de personas
            listarPersonas();



        // } catch (SQLException e) {
        //     System.err.println();
        // }
    }
    public static void crearPersona(String nombre, String email) {
        String sql = "INSERT INTO personas (nombre, email) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, nombre);
        ps.setString(2, email);
        ps.executeUpdate();
        System.out.println("Persona creada.");
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
    }
    public static void listarPersonas() {
        String sql = "SELECT * FROM personas";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
        System.out.println(
        rs.getInt("id") + ": " +
        rs.getString("nombre") + " - " +
        rs.getString("email"));
        }
        } catch (SQLException e) {
        System.err.println("Error al leer: " + e.getMessage());
        }
    }
    public static void actualizarPersona(int id, String nuevoEmail) {
        String sql = "UPDATE personas SET email = ? WHERE id = ?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, nuevoEmail);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Persona actualizada.");
        } catch (SQLException e) {
        System.err.println("Error al actualizar: " + e.getMessage());
        }
    }
    public static void eliminarPersona(int id) {
        String sql = "DELETE FROM personas WHERE id = ?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Persona eliminada.");
        } catch (SQLException e) {
        System.err.println("Error al borrar: " + e.getMessage());
        }
    }

    
}
