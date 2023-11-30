package tiendaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conectar = null;
    private String usuario = "root";
    private String contraseña = "";
    private String bd = "tiendaaba";
    private String ip = "localhost";
    private String puerto = "3306";
    private String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    // Constructor para crear una instancia de Conexion
    public Conexion() {
    }

    // Método para obtener una conexión
    public Connection establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            System.out.println("La conexión se ha realizado con éxito");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectarse a la Base de Datos: " + e.toString());
        }
        return conectar;
    }
    public void cerrarConexion() {
    try {
        if (conectar != null && !conectar.isClosed()) {
            conectar.close();
            System.out.println("La conexión se ha cerrado correctamente");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    // Eliminamos el método cerrarConexion()
    
    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        // Establecer la conexión
        Connection connection = conexion.establecerConexion();

        // Realizar operaciones con la conexión (opcional)

        // No cerramos la conexión aquí
    }
   
}
