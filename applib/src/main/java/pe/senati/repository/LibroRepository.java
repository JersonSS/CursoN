package pe.senati.repository;

import java.util.Collection;

import pe.senati.entity.Libro;

public interface LibroRepository 
{
    public abstract void insert(Libro libro);
    public abstract void update(Libro libro);
    public abstract void delete(Integer libro_id);
    public abstract Libro findById(Integer libro_id);
    public abstract Collection<Libro> findAll();
}
