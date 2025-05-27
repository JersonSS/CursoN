package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.CuentaCliente;

@Repository
public interface CuentaClienteRepository extends JpaRepository<CuentaCliente, Integer>
{

}
