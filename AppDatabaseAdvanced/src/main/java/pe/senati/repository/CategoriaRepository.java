package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>
{

}
