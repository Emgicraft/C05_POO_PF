package modelos;

import java.sql.Timestamp;

/**
 *
 * @author Magh
 */
public class DTODatabaseBuildVersion {
    private byte id;
    private String dataBaseVersion;
    private Timestamp versionDate;
    private Timestamp modifiedDate;

    public DTODatabaseBuildVersion() {}

    public DTODatabaseBuildVersion(byte id, String dataBaseVersion, Timestamp versionDate, Timestamp modifiedDate) {
        this.id = id;
        this.dataBaseVersion = dataBaseVersion;
        this.versionDate = versionDate;
        this.modifiedDate = modifiedDate;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getDataBaseVersion() {
        return dataBaseVersion;
    }

    public void setDataBaseVersion(String dataBaseVersion) {
        this.dataBaseVersion = dataBaseVersion;
    }

    public Timestamp getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(Timestamp versionDate) {
        this.versionDate = versionDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
