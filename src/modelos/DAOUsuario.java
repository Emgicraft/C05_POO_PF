package modelos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magh
 */
public class DAOUsuario {
    private final String nombreTabla = "USUARIO";
    private DTOUsuario dtoUsuario;

    public DAOUsuario() {}
    
    public DAOUsuario(DTOUsuario dtoUsuario) {
        this.dtoUsuario = dtoUsuario;
    }
    
    public int validarAcceso() {
        int nivelAcceso = -1;
        String ejecutarSP = "{call SP_VerificarAcceso(?, ?, 'Habilitado', ?)}";
        SQLDB sql = new SQLDB();
        
        try (Connection cn = sql.conectar(); CallableStatement st = cn.prepareCall(ejecutarSP)) {
            st.setString(1, dtoUsuario.getNombreUsuario());
            st.setString(2, dtoUsuario.getContrasenia());
            st.registerOutParameter(3, Types.INTEGER);
            st.execute();
            nivelAcceso = st.getInt(3);
            System.out.print("Nivel de acceso: ");
            System.out.println(nivelAcceso);
        } catch (SQLException ex) {
            System.err.println("modelos.DAOUsuario: Error al validar el acceso.\n\t" + ex);
            Logger.getLogger(SQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nivelAcceso;
    }
    
    public static int validarAcceso(String user, String password) {
        int nivelAcceso = -1;
        String ejecutarSP = "{call SP_VerificarAcceso(?, ?, 'Habilitado', ?)}";
        SQLDB sql = new SQLDB();
        
        try (Connection cn = sql.conectar(); CallableStatement st = cn.prepareCall(ejecutarSP)) {
            st.setString(1, user);
            st.setString(2, password);
            st.registerOutParameter(3, Types.INTEGER);
            st.execute();
            nivelAcceso = st.getInt(3);
            System.out.print("Nivel de acceso: ");
            System.out.println(nivelAcceso);
        } catch (SQLException ex) {
            System.err.println("modelos.DAOUsuario: Error al validar el acceso.\n\t" + ex);
            Logger.getLogger(SQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nivelAcceso;
    }
    
    public void leer() {
        SQLDB sql = new SQLDB();
        String consultaSql = "SELECT ID_Empleado, NombreUsuario, [ID Rol], Estado FROM "+nombreTabla+" WHERE TABLE_SCHEMA = 'dbo'";
        try (Connection cn = sql.conectar(); PreparedStatement st = cn.prepareStatement(consultaSql)) {
            try (ResultSet res = st.executeQuery()) {
                if (res.next()) {
                    dtoUsuario = new DTOUsuario(res.getInt("ID_Empleado"),
                                                res.getString("NombreUsuario"),
                                                res.getInt("[ID Rol]"),
                                                res.getString("Estado"));
                }
            }
        } catch (SQLException ex) {
            System.err.println("modelos.DAOUsuario: Error al intentar leer la tabla " + nombreTabla + ".\n\t" + ex);
            Logger.getLogger(SQLDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DTOUsuario getDtoUsuario() {
        return dtoUsuario;
    }

    public void setDtoUsuario(DTOUsuario dtoUsuario) {
        this.dtoUsuario = dtoUsuario;
    }
}
