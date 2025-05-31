package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.CuentaCliente;

public interface CuentaClienteService 
{
    public abstract void insert(CuentaCliente cuentaCliente);
    public abstract void update(CuentaCliente cuentaCliente);
    public abstract void delete(Integer cuentaCliente_id);
    public abstract CuentaCliente findById(Integer cuentaCliente_id);
    public abstract Collection<CuentaCliente> findAll();

    public abstract int isDelete(Integer cuenta_cliente_id);
}
