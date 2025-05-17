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

}
