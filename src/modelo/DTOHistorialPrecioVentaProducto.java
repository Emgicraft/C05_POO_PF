package modelo;

import java.sql.Timestamp;

/**
 *
 * @author Magh
 */
public class DTOHistorialPrecioVentaProducto {
    private int idHistorial;
    private int idProducto;
    private double precioVenta;
    private Timestamp fechaDefinicion;

    public DTOHistorialPrecioVentaProducto() {}

    public DTOHistorialPrecioVentaProducto(int idHistorial, int idProducto, double precioVenta, Timestamp fechaDefinicion) {
        this.idHistorial = idHistorial;
        this.idProducto = idProducto;
        this.precioVenta = precioVenta;
        this.fechaDefinicion = fechaDefinicion;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Timestamp getFechaDefinicion() {
        return fechaDefinicion;
    }

    public void setFechaDefinicion(Timestamp fechaDefinicion) {
        this.fechaDefinicion = fechaDefinicion;
    }
}
