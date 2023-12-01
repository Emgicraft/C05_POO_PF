package modelo;

import java.sql.Timestamp;

/**
 *
 * @author Magh
 */
public class DTOEmpresa {
    private byte id;
    private String ruc;
    private String razonSocial;
    private String nombreComercial;
    private byte[] logo;
    private String logoPath;
    private String versionInformacion;
    private Timestamp fechaVersion;
    private Timestamp fechaModificacion;

    public DTOEmpresa() {}

    public DTOEmpresa(byte idInformacion, String ruc, String razonSocial, String nombreComercial, byte[] logo, String logoPath, String versionInformacion, Timestamp fechaVersion, Timestamp fechaModificacion) {
        this.id = idInformacion;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
        this.logo = logo;
        this.logoPath = logoPath;
        this.versionInformacion = versionInformacion;
        this.fechaVersion = fechaVersion;
        this.fechaModificacion = fechaModificacion;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getVersionInformacion() {
        return versionInformacion;
    }

    public void setVersionInformacion(String versionInformacion) {
        this.versionInformacion = versionInformacion;
    }

    public Timestamp getFechaVersion() {
        return fechaVersion;
    }

    public void setFechaVersion(Timestamp fechaVersion) {
        this.fechaVersion = fechaVersion;
    }

    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
