package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Autor;
import pe.senati.mapper.AutorMapper;
import pe.senati.service.AutorService;
import pe.senati.util.UtilMapper;

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
@RequestMapping("api/autor")
public class AutorRestController 
{

    public AutorRestController() {}

    @Autowired
    private AutorService autorService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<Autor> list = autorService.findAll();
        Collection<AutorMapper> listMapper = UtilMapper.convertToAutores(list);
        return new ResponseEntity<>(listMapper, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Autor autor) {
        autorService.insert(autor);
        return new ResponseEntity<>("¡Autor registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{autor_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer autor_id, @RequestBody Autor autor) {
        Autor autorDb= autorService.findById(autor_id);

        if (autorDb != null) 
        {
            autorDb.setNombre(autor.getNombre());
            autorDb.setApellido(autor.getApellido());
            autorDb.setNacionalidad(autor.getNacionalidad());
            autorDb.setFechaNacimiento(autor.getFechaNacimiento());
            
            autorService.update(autorDb);
            return new ResponseEntity<>("¡Autor actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, autor no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{autor_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer autor_id) {
        Autor autorDb= autorService.findById(autor_id);

        if (autorDb != null) 
        {
            autorService.delete(autor_id);
            return new ResponseEntity<>("¡Autor Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, autor no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{autor_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer autor_id) {
        
        Autor autorDb = autorService.findById(autor_id);
        AutorMapper autorMapper = new AutorMapper(autorDb);

        if (autorDb != null) 
        {
            return new ResponseEntity<>(autorMapper, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, autor no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}