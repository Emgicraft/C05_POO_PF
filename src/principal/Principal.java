package principal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.SQLDB;
import vista.FrmLogin;
import vista.FrmPrincipal;
import vista.FrmProducto;

/**
 *
 * @author Magh
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SQLDB sql = new SQLDB();
        Connection con = sql.conectar();
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // ***** FORMULARIOS *****
        // Instanciar
        //FrmLogin venLogin = new FrmLogin();
        
        // Mostrar
        //venLogin.setVisible(true);
        
        // Instanciar
        FrmPrincipal venMain = new FrmPrincipal();
        
        // Mostrar
        venMain.setVisible(false);
        
        // Instanciar
        FrmProducto venProd = new FrmProducto();
        
        // Mostrar
        venProd.setVisible(true);
    }
}
