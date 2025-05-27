package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Genero;
import pe.senati.repository.GeneroRepository;

@Service
public class GeneroServiceImpl implements GeneroService
{

    public GeneroServiceImpl() {}

    @Autowired
    private GeneroRepository repository;


    @Override
    @Transactional
    public void insert(Genero genero) {
        repository.save(genero);
    }

    @Override
    @Transactional
    public void update(Genero genero) {
        repository.save(genero);
    }

    @Override
    @Transactional
    public void delete(Integer genero_id) {
        repository.deleteById(genero_id);
    }

    @Override
    @Transactional(readOnly = true)
    public Genero findById(Integer genero_id) {    
        return repository.findById(genero_id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Genero> findAll() {
        return repository.findAll();
    }
   
}