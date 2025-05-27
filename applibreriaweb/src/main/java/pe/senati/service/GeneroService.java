package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Genero;

public interface GeneroService 
{
    public abstract void insert(Genero genero);
    public abstract void update(Genero genero);
    public abstract void delete(Integer genero_id);
    public abstract Genero findById(Integer genero_id);
    public abstract Collection<Genero> findAll();
}
