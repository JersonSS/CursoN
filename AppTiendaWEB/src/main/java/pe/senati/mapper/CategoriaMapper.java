package pe.senati.mapper;

import pe.senati.entity.Categoria;

public class CategoriaMapper 
{
	private Integer  categoria_id;
	private String descripcion;
	private Integer jefe_id;
	
	public CategoriaMapper() {}

	public CategoriaMapper(Integer categoria_id, String descripcion, Integer jefe_id) {
		super();
		this.categoria_id = categoria_id;
		this.descripcion = descripcion;
		this.jefe_id = jefe_id;
	}
	
	public CategoriaMapper(Categoria categoria) {
		this(categoria.getCategoria_id(), categoria.getDescripcion(), categoria.getJefe().getJefe_id());
	}


	public Integer getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Integer categoria_id) {
		this.categoria_id = categoria_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getJefe_id() {
		return jefe_id;
	}

	public void setJefe_id(Integer jefe_id) {
		this.jefe_id = jefe_id;
	}
	
	
}
