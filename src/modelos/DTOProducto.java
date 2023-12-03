package modelos;

import java.math.BigDecimal;

/**
 *
 * @author Magh
 */
public class DTOProducto {
    private int id;
    private int idCategoria;
    private Integer idTipo; // Puede ser null
    private String codigo;
    private String marca;
    private String descripcion;
    private String caracteristicas;
    private BigDecimal precioUnitario;
    private int stock;
    private boolean descontinuado;

    public DTOProducto() {}

    public DTOProducto(int id, int idCategoria, Integer idTipo, String codigo, String marca, String descripcion, String caracteristicas, BigDecimal precioUnitario, int stock, boolean descontinuado) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.idTipo = idTipo;
        this.codigo = codigo;
        this.marca = marca;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.descontinuado = descontinuado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isDescontinuado() {
        return descontinuado;
    }

    public void setDescontinuado(boolean descontinuado) {
        this.descontinuado = descontinuado;
    }
}
