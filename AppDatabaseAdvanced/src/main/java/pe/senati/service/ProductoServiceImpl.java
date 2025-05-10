package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Producto;
import pe.senati.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService
{

	public ProductoServiceImpl() {}
	
	@Autowired
	private ProductoRepository repository;
	
	@Override
	@Transactional
	public void insert(Producto producto) {
		repository.save(producto);		
	}

	@Override
	@Transactional
	public void update(Producto producto) {
		repository.save(producto);		
	}

	@Override
	@Transactional
	public void delete(Integer producto_id) {
		repository.deleteById(producto_id);	
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Integer producto_id) {
		return repository.findById(producto_id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Producto> findAll() {
		return repository.findAll();
	}

	@Override
	public Collection<Object[]> findAll_producto_proveedor() {
		return repository.findAll_producto_proveedor();
	}

	

}
