package pe.senati.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Producto;
import pe.senati.service.ProductoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/producto")
public class ProductoRestController 
{
    @Autowired
    private ProductoService productoService;

    public ProductoRestController() {}

    @GetMapping("/listar")
    public ResponseEntity<?> listar_GET()
    {
        Collection<Producto> list= productoService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Producto producto) {
        productoService.insert(producto);
        return new ResponseEntity<>("¡Producto registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{producto_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer producto_id, @RequestBody Producto producto) {
        Producto productoDb= productoService.findById(producto_id);

        if (productoDb != null) 
        {
            productoDb.setNombre(producto.getNombre());
            productoDb.setMarca(producto.getMarca());
            productoDb.setPrecio(producto.getPrecio());
            productoDb.setFfabricacion(producto.getFfabricacion());
            productoDb.setFvencimiento(producto.getFvencimiento());
            productoDb.setStock(producto.getStock());
            
            productoService.update(productoDb);
            return new ResponseEntity<>("¡Producto actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, producto no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{producto_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer producto_id) {
        Producto productoDb= productoService.findById(producto_id);

        if (productoDb != null) 
        {
            productoService.delete(producto_id);
            return new ResponseEntity<>("¡Producto Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, producto no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{producto_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer producto_id) {
        
        Producto productoDb = productoService.findById(producto_id);

        if (productoDb != null) 
        {
            return new ResponseEntity<>(productoDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, producto no encontrado!", HttpStatus.NOT_FOUND);
    }
    
    
}
