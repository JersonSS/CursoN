package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>
{

}
