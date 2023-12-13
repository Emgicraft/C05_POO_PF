package principal;

import controladores.Navegador;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import modelos.SQLDB;
import vistas.FrmCliente;
import vistas.FrmEmpleado;
import vistas.FrmLogin;
import vistas.FrmPrincipal;
import vistas.FrmProducto;
import vistas.FrmUsuario;

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
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Principal principal = new Principal();
                principal.iniciarSistema();
            }
        });
    }
    
    public void iniciarSistema() {
        // Muestra el formulario de login:
        mostrarFrmLogin();
        
        // Intenta establecer la conexión a la base de datos:
        boolean conexionExitosa;
        SQLDB sql = new SQLDB();
        try (Connection con = sql.conectar();) {
            con.close();
            conexionExitosa = true; // La conexión fue exitosa aunque no necesariamente su cierre.
        } catch (SQLException ex) {
            System.err.println("principal.Principal: Hubo un error al intentar cerrar la conexión.");
            Logger.getLogger(Principal.class.getName())
                  .log(Level.SEVERE, null, ex);
            conexionExitosa = false; // La conexión falló.
        }

        // Muestra el mensaje de error si la conexión no fue exitosa:
        if (!conexionExitosa) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    javax.swing.JOptionPane.showMessageDialog(frmActual, 
                    "No se pudo conectar a la base de datos:\n" + sql.getDatabaseName(), 
                    "Error de conexión a la base de datos", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }
    
    /**
     * Muestra al FrmLogin y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmLogin() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmLogin frmLogin = new FrmLogin(Principal.this);
                frmActual = frmLogin;
                frmLogin.setVisible(true);
            }
        });
    }
    
    /**
     * Muestra al FrmPrincipal y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmPrincipal() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmPrincipal frmPrincipal = new FrmPrincipal(Principal.this);
                frmActual = frmPrincipal;
                frmPrincipal.setVisible(true);
            }
        });
    }
    
    /**
     * Muestra al FrmProducto y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmProducto() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmProducto frmProducto = new FrmProducto(Principal.this);
                frmActual = frmProducto;
                frmProducto.setVisible(true);
            }
        });
    }
    
    /**
     * Muestra al FrmProducto y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmCliente() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmCliente frmCliente = new FrmCliente(Principal.this);
                frmActual = frmCliente;
                frmCliente.setVisible(true);
            }
        });
    }
    
    /**
     * Muestra al FrmProducto y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmUsuario() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmUsuario frmUsuario = new FrmUsuario(Principal.this);
                frmActual = frmUsuario;
                frmUsuario.setVisible(true);
            }
        });
    }
    
    /**
     * Muestra al FrmProducto y lo guarda como formulario actual.
     */
    @Override
    public void mostrarFrmEmpleado() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmEmpleado frmEmpleado = new FrmEmpleado(Principal.this);
                frmActual = frmEmpleado;
                frmEmpleado.setVisible(true);
            }
        });
    }
}
