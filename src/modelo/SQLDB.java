package modelo;

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
    private final String databaseName = "DB_ElectronicAds";
    private final String user = "sa";
    private final String password = "Magh26";
    private final String encrypt = "false";
    
    public SQLDB() {}
    
    /**
     * Devuelve el objeto Connection en caso de establecerse la conexión, 
     * de lo contrario, será nulo.
     * 
     * @return Instancia de conexión.
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
}
