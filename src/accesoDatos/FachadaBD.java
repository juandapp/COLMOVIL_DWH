/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;
//~--- JDK imports ------------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FachadaBD {

    Connection conexion;
    Statement instruccion;
    static String usuario = "root";
    static String password = "";
    static String host = "gustalibreros.no-ip.org";
    static String port = "3306";
    static String database = "colmovil_dwh";
    static String url = "jdbc:mysql://" + host + ":" + port + "/" + database;

    public FachadaBD() {
    }

    private void conectar() {

        try {
            // Se carga el driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver.");
        }

        try {
            // Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url, usuario, password);
            instruccion = conexion.createStatement();
            System.out.println("Conexion Abierta");
        } catch (Exception e) {
            System.out.println("No se pudo abrir la bd.");
        }
    }

    public void cerrarConexion() {

        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo cerrar.");
        }
    }

    public ResultSet executeQuery(String sql) throws SQLException {

        conectar();
        ResultSet resultSet = instruccion.executeQuery(sql);
        return resultSet;
    }

    public int executeUpdate(String sql) throws SQLException {
        conectar();
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