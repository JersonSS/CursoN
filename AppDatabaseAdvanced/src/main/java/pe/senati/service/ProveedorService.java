package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Proveedor;

public interface ProveedorService 
{
    public abstract void insert(Proveedor proveedor);
    public abstract void update(Proveedor proveedor);
    public abstract void delete(Integer proveedor_id);
    public abstract Proveedor findById(Integer proveedor_id);
    public abstract Collection<Proveedor> findAll();
}
