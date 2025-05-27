package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Venta;
import pe.senati.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService
{

    public VentaServiceImpl() {}

    @Autowired
    private VentaRepository repository;


    @Override
    @Transactional
    public void insert(Venta venta) {
        repository.save(venta);
    }

    @Override
    @Transactional
    public void update(Venta venta) {
        repository.save(venta);
    }

    @Override
    @Transactional
    public void delete(Integer venta_id) {
        repository.deleteById(venta_id);
    }

    @Override
    @Transactional(readOnly = true)
    public Venta findById(Integer venta_id) {    
        return repository.findById(venta_id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Venta> findAll() {
        return repository.findAll();
    }
   
}