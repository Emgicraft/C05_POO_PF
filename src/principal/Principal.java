package principal;

import controladores.Navegador;
import vistas.FrmLogin;
import vistas.FrmPrincipal;
import vistas.FrmProducto;

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
