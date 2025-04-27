package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.senati.entity.Producto;
import pe.senati.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService
{
    @Autowired
    private ProductoRepository repository;

    public ProductoServiceImpl() {}
    
    @Override
    public void insert(Producto producto) {
       repository.insert(producto);
    }

    @Override
    public void update(Producto producto) {
        repository.update(producto);        
    }

    @Override
    public void delete(Integer producto_id) {
        repository.delete(producto_id);        
    }
    
    @Override
    public Producto findById(Integer producto_id) {
        return repository.findById(producto_id);
    }
    
    @Override
    public Collection<Producto> findAll() {
        return repository.findAll();
    }
    
}
