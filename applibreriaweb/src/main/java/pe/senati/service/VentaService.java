package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Venta;

public interface VentaService 
{
    public abstract void insert(Venta venta);
    public abstract void update(Venta venta);
    public abstract void delete(Integer venta_id);
    public abstract Venta findById(Integer venta_id);
    public abstract Collection<Venta> findAll();

    public abstract int isDelete(Integer venta_id);
}
