package pe.senati.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Proveedor;
import pe.senati.service.ProveedorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorRestController 
{
    @Autowired
    private ProveedorService proveedorService;

    public ProveedorRestController() {}

    @GetMapping("/listar")
    public ResponseEntity<?> listar_GET()
    {
        Collection<Proveedor> list= proveedorService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Proveedor proveedor) {
        proveedorService.insert(proveedor);
        return new ResponseEntity<>("¡Proveedor registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{proveedor_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer proveedor_id, @RequestBody Proveedor proveedor) {
        Proveedor proveedorDb= proveedorService.findById(proveedor_id);

        if (proveedorDb != null) 
        {
            proveedorDb.setNombre(proveedor.getNombre());
            proveedorDb.setTelefono(proveedor.getTelefono());
            proveedorDb.setWebsite(proveedor.getWebsite());
            proveedorDb.setRuc(proveedor.getRuc());
            
            proveedorService.update(proveedorDb);
            return new ResponseEntity<>("¡Proveedor actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, proveedor no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{proveedor_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer proveedor_id) {
        Proveedor proveedorDb= proveedorService.findById(proveedor_id);

        if (proveedorDb != null) 
        {
            proveedorService.delete(proveedor_id);
            return new ResponseEntity<>("¡Proveedor Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, proveedor no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{proveedor_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer proveedor_id) {
        
        Proveedor proveedorDb = proveedorService.findById(proveedor_id);

        if (proveedorDb != null) 
        {
            return new ResponseEntity<>(proveedorDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, proveedor no encontrado!", HttpStatus.NOT_FOUND);
    }
    
    
}
