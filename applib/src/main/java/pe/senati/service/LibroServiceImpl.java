package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.senati.entity.Libro;
import pe.senati.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService
{
    @Autowired
    private LibroRepository repository;

    public LibroServiceImpl() {}

    
    @Override
    public void insert(Libro libro) {
        repository.insert(libro);        
    }
    
    @Override
    public void update(Libro libro) {
        repository.update(libro);        
    }
    
    @Override
    public void delete(Integer libro_id) {
        repository.delete(libro_id);        
    }

    @Override
    public Libro findById(Integer libro_id) {
        return repository.findById(libro_id);
    }

    @Override
    public Collection<Libro> findAll() {
        return repository.findAll();
    }
    
}
