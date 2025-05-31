package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.CuentaCliente;

@Repository
public interface CuentaClienteRepository extends JpaRepository<CuentaCliente, Integer>
{
    @Query(value = "select count(*) \"count\" \n" + //
				"from cuenta_clientes cc \n" + //
				"inner join clientes c on c.cliente_id = cc.cuenta_id\n" + //
                "inner join ventas v on c.cliente_id = v.cliente_id\n" + //
				"where cc.cuenta_id=:cuenta_cliente_id AND v.entregado = false", nativeQuery = true)
	public abstract int isDelete(Integer cuenta_cliente_id);
}
