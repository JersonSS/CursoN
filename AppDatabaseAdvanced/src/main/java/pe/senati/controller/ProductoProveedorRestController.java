package pe.senati.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Producto;
import pe.senati.entity.Proveedor;
import pe.senati.mapper.ProductoProveedorMapper;
import pe.senati.service.ProductoService;
import pe.senati.service.ProveedorService;
import pe.senati.util.UtilMapper;
import pe.senati.vo.ProductoProveedor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("api/producto_proveedor")
public class ProductoProveedorRestController 
{

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProveedorService proveedorService;

    public ProductoProveedorRestController() {}

    @GetMapping("/listar")
    public ResponseEntity<?> listar_GET() {

        Collection<Object[]> list = productoService.findAll_producto_proveedor();
        Collection<ProductoProveedorMapper> listMapper= UtilMapper.convertToProductosProveedores(list);

       return new ResponseEntity<>(listMapper, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrar_POST(@RequestBody ProductoProveedor productoProveedor) 
    {
        Producto productoDb = productoService.findById(productoProveedor.getProducto().getProducto_id());

        if (productoDb!=null) 
        {
            Proveedor proveedorDb = proveedorService.findById(productoProveedor.getProveedor().getProveedor_id());    

            if (proveedorDb!=null) 
            {
                productoDb.addProveedor(proveedorDb);
                productoService.update(productoDb);
                return new ResponseEntity<>("¡Producto - Proveedor registrado!", HttpStatus.CREATED);    
            }

            return new ResponseEntity<>("¡Error, proveedor no encontrado!", HttpStatus.NOT_FOUND);    
        }

        return new ResponseEntity<>("¡Error, producto no encontrado!", HttpStatus.NOT_FOUND);
    }
    
}
