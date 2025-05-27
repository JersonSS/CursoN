package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Editorial;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer>
{

}
