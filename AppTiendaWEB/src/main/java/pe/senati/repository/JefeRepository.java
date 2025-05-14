package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Jefe;

@Repository
public interface JefeRepository extends JpaRepository<Jefe, Integer>
{

}
