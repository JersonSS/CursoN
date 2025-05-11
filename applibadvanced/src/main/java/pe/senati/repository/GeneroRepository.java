package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>
{

}
