package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FachadaBD {

    static Connection conexion;
    static String usuario = "root";
    static String password = "";
    static String host = "gustalibreros.no-ip.org";
    static String port = "3306";
    static String database = "colmovil_dwh";
    static String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
    static boolean estadoConexion = false;

    public FachadaBD() {
    }

    public void conectar() {
        try {
            // Se carga el driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver.");
        }

        try {
            // Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url, usuario, password);
            estadoConexion = true;
            System.out.println("Conexion Abierta");
        } catch (Exception e) {
            System.out.println("No se pudo abrir la bd.");
        }
    }

    public void cerrarConexion(String source) {

        try {
            System.out.println("Intentado Cerrar Conexion desde: " + source);
            if (estadoConexion) {
                System.out.println("Conexion Cerrada");
                conexion.close();
                estadoConexion = false;
            } else {
                System.out.println("Conexion No Cerrada");
            }

        } catch (Exception e) {
            System.out.println("No se pudo cerrar.");
        }
    }

    public ResultSet executeQuery(String sql) throws SQLException {

        if (!estadoConexion) {
            conectar();
        }
        System.out.println("QUERY: " + sql);
        Statement instruccion = conexion.createStatement();
        ResultSet resultSet = instruccion.executeQuery(sql);
        return resultSet;
    }

    public int executeUpdate(String sql) throws SQLException {
        if (!estadoConexion) {
            conectar();
        }
        System.out.println("UPDATE: " + sql);
        Statement instruccion = conexion.createStatement();
        int executeUpdate = instruccion.executeUpdate(sql);
        return executeUpdate;
    }

    public static void setDatabase(String database) {
        FachadaBD.database = database;
    }

    public static void setHost(String host) {
        FachadaBD.host = host;
    }

    public static void setPassword(String password) {
        FachadaBD.password = password;
    }

    public static void setPort(String port) {
        FachadaBD.port = port;
    }

    public static void setUsuario(String usuario) {
        FachadaBD.usuario = usuario;
    }

    public static void updateUrl() {
        FachadaBD.url = "jdbc:postgresql://" + host + ":" + port + "/" + database;;
    }
}