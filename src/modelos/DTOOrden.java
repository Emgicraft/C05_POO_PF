package modelos;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author Magh
 */
public class DTOOrden {
    private int id;
    private int idEmpleado;
    private int idCliente;
    private Timestamp fechaOrden;
    private Timestamp fechaEntrega;
    private Timestamp fechaEnvio;
    private String direccionEnvio;
    private BigDecimal costoEnvio;
    private String estadoEnvio;

    public DTOOrden() {}

    public DTOOrden(int id, int idEmpleado, int idCliente, Timestamp fechaOrden, Timestamp fechaEntrega, Timestamp fechaEnvio, String direccionEnvio, BigDecimal costoEnvio, String estadoEnvio) {
        this.id = id;
        this.idEmpleado = idEmpleado;
        this.idCliente = idCliente;
        this.fechaOrden = fechaOrden;
        this.fechaEntrega = fechaEntrega;
        this.fechaEnvio = fechaEnvio;
        this.direccionEnvio = direccionEnvio;
        this.costoEnvio = costoEnvio;
        this.estadoEnvio = estadoEnvio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Timestamp getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Timestamp fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Timestamp getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Timestamp fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public BigDecimal getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(BigDecimal costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }
}
