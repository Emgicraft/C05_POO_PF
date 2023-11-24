package principal;

import modelo.SQLDB;

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
        sql.conectar();
    }
}
