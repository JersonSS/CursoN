package pe.senati.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Jefe;
import pe.senati.service.JefeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/jefe")
public class JefeRestController 
{
    @Autowired
    private JefeService jefeService;

    public JefeRestController() {}

    @GetMapping("/listar")
    public ResponseEntity<?> listar_GET()
    {
        Collection<Jefe> list= jefeService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Jefe jefe) {
        jefeService.insert(jefe);
        return new ResponseEntity<>("¡Jefe registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{jefe_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer jefe_id, @RequestBody Jefe jefe) {
        Jefe jefeDb= jefeService.findById(jefe_id);

        if (jefeDb != null) 
        {
            jefeDb.setNombre(jefe.getNombre());
            jefeDb.setCelular(jefe.getCelular());
            jefeDb.setNacionalidad(jefe.getNacionalidad());
            
            jefeService.update(jefeDb);
            return new ResponseEntity<>("¡Jefe actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, jefe no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{jefe_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer jefe_id) {
        Jefe jefeDb= jefeService.findById(jefe_id);

        if (jefeDb != null) 
        {
            jefeService.delete(jefe_id);
            return new ResponseEntity<>("¡Jefe Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, jefe no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{jefe_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer jefe_id) {
        
        Jefe jefeDb = jefeService.findById(jefe_id);

        if (jefeDb != null) 
        {
            return new ResponseEntity<>(jefeDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, jefe no encontrado!", HttpStatus.NOT_FOUND);
    }
    
    
}
