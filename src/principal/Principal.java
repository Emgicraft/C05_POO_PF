package principal;

import controlador.Navegador;
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
public class Principal implements Navegador {
    private javax.swing.JFrame frmActual;
    
    /**
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.mostrarFrmLogin();
    }
    
    /**
     * Muestra al FrmLogin y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmLogin() {
        FrmLogin frmLogin = new FrmLogin(Principal.this);
        frmActual = frmLogin;
        frmLogin.setVisible(true);
    }
    
    /**
     * Muestra al FrmPrincipal y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmPrincipal() {
        FrmPrincipal frmPrincipal = new FrmPrincipal(Principal.this);
        frmActual = frmPrincipal;
        frmPrincipal.setVisible(true);
    }
    
    /**
     * Muestra al FrmProducto y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmProducto() {
        FrmProducto frmProducto = new FrmProducto(Principal.this);
        frmActual = frmProducto;
        frmProducto.setVisible(true);
    }
}
