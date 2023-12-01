package modelo;

import java.sql.Date;

/**
 *
 * @author Magh
 */
public class DTOPersona {
    private int id;
    private String documento;
    private String nombre;
    private String apellido;
    private boolean tipo;
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;
    private String email;
    private String codigoPostal;
    private Date fechaNacimiento;

    public DTOPersona() {}

    public DTOPersona(int id, String documento, String nombre, String apellido, boolean tipo, String direccion, String distrito, String provincia, String departamento, String email, String codigoPostal, Date fechaNacimiento) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.direccion = direccion;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.email = email;
        this.codigoPostal = codigoPostal;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
