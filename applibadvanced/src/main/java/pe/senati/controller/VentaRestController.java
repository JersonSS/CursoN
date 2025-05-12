package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Venta;
import pe.senati.service.VentaService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/venta")
public class VentaRestController 
{

    public VentaRestController() {}

    @Autowired
    private VentaService ventaService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<Venta> list= ventaService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Venta venta) {
        ventaService.insert(venta);
        return new ResponseEntity<>("¡Venta registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{venta_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer venta_id, @RequestBody Venta venta) {
        Venta ventaDb= ventaService.findById(venta_id);

        if (ventaDb != null) 
        {
            ventaDb.setTotal(venta.getTotal());
            ventaDb.setFechaVenta(venta.getFechaVenta());
            
            ventaService.update(ventaDb);
            return new ResponseEntity<>("¡Venta actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, venta no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{venta_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer venta_id) {
        Venta ventaDb= ventaService.findById(venta_id);

        if (ventaDb != null) 
        {
            ventaService.delete(venta_id);
            return new ResponseEntity<>("¡Venta Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, venta no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{venta_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer venta_id) {
        
        Venta ventaDb = ventaService.findById(venta_id);

        if (ventaDb != null) 
        {
            return new ResponseEntity<>(ventaDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, venta no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}