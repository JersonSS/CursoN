package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Autor;
import pe.senati.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService
{

    public AutorServiceImpl() {}

    @Autowired
    private AutorRepository repository;


    @Override
    @Transactional
    public void insert(Autor autor) {
        repository.save(autor);
    }

    @Override
    @Transactional
    public void update(Autor autor) {
        repository.save(autor);
    }

    @Override
    @Transactional
    public void delete(Integer autor_id) {
        repository.deleteById(autor_id);
    }

    @Override
    @Transactional(readOnly = true)
    public Autor findById(Integer autor_id) {    
        return repository.findById(autor_id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Autor> findAll() {
        return repository.findAll();
    }
   
}