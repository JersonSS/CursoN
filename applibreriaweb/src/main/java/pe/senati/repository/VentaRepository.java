package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer>
{
    @Query(value = "select count(*) \"count\" \n" + //
				"from venta \n" + //
				"where venta_id=:venta_id AND entregado = false", nativeQuery = true)
	public abstract int isDelete(Integer venta_id);
}
