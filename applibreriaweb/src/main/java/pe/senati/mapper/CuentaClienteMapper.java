package pe.senati.mapper;

import java.time.LocalDate;

import pe.senati.entity.CuentaCliente;

public class CuentaClienteMapper 
{
    private Integer cuenta_id;
    private String usuario;
    private String clave;
    private LocalDate fechaRegistro;
    private Integer cliente_id;

    public CuentaClienteMapper() {}

    public CuentaClienteMapper(Integer cuenta_id, String usuario, String clave, LocalDate fechaRegistro,
            Integer cliente_id) {
        this.cuenta_id = cuenta_id;
        this.usuario = usuario;
        this.clave = clave;
        this.fechaRegistro = fechaRegistro;
        this.cliente_id = cliente_id;
    }

    public CuentaClienteMapper(CuentaCliente cuentaCliente) {
        this(cuentaCliente.getCuenta_id(), cuentaCliente.getUsuario(), cuentaCliente.getClave(), cuentaCliente.getFechaRegistro(), cuentaCliente.getCliente().getCliente_id());
    }

    public Integer getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(Integer cuenta_id) {
        this.cuenta_id = cuenta_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    
}
