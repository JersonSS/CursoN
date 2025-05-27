package pe.senati.util;

import java.util.ArrayList;
import java.util.Collection;

import pe.senati.entity.Autor;
import pe.senati.entity.Cliente;
import pe.senati.entity.CuentaCliente;
import pe.senati.entity.DetalleVenta;
import pe.senati.entity.Editorial;
import pe.senati.entity.Genero;
import pe.senati.entity.Libro;
import pe.senati.entity.Venta;
import pe.senati.mapper.AutorLibroMapper;
import pe.senati.mapper.AutorMapper;
import pe.senati.mapper.ClienteMapper;
import pe.senati.mapper.CuentaClienteMapper;
import pe.senati.mapper.DetalleVentaMapper;
import pe.senati.mapper.EditorialMapper;
import pe.senati.mapper.GeneroMapper;
import pe.senati.mapper.LibroGeneroMapper;
import pe.senati.mapper.LibroMapper;
import pe.senati.mapper.VentaMapper;

public class UtilMapper 
{

    public static Collection<AutorMapper> convertToAutores(Collection<Autor> collection)
    {
        Collection<AutorMapper> mapper = new ArrayList<>();

        for(Autor autor: collection) 
        {
            AutorMapper autorMapper = new AutorMapper(autor);
                
            mapper.add(autorMapper);
        }
            
        return mapper;
    }

    public static Collection<ClienteMapper> convertToClientes(Collection<Cliente> collection)
    {
        Collection<ClienteMapper> mapper = new ArrayList<>();

        for(Cliente cliente: collection) 
        {
            ClienteMapper clienteMapper = new ClienteMapper(cliente);
                
            mapper.add(clienteMapper);
        }
            
        return mapper;
    }

    public static Collection<CuentaClienteMapper> convertToCuentaClientes(Collection<CuentaCliente> collection)
    {
        Collection<CuentaClienteMapper> mapper = new ArrayList<>();

        for(CuentaCliente cuentaCliente: collection) 
        {
            CuentaClienteMapper cuentaClienteMapper = new CuentaClienteMapper(cuentaCliente);
                
            mapper.add(cuentaClienteMapper);
        }
            
        return mapper;
    }

    public static Collection<DetalleVentaMapper> convertToDetalleVentas(Collection<DetalleVenta> collection)
    {
        Collection<DetalleVentaMapper> mapper = new ArrayList<>();

        for(DetalleVenta detalleVenta: collection) 
        {
            DetalleVentaMapper detalleVentaMapper = new DetalleVentaMapper(detalleVenta);
                
            mapper.add(detalleVentaMapper);
        }
            
        return mapper;
    }

    public static Collection<EditorialMapper> convertToEditoriales(Collection<Editorial> collection)
    {
        Collection<EditorialMapper> mapper = new ArrayList<>();

        for(Editorial editorial: collection) 
        {
            EditorialMapper editorialMapper = new EditorialMapper(editorial);
                
            mapper.add(editorialMapper);
        }
            
        return mapper;
    }

    public static Collection<GeneroMapper> convertToGeneros(Collection<Genero> collection)
    {
        Collection<GeneroMapper> mapper = new ArrayList<>();

        for(Genero genero: collection) 
        {
            GeneroMapper generoMapper = new GeneroMapper(genero);
                
            mapper.add(generoMapper);
        }
            
        return mapper;
    }

    public static Collection<LibroMapper> convertToLibros(Collection<Libro> collection)
    {
        Collection<LibroMapper> mapper = new ArrayList<>();

        for(Libro libro: collection) 
        {
            LibroMapper libroMapper = new LibroMapper(libro);
                
            mapper.add(libroMapper);
        }
            
        return mapper;
    }

    public static Collection<VentaMapper> convertToVentas(Collection<Venta> collection)
    {
        Collection<VentaMapper> mapper = new ArrayList<>();

        for(Venta venta: collection) 
        {
            VentaMapper ventaMapper = new VentaMapper(venta);
                
            mapper.add(ventaMapper);
        }
            
        return mapper;
    }


    public static Collection<LibroGeneroMapper> convertToLibroGeneros(Collection<Object[]> collection) 
	{
		Collection<LibroGeneroMapper> mapper = new ArrayList<>();
		
		for(Object[] object:collection) 
		{
			LibroGeneroMapper libroGeneroMapper = new LibroGeneroMapper();
			
			Integer libro_id = Integer.parseInt(String.valueOf(object[0]));
			libroGeneroMapper.setLibro_id(libro_id);

			String libro = String.valueOf(object[1]);
			libroGeneroMapper.setLibro(libro);

			Integer genero_id = Integer.parseInt(String.valueOf(object[2]));
			libroGeneroMapper.setGenero_id(genero_id);

			String genero = String.valueOf(object[3]);
			libroGeneroMapper.setGenero(genero);

			mapper.add(libroGeneroMapper);
		}
		
		return mapper;
	}

    public static Collection<AutorLibroMapper> convertToAutoresLibros(Collection<Object[]> collection)
    {
        Collection<AutorLibroMapper> mapper = new ArrayList<>();

        for(Object[] object:collection)
        {
            AutorLibroMapper autorLibroMapper = new AutorLibroMapper();

            Integer autor_id = Integer.parseInt(String.valueOf(object[0]));
            autorLibroMapper.setAutor_id(autor_id);

            String autor = String.valueOf(object[1]);
            autorLibroMapper.setAutor(autor);

            Integer libro_id = Integer.parseInt(String.valueOf(object[2]));
            autorLibroMapper.setLibro_id(libro_id);

            String libro = String.valueOf(object[3]);
            autorLibroMapper.setLibro(libro);

            mapper.add(autorLibroMapper);
        }
        return mapper;
    }

}
