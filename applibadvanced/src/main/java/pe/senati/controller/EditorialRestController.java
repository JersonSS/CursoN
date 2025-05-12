package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Editorial;
import pe.senati.service.EditorialService;

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
@RequestMapping("api/editorial")
public class EditorialRestController 
{

    public EditorialRestController() {}

    @Autowired
    private EditorialService editorialService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<Editorial> list= editorialService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Editorial editorial) {
        editorialService.insert(editorial);
        return new ResponseEntity<>("¡Editorial registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{editorial_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer editorial_id, @RequestBody Editorial editorial) {
        Editorial editorialDb= editorialService.findById(editorial_id);

        if (editorialDb != null) 
        {
            editorialDb.setNombre(editorial.getNombre());
            editorialDb.setPais(editorial.getPais());
            
            editorialService.update(editorialDb);
            return new ResponseEntity<>("¡Editorial actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, editorial no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{editorial_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer editorial_id) {
        Editorial editorialDb= editorialService.findById(editorial_id);

        if (editorialDb != null) 
        {
            editorialService.delete(editorial_id);
            return new ResponseEntity<>("¡Editorial Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, editorial no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{editorial_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer editorial_id) {
        
        Editorial editorialDb = editorialService.findById(editorial_id);

        if (editorialDb != null) 
        {
            return new ResponseEntity<>(editorialDb, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, editorial no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}