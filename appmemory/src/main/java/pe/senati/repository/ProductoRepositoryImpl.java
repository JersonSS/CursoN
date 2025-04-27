package pe.senati.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import pe.senati.entity.Producto;

@Repository //operacion con la base de datos
public class ProductoRepositoryImpl implements ProductoRepository
{
    //tabla virtual
    private static final Map<Integer, Producto> tbl_productos= new HashMap<>();
    static
    {
        //productos
        Producto producto1 = new Producto(1021, "Chocolates", "Donofrio", 14.99, LocalDate.of(2025, 2, 10), LocalDate.of(2026, 2, 10), 100);
        Producto producto2 = new Producto(1022, "Caramelos", "Arcor", 12.99, LocalDate.of(2025, 4, 12), LocalDate.of(2026, 12, 14), 140);
        Producto producto3 = new Producto(1023, "Bombones", "Donofrio", 15.99, LocalDate.of(2025, 10, 20), LocalDate.of(2026, 11, 30), 120);
        Producto producto4 = new Producto(1024, "Galletas", "Alicorp", 17.99, LocalDate.of(2025, 5, 11), LocalDate.of(2026, 1, 21), 150);

        //productos guardados
        tbl_productos.put(producto1.getProducto_id(), producto1);
        tbl_productos.put(producto2.getProducto_id(), producto2);
        tbl_productos.put(producto3.getProducto_id(), producto3);
        tbl_productos.put(producto4.getProducto_id(), producto4);

    }

    public ProductoRepositoryImpl() {}


    @Override
    public void insert(Producto producto) {
        Integer producto_id=tbl_productos.size()+1021;
		producto.setProducto_id(producto_id);
        
        tbl_productos.put(producto.getProducto_id(), producto);        
    }

    @Override
    public void update(Producto producto) {
        tbl_productos.put(producto.getProducto_id(), producto);        
    }


    @Override
    public void delete(Integer producto_id) {
        tbl_productos.remove(producto_id);        
    }

    @Override
    public Producto findById(Integer producto_id) {
        return tbl_productos.get(producto_id);
    }

    @Override
    public Collection<Producto> findAll() {
        return tbl_productos.values();
    }  

}
