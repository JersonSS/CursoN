package pe.senati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Libro;
import pe.senati.mapper.LibroMapper;
import pe.senati.service.LibroService;
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
@RequestMapping("api/libro")
public class LibroRestController 
{

    public LibroRestController() {}

    @Autowired
    private LibroService libroService;


    @GetMapping("/listar")
    public  ResponseEntity<?> listar_GET() 
    {
        Collection<Libro> list= libroService.findAll();
        Collection<LibroMapper> listMapper = UtilMapper.convertToLibros(list);
        return new ResponseEntity<>(listMapper, HttpStatus.OK);
    }

     @PostMapping("/registrar")
    public  ResponseEntity<?> registrar_POST (@RequestBody Libro libro) {
        libroService.insert(libro);
        return new ResponseEntity<>("¡Libro registrado!", HttpStatus.CREATED);
    }

    @PutMapping("/editar/{libro_id}")
    public ResponseEntity<?> editar_PUT(@PathVariable Integer libro_id, @RequestBody Libro libro) {
        Libro libroDb= libroService.findById(libro_id);

        if (libroDb != null) 
        {
            libroDb.setTitulo(libro.getTitulo());
            libroDb.setDigital(libro.getDigital());
            libroDb.setEdicion(libro.getEdicion());
            libroDb.setNumeroPaginas(libro.getNumeroPaginas());
            libroDb.setStock(libro.getStock());
            libroDb.setPrecio(libro.getPrecio());
            libroDb.setFechaPublicacion(libro.getFechaPublicacion());
            libroDb.setFechaRegistro(libro.getFechaRegistro());
            
            libroService.update(libroDb);
            return new ResponseEntity<>("¡Libro actualizado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, libro no encontrado!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/borrar/{libro_id}")
    public ResponseEntity<?> eliminar_PUT(@PathVariable Integer libro_id) {
        Libro libroDb= libroService.findById(libro_id);

        if (libroDb != null) 
        {
            libroService.delete(libro_id);
            return new ResponseEntity<>("¡Libro Eliminado!", HttpStatus.OK);
        }

        return new ResponseEntity<>("¡Error, libro no encontrado!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/buscar/{libro_id}")
    public ResponseEntity<?> buscar_GET(@PathVariable Integer libro_id) {
        
        Libro libroDb = libroService.findById(libro_id);
        LibroMapper libroMapper = new LibroMapper(libroDb);

        if (libroDb != null) 
        {
            return new ResponseEntity<>(libroMapper, HttpStatus.FOUND);
        }

        return new ResponseEntity<>("¡Error, libro no encontrado!", HttpStatus.NOT_FOUND);
    }

    
}
