package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Proveedor;
import pe.senati.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{

    public ProveedorServiceImpl() {}
	
	@Autowired
	private ProveedorRepository repository;
	
	@Override
	@Transactional
	public void insert(Proveedor proveedor) {
		repository.save(proveedor);		
	}

	@Override
	@Transactional
	public void update(Proveedor proveedor) {
		repository.save(proveedor);		
	}

	@Override
	@Transactional
	public void delete(Integer proveedor_id) {
		repository.deleteById(proveedor_id);	
	}

	@Override
	@Transactional(readOnly = true)
	public Proveedor findById(Integer proveedor_id) {
		return repository.findById(proveedor_id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Proveedor> findAll() {
		return repository.findAll();
	}
}
