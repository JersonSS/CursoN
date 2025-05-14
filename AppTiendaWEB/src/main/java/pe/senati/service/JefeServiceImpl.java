package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Jefe;
import pe.senati.repository.JefeRepository;


@Service
public class JefeServiceImpl implements JefeService
{
	@Autowired
	private JefeRepository repository;
	
	public JefeServiceImpl() {}
	
	@Override
	@Transactional
	public void insert(Jefe jefe) {
		repository.save(jefe);
	}

	@Override
	@Transactional
	public void update(Jefe jefe) {
		repository.save(jefe);		
	}

	@Override
	@Transactional
	public void delete(Integer jefe_id) {
		repository.deleteById(jefe_id);		
	}

	@Override
	@Transactional(readOnly=true)
	public Jefe findById(Integer jefe_id) {
		return repository.findById(jefe_id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Jefe> findAll() {
		return repository.findAll();
	}
}
