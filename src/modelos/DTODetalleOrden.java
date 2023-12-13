package modelos;

import java.math.BigDecimal;

/**
 *
 * @author Magh
 */
public class DTODetalleOrden {
    private int idOrden;
    private int idProducto;
    private BigDecimal precioUnitario;
    private int cantidad;
    private BigDecimal descuento;

    public DTODetalleOrden() {}

    public DTODetalleOrden(int idOrden, int idProducto, BigDecimal precioUnitario, int cantidad, BigDecimal descuento) {
        this.idOrden = idOrden;
        this.idProducto = idProducto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
}
