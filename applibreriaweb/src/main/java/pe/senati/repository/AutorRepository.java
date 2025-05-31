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
    
    @Query(value = "SELECT count(*) \"count\" \n" + //
                "    FROM autores a\n" + //
                "    left join autor_libro al ON al.autor_id = a.autor_id\n" + //
                "    WHERE a.autor_id = :autor_id \n" + //
                "    AND al.autor_id IS NOT NULL", nativeQuery = true)
    public abstract int isDelete(Integer autor_id);
}