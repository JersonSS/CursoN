package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.DetalleVenta;
import pe.senati.repository.DetalleVentaRepository;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService
{

    public DetalleVentaServiceImpl() {}

    @Autowired
    private DetalleVentaRepository repository;


    @Override
    @Transactional
    public void insert(DetalleVenta detalleVenta) {
        repository.save(detalleVenta);
    }

    @Override
    @Transactional
    public void update(DetalleVenta detalleVenta) {
        repository.save(detalleVenta);
    }

    @Override
    @Transactional
    public void delete(Integer detalleVenta_id) {
        repository.deleteById(detalleVenta_id);
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleVenta findById(Integer detalleVenta_id) {    
        return repository.findById(detalleVenta_id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<DetalleVenta> findAll() {
        return repository.findAll();
    }
   
}