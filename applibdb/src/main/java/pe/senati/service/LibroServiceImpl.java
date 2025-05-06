package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Libro;
import pe.senati.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService
{

    public LibroServiceImpl() {}

    @Autowired
    private LibroRepository repository;


    @Override
    @Transactional
    public void insert(Libro libro) {
        repository.save(libro);
    }

    @Override
    @Transactional
    public void update(Libro libro) {
        repository.save(libro);
    }

    @Override
    @Transactional
    public void delete(Integer libro_id) {
        repository.deleteById(libro_id);
    }

    @Override
    @Transactional(readOnly = true)
    public Libro findById(Integer libro_id) {    
        return repository.findById(libro_id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Libro> findAll() {
        return repository.findAll();
    }
   
}
