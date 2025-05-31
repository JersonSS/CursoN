package pe.senati.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>
{
     @Query(value = "select l.libro_id, l.titulo AS libro, g.genero_id, g.nombre AS genero \n" + //
                "from libro_genero lg \n" + //
                "inner join libros l on l.libro_id = lg.libro_id \n" + //
                "inner join generos g on g.genero_id = lg.genero_id;", nativeQuery = true)
    public abstract Collection<Object[]> findAll_libro_genero();

    @Query(value = "SELECT count(*) \"count\" \n" + //
                "    FROM libros l\n" + //
                "    left join libro_genero lg ON lg.libro_id = l.libro_id\n" + //
                "    left join autor_libro al ON al.libro_id = l.libro_id\n" + //
                "    left join detalle_ventas dv ON dv.libro_id = l.libro_id\n" + //
                "    WHERE l.libro_id = :libro_id \n" + //
                "    AND (lg.libro_id IS NOT NULL OR al.libro_id IS NOT NULL OR dv.libro_id IS NOT NULL)", nativeQuery = true)
	public abstract int isDelete(Integer libro_id);

}
