package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Jefe;

public interface JefeService 
{
     public abstract void insert(Jefe jefe);
	 public abstract void update(Jefe jefe);
	 public abstract void delete(Integer jefe_id);
	 public abstract Jefe findById(Integer jefe_id);
	 public abstract Collection<Jefe> findAll();
}
