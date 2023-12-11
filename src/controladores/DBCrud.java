package controladores;

//import java.sql.Connection;

/**
 *
 * @author Magh
 */
public abstract class DBCrud {
    //private Connection con;
    
    public abstract void crear();
    public abstract void leer();
    public abstract void actualizar();
    public abstract void eliminar();
}
