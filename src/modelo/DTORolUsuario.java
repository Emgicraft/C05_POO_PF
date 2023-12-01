package modelo;

/**
 *
 * @author Magh
 */
public class DTORolUsuario {
    private int id;
    private String nombreRol;
    private String descripcionRol;
    private int nivelAcceso;

    public DTORolUsuario() {}

    public DTORolUsuario(int id, String nombreRol, String descripcionRol, int nivelAcceso) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcionRol = descripcionRol;
        this.nivelAcceso = nivelAcceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
