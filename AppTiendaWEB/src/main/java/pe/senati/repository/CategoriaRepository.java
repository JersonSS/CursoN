package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.senati.entity.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>
{
	@Query(value = "delete from categorias where categoria_id = :categoria_id", nativeQuery = true)
	public void delete2(Integer categoria_id);
}
