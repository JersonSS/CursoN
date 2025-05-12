package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Genero;
import pe.senati.service.GeneroService;

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
@RequestMapping("api/genero")
public class GeneroRestController 
{

    public GeneroRestController() {}

    @Autowired
    private GeneroService generoService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<Genero> list= generoService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Genero genero) {
        generoService.insert(genero);
        return new ResponseEntity<>("¡Genero registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{genero_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer genero_id, @RequestBody Genero genero) {
        Genero generoDb= generoService.findById(genero_id);

        if (generoDb != null) 
        {
            generoDb.setNombre(genero.getNombre());
            generoDb.setDescripcion(genero.getDescripcion());
            
            generoService.update(generoDb);
            return new ResponseEntity<>("¡Genero actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, genero no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{genero_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer genero_id) {
        Genero generoDb= generoService.findById(genero_id);

        if (generoDb != null) 
        {
            generoService.delete(genero_id);
            return new ResponseEntity<>("¡Genero Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, genero no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{genero_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer genero_id) {
        
        Genero generoDb = generoService.findById(genero_id);

        if (generoDb != null) 
        {
            return new ResponseEntity<>(generoDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, genero no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}