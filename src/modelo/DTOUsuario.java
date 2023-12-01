package modelo;

/**
 *
 * @author Magh
 */
public class DTOUsuario {
    private int id; // Es una relación identificativa, por tanto, ID_Usuario = ID_Empleado
    private String nombreUsuario;
    private String contrasenia;
    private int idRol;
    private String estado;

    public DTOUsuario() {}

    public DTOUsuario(int id, String nombreUsuario, String contrasenia, int idRol, String estado) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.idRol = idRol;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
