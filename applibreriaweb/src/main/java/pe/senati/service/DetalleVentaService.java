package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.DetalleVenta;

public interface DetalleVentaService 
{
    public abstract void insert(DetalleVenta detalleVenta);
    public abstract void update(DetalleVenta detalleVenta);
    public abstract void delete(Integer detalleVenta_id);
    public abstract DetalleVenta findById(Integer detalleVenta_id);
    public abstract Collection<DetalleVenta> findAll();
}
