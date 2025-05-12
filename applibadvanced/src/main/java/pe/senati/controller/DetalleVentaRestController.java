package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.DetalleVenta;
import pe.senati.service.DetalleVentaService;

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
@RequestMapping("api/detalleVenta")
public class DetalleVentaRestController 
{

    public DetalleVentaRestController() {}

    @Autowired
    private DetalleVentaService detalleVentaService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<DetalleVenta> list= detalleVentaService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody DetalleVenta detalleVenta) {
        detalleVentaService.insert(detalleVenta);
        return new ResponseEntity<>("¡DetalleVenta registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{detalleVenta_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer detalleVenta_id, @RequestBody DetalleVenta detalleVenta) {
        DetalleVenta detalleVentaDb= detalleVentaService.findById(detalleVenta_id);

        if (detalleVentaDb != null) 
        {
            detalleVentaDb.setCantidad(detalleVenta.getCantidad());
            detalleVentaDb.setPrecioUnitario(detalleVenta.getPrecioUnitario());
            detalleVentaDb.setSubtotal(detalleVenta.getSubtotal());
            
            detalleVentaService.update(detalleVentaDb);
            return new ResponseEntity<>("¡DetalleVenta actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, detalleVenta no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{detalleVenta_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer detalleVenta_id) {
        DetalleVenta detalleVentaDb= detalleVentaService.findById(detalleVenta_id);

        if (detalleVentaDb != null) 
        {
            detalleVentaService.delete(detalleVenta_id);
            return new ResponseEntity<>("¡DetalleVenta Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, detalleVenta no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{detalleVenta_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer detalleVenta_id) {
        
        DetalleVenta detalleVentaDb = detalleVentaService.findById(detalleVenta_id);

        if (detalleVentaDb != null) 
        {
            return new ResponseEntity<>(detalleVentaDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, detalleVenta no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}