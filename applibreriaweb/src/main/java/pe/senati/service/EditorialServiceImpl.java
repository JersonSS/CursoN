package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Editorial;
import pe.senati.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService
{

    public EditorialServiceImpl() {}

    @Autowired
    private EditorialRepository repository;


    @Override
    @Transactional
    public void insert(Editorial editorial) {
        repository.save(editorial);
    }

    @Override
    @Transactional
    public void update(Editorial editorial) {
        repository.save(editorial);
    }

    @Override
    @Transactional
    public void delete(Integer editorial_id) {
        repository.deleteById(editorial_id);
    }

    @Override
    @Transactional(readOnly = true)
    public Editorial findById(Integer editorial_id) {    
        return repository.findById(editorial_id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Editorial> findAll() {
        return repository.findAll();
    }

    @Override
    public int isDelete(Integer editorial_id) {
        return repository.isDelete(editorial_id);
    }
   
}