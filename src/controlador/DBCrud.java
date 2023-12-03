package controlador;

import java.sql.Connection;

/**
 *
 * @author Magh
 */
public abstract class DBCrud {
    private Connection con;
    
    public abstract void consultar();
    public abstract void leer();
    public abstract void actualizar();
    public abstract void eliminar();
}
