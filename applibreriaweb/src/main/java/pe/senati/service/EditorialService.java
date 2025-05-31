package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Editorial;

public interface EditorialService 
{
    public abstract void insert(Editorial editorial);
    public abstract void update(Editorial editorial);
    public abstract void delete(Integer editorial_id);
    public abstract Editorial findById(Integer editorial_id);
    public abstract Collection<Editorial> findAll();
    public abstract int isDelete(Integer editorial_id);
}
