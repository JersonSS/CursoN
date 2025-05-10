package pe.senati.util;

import java.util.ArrayList;
import java.util.Collection;

import pe.senati.entity.Categoria;
import pe.senati.entity.Producto;
import pe.senati.mapper.CategoriaMapper;
import pe.senati.mapper.ProductoMapper;
import pe.senati.mapper.ProductoProveedorMapper;

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

	public static Collection<ProductoMapper> convertToProductos(Collection<Producto> collection) 
	{
		Collection<ProductoMapper> mapper = new ArrayList<>();
		
		for(Producto categoria:collection) 
		{
			ProductoMapper productoMapper = new ProductoMapper(categoria);
			
			mapper.add(productoMapper);
		}
		
		return mapper;
	}

	public static Collection<ProductoProveedorMapper> convertToProductosProveedores(Collection<Object[]> collection) 
	{
		Collection<ProductoProveedorMapper> mapper = new ArrayList<>();
		
		for(Object[] object:collection) 
		{
			ProductoProveedorMapper ppMapper = new ProductoProveedorMapper();
			
			Integer producto_id = Integer.parseInt(String.valueOf(object[0]));
			ppMapper.setProducto_id(producto_id);

			String producto = String.valueOf(object[1]);
			ppMapper.setProducto(producto);

			Integer proveedor_id = Integer.parseInt(String.valueOf(object[2]));
			ppMapper.setProveedor_id(proveedor_id);

			String proveedor = String.valueOf(object[3]);
			ppMapper.setProveedor(proveedor);

			mapper.add(ppMapper);
		}
		
		return mapper;
	}
}
