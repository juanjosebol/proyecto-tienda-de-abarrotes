package tiendaa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import tiendaa.datos.usuario;

public class metodousu {

public static int InsertarUsuario(usuario x) {
    Conexion conexion = new Conexion();
    Connection cn = conexion.establecerConexion();
    PreparedStatement ps = null;

    String sql = "INSERT INTO usuario (nombre, direccion, telefono, usuario, pass) VALUES (?, ?, ?, ?, ?)";

    try {
        ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, x.getNombre());
        ps.setString(2, x.getDireccion());
        ps.setString(3, x.getTelefono());
        ps.setString(4, x.getUsuario());
        ps.setString(5, x.getPass());
        int affectedRows = ps.executeUpdate();

        // Obtener el valor AUTO_INCREMENT generado para idusuario
        ResultSet generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) {
            int idUsuarioGenerado = generatedKeys.getInt(1);
            System.out.println("ID del usuario generado: " + idUsuarioGenerado);
        }

        return affectedRows;
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        conexion.cerrarConexion();
    }

    // Devolver un valor negativo para indicar error
    return -1;
}



    public static boolean Autenticacion(String Puser, String Ppsw) {
        Conexion conexion = new Conexion();
        Connection cn = conexion.establecerConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT usuario, pass FROM usuario WHERE usuario=? AND pass=?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, Puser);
            ps.setString(2, Ppsw);
            rs = ps.executeQuery();

            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conexion.cerrarConexion();
        }

        return false;
    }
}
