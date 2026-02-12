package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SuministraDAO {

    public static void insertar(Suministra s) {
        String sql = "INSERT INTO suministra VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, s.getCodigoProveedor());
            ps.setInt(2, s.getCodigoPieza());
            ps.setInt(3, s.getCantidad());
            ps.setDate(4, s.getFecha());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void listar() {
        String sql = "SELECT * FROM suministra";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("codigo_proveedor") + " - " +
                    rs.getInt("codigo_pieza") + " - " +
                    rs.getInt("cantidad") + " - " +
                    rs.getDate("fecha")
                );
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void actualizar(int codProv, int codPieza, int cantidad, java.sql.Date fecha) {
        String sql = "UPDATE suministra SET cantidad=?, fecha=? WHERE codigo_proveedor=? AND codigo_pieza=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, cantidad);
            ps.setDate(2, fecha);
            ps.setInt(3, codProv);
            ps.setInt(4, codPieza);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void borrar(int codProv, int codPieza) {
        String sql = "DELETE FROM suministra WHERE codigo_proveedor=? AND codigo_pieza=?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, codProv);
            ps.setInt(2, codPieza);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
