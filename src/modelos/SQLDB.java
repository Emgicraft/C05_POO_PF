package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
            System.out.println("SQL Server: Error de conexión!\n\t"+ex);
            Logger.getLogger(SQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    /**
     * Devuelve un arreglo unidimensional con los nombres de 
     * todas las tablas de la base de datos.
     * 
     * @return <code>String[]</code> con el nombre de todas las tablas de la BD.
     */
    public String[] getNombreTablas() {
        String[] nombreTablas = {"1", "2"};
        return nombreTablas;
    }
    
    /**
     * Devuelve un arreglo unidimensional con los nombres de 
     * todos las campos de una tabla en específico.
     * 
     * @param nombreTabla Nombre de la tabla.
     * @return <code>String[]</code> con el nombre de todos los campos de 
     * la tabla especificada.
     */
    public String[] getCabeceraTabla(String nombreTabla) {
        String[] cabeceraTabla = {nombreTabla};
        return cabeceraTabla;
    }
}
