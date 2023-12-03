package modelos;

/**
 *
 * @author Magh
 */
public class DTOCliente {
    private int id;
    private int idPersona;
    private String infoContacto;
    private String medioContacto;

    public DTOCliente() {}

    public DTOCliente(int id, int idPersona, String infoContacto, String medioContacto) {
        this.id = id;
        this.idPersona = idPersona;
        this.infoContacto = infoContacto;
        this.medioContacto = medioContacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getInfoContacto() {
        return infoContacto;
    }

    public void setInfoContacto(String infoContacto) {
        this.infoContacto = infoContacto;
    }

    public String getMedioContacto() {
        return medioContacto;
    }

    public void setMedioContacto(String medioContacto) {
        this.medioContacto = medioContacto;
    }
}
