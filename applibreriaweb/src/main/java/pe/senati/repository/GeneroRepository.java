package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>
{

     @Query(value = "SELECT count(*) \"count\" \n" + //
                "    FROM generos g\n" + //
                "    left join libro_genero lg ON lg.genero_id = g.genero_id\n" + //
                "    WHERE g.genero_id = :genero_id \n" + //
                "    AND lg.genero_id IS NOT NULL", nativeQuery = true)
    public abstract int isDelete(Integer genero_id);
}