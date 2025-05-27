package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>
{

}
