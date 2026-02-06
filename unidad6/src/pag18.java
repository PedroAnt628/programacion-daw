


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexiones.Conexion;

public class pag18 {
    public static void main(String[] args) {
        actualizarJugador(666, "Spain");

        crearJugador(677,"Lozanillo", "Spain", "6-9", 190, "C");

        eliminarJugador(1000);

        listarJugador();
    }

    public static void listarJugador() {
        String sql = "SELECT * FROM jugadores where Procedencia='Spain' and Nombre_Equipo='Lakers'";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
        System.out.println(
        rs.getInt("codigo") + ": " +
        rs.getString("Nombre") + " - " +
        rs.getString("Procedencia") + " - " + 
        rs.getString("Nombre_Equipo"));
        }
        } catch (SQLException e) {
        System.err.println("Error al leer: " + e.getMessage());
        }
    }

    public static void actualizarJugador(int id, String Procedencia) {
        String sql = "UPDATE jugadores SET Procedencia = ? WHERE codigo = ?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, Procedencia);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Persona actualizada.");
        } catch (SQLException e) {
        System.err.println("Error al actualizar: " + e.getMessage());
        }
    }

    public static void crearJugador(int codigo,String Nombre, String Procedencia, String Altura, int Peso, String Posicion) {
        String sql = "INSERT INTO jugadores (codigo, Nombre, Procedencia, Altura, Peso, Posicion) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, codigo);
        ps.setString(2, Nombre);
        ps.setString(3, Procedencia);
        ps.setString(4, Altura);
        ps.setInt(5, Peso);
        ps.setString(6, Posicion);
        ps.executeUpdate();
        System.out.println("Jugador creado.");
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
    }

    public static void eliminarJugador(int codigo) {
        String sql = "DELETE FROM jugadores WHERE codigo = ?";
        try (Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, codigo);
        ps.executeUpdate();
        System.out.println("Jugador eliminadao.");
        } catch (SQLException e) {
        System.err.println("Error al borrar: " + e.getMessage());
        }
    }
}
