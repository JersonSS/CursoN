package pe.senati.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>
{
     @Query(value = "select a.autor_id, a.nombre AS autor, l.libro_id, l.titulo AS libro\n" + //
                "from autor_libro al\n" + //
                "inner join autores a on a.autor_id = al.autor_id\n" + //
                "inner join libros l on l.libro_id = al.libro_id;", nativeQuery = true) //
    public abstract Collection<Object[]> findAll_autor_libro();
}
