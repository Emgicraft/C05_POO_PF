package modelo;

/**
 *
 * @author Magh
 */
public class DTOProveedor {
    private int id;
    private String documento;
    private String nombreContacto;
    private String cargoContacto;
    private String infoContacto;
    private String medioContacto;
    private String paginaWeb;
    private String codigoPostal;

    public DTOProveedor() {}

    public DTOProveedor(int id, String documento, String nombreContacto, String cargoContacto, String infoContacto, String medioContacto, String paginaWeb, String codigoPostal) {
        this.id = id;
        this.documento = documento;
        this.nombreContacto = nombreContacto;
        this.cargoContacto = cargoContacto;
        this.infoContacto = infoContacto;
        this.medioContacto = medioContacto;
        this.paginaWeb = paginaWeb;
        this.codigoPostal = codigoPostal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
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

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
