package pe.senati.util;

import java.util.ArrayList;
import java.util.Collection;

import pe.senati.entity.Categoria;
import pe.senati.mapper.CategoriaMapper;

public class UtilMapper 
{
	public static Collection<CategoriaMapper> convertToCategorias(Collection<Categoria> collection) 
	{
		Collection<CategoriaMapper> mapper = new ArrayList<>();
		
		for(Categoria categoria:collection) 
		{
			CategoriaMapper categoriaMapper = new CategoriaMapper(categoria);
			
			mapper.add(categoriaMapper);
		}
		
		return mapper;
	}
}
