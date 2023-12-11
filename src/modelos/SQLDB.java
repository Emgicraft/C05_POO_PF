package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magh
 */
public class SQLDB {
    private String databaseName = "DB_ElectronicAds";
    private final String user = "sa";
    private final String password = "sa2996";
    private final String encrypt = "false";
    
    /**
     * Constructor vacío predeterminado.
     */
    public SQLDB() {}
    
    /**
     * Se específica el nombre de la base de datos a conectar.
     * 
     * @param nombreDB es el nombre de la base de datos.
     */
    public SQLDB(String nombreDB) {
        this.databaseName = nombreDB;
    }
    
    /**
     * Devuelve el objeto <code>Connection</code> en caso de establecerse 
     * la conexión, de lo contrario, será nulo.
     * 
     * @return <code>Connection</code> Instancia de conexión.
     */
    public Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName="+databaseName+";user="+user+";password="+password+";encrypt="+encrypt+";");
            System.out.println("SQL Server: Conexión exitosa.");
        } catch (SQLException ex) {
            System.err.println("SQL Server: Error de conexión!\n\t" + ex);
            Logger.getLogger(SQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    /**
     * Devuelve un arreglo unidimensional con los nombres de 
     * todas las tablas de la base de datos.
     * 
     * @return <code>ArrayList[String]</code> con el nombre de todas las tablas de la BD.
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public ArrayList<String> getNombreTablas() {
        ArrayList<String> nombreTablas = new ArrayList<>();
        String consultaSql = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'dbo'";
        Connection cn = conectar();
        PreparedStatement sentencia;
        
        try {
            String nmtb;
            sentencia = cn.prepareStatement(consultaSql);
            ResultSet res = sentencia.executeQuery(); // <-- SuppressWarnings
            while (res.next()) {
                nmtb = res.getString("TABLE_NAME");
                if (!nmtb.equals("sysdiagrams")) {nombreTablas.add(nmtb);}
            }
            res.close();
            sentencia.close();
            cn.close();
        } catch (SQLException ex) {
            System.err.println("SQL Server: Error al intentar obtener los nombres de las tablas.\n\t" + ex);
            Logger.getLogger(SQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nombreTablas;
    }
    
    /**
     * Devuelve un arreglo unidimensional con los nombres de 
     * todos las campos de una tabla en específico.
     * 
     * @param nombreTabla Nombre de la tabla.
     * @return <code>ArrayList[String]</code> con el nombre de todos los campos de 
     * la tabla especificada.
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public ArrayList<String> getCabeceraTabla(String nombreTabla) {
        ArrayList<String> cabeceraTabla = new ArrayList<>();
        String consultaSql = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = 'dbo' AND TABLE_NAME = '?'";
        Connection cn = conectar();
        PreparedStatement sentencia;
        
        try {
            sentencia = cn.prepareStatement(consultaSql);
            sentencia.setString(1, nombreTabla);
            ResultSet res = sentencia.executeQuery(); // <-- SuppressWarnings
            while (res.next()) {
                cabeceraTabla.add(res.getString("COLUMN_NAME"));
            }
            res.close();
            sentencia.close();
            cn.close();
        } catch (SQLException ex) {
            System.err.println("SQL Server: Error al intentar la cabecera de la tabla " + nombreTabla + ".\n\t" + ex);
            Logger.getLogger(SQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cabeceraTabla;
    }

    public String getDatabaseName() {
        return databaseName;
    }
}
