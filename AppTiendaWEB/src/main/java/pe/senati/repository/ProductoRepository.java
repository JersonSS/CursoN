package pe.senati.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> 
{
    @Query(value = "select pt.producto_id, pt.nombre AS producto, pr.proveedor_id, pr.nombre AS proveedor\n" + //
                "from productos_proveedores pp\n" + //
                "inner join productos pt on pt.producto_id = pp.producto_id\n" + //
                "inner join proveedores pr on pr.proveedor_id = pp.proveedor_id;", nativeQuery = true)
    public abstract Collection<Object[]> findAll_producto_proveedor();
	
}
