package pe.senati.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.senati.entity.Libro;
import pe.senati.entity.Autor;
import pe.senati.mapper.AutorLibroMapper;
import pe.senati.service.AutorService;
import pe.senati.service.LibroService;
import pe.senati.util.UtilMapper;
import pe.senati.vo.AutorLibro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/autor_libro")
public class AutorLibroRestController 
{
    @Autowired
    private AutorService autorService;

    @Autowired
    private LibroService libroService;


    public AutorLibroRestController() {}

     @GetMapping("/listar")
    public ResponseEntity<?> listar_GET() 
    {
        Collection<Object[]> list = autorService.findAll_autor_libro();
        Collection<AutorLibroMapper> listMapper = UtilMapper.convertToAutoresLibros(list);
        return new ResponseEntity<>(listMapper, HttpStatus.OK);
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrar_POST(@RequestBody AutorLibro autorLibro) 
    {
         Autor autorDb = autorService.findById(autorLibro.getAutor().getAutor_id());

        if (autorDb!=null) 
        {
            Libro libroDb = libroService.findById(autorLibro.getLibro().getLibro_id());    

            if (libroDb!=null) 
            {
                autorDb.addLibro(libroDb);
                autorService.update(autorDb);
                return new ResponseEntity<>("¡Autor - Libro registrado!", HttpStatus.CREATED);    
            }

            return new ResponseEntity<>("¡Error, libro no encontrado!", HttpStatus.NOT_FOUND);    
        }

        return new ResponseEntity<>("¡Error, autor no encontrado!", HttpStatus.NOT_FOUND);
    }
    
    
}
