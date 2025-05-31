package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>
{
    @Query(value = "select count(*) \"count\" \n" + //
				"from clientes c \n" + //
				"inner join ventas v on c.cliente_id = v.cliente_id\n" + //
				"where c.cliente_id=:cliente_id AND v.entregado = false", nativeQuery = true)
	public abstract int isDelete(Integer cliente_id);
}
