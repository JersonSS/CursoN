package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Editorial;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer>
{
    @Query(value = "SELECT count(*) \"count\"\n" + //
                "    FROM editoriales e\n" + //
                "    INNER JOIN libros v ON v.editorial_id = e.editorial_id\n" + //
                "    WHERE e.editorial_id = :editorial_id", nativeQuery = true)
	public abstract int isDelete(Integer editorial_id);
}
