package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>
{
	@Query(value = "select count(*) \"count\" \n" + //
				"from categorias c \n" + //
				"inner join productos p on c.categoria_id=p.categoria_id\n" + //
				"where c.categoria_id=:categoria_id", nativeQuery = true)
	public abstract int isDelete(Integer categoria_id);
}
