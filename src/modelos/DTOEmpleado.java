package modelos;

import java.sql.Timestamp;

/**
 *
 * @author Magh
 */
public class DTOEmpleado {
    private int id;
    private int idPersona;
    private Timestamp fechaContratacion;
    private String cargo;
    private String departamento;
    private double salario;
    private String estadoContrato;
    private byte[] foto;
    private String fotoPath;
    private String comentarios;

    public DTOEmpleado() {}

    public DTOEmpleado(int id, int idPersona, Timestamp fechaContratacion, String cargo, String departamento, double salario, String estadoContrato, byte[] foto, String fotoPath, String comentarios) {
        this.id = id;
        this.idPersona = idPersona;
        this.fechaContratacion = fechaContratacion;
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
        this.estadoContrato = estadoContrato;
        this.foto = foto;
        this.fotoPath = fotoPath;
        this.comentarios = comentarios;
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

    public Timestamp getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Timestamp fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getFotoPath() {
        return fotoPath;
    }

    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
