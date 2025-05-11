package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer>
{

}
