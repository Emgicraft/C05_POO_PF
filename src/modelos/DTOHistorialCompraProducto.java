package modelos;

import java.sql.Timestamp;

/**
 *
 * @author Magh
 */
public class DTOHistorialCompraProducto {
    private int idHCP;
    private int idProducto;
    private int idProveedor;
    private Timestamp fechaAdquisicion;
    private double precioCompra;
    private int cantidad;
    private String observacion;

    public DTOHistorialCompraProducto() {}

    public DTOHistorialCompraProducto(int idHCP, int idProducto, int idProveedor, Timestamp fechaAdquisicion, double precioCompra, int cantidad, String observacion) {
        this.idHCP = idHCP;
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.fechaAdquisicion = fechaAdquisicion;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.observacion = observacion;
    }

    public int getIdHCP() {
        return idHCP;
    }

    public void setIdHCP(int idHCP) {
        this.idHCP = idHCP;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Timestamp getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Timestamp fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
